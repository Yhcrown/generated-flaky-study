/** 
 * Test for a successful authentication. Also makes two additional calls to demonstrate nonce re-use with an incrementing nonce count.
 */
@Test public void testDigestSuccess() throws Exception {
  setAuthenticationChain();
  TestHttpClient client=new TestHttpClient();
  HttpGet get=new HttpGet(DefaultServer.getDefaultServerURL());
  HttpResponse result=client.execute(get);
  assertEquals(401,result.getStatusLine().getStatusCode());
  Header[] values=result.getHeaders(WWW_AUTHENTICATE.toString());
  assertEquals(1,values.length);
  String value=values[0].getValue();
  assertTrue(value.startsWith(DIGEST.toString()));
  Map<DigestWWWAuthenticateToken,String> parsedHeader=DigestWWWAuthenticateToken.parseHeader(value.substring(7));
  assertEquals(REALM_NAME,parsedHeader.get(DigestWWWAuthenticateToken.REALM));
  assertEquals(DigestAlgorithm.MD5.getToken(),parsedHeader.get(DigestWWWAuthenticateToken.ALGORITHM));
  assertEquals(DigestQop.AUTH.getToken(),parsedHeader.get(DigestWWWAuthenticateToken.MESSAGE_QOP));
  String clientNonce=createNonce();
  int nonceCount=1;
  String nonce=parsedHeader.get(DigestWWWAuthenticateToken.NONCE);
  String opaque=parsedHeader.get(DigestWWWAuthenticateToken.OPAQUE);
  assertNotNull(opaque);
  for (int i=0; i < 5; i++) {
    client=new TestHttpClient();
    get=new HttpGet(DefaultServer.getDefaultServerURL());
    int thisNonceCount=nonceCount++;
    String authorization=createAuthorizationLine("userOne","passwordOne","GET","/",nonce,thisNonceCount,clientNonce,opaque);
    get.addHeader(AUTHORIZATION.toString(),authorization);
    result=client.execute(get);
// --> Flaky assertion: possible message: expected:<200> but was:<401>;             assertEquals(200, result.getStatusLine().getStatusCode());
    values=result.getHeaders("ProcessedBy");
    assertEquals(1,values.length);
    assertEquals("ResponseHandler",values[0].getValue());
    assertSingleNotificationType(EventType.AUTHENTICATED);
    values=result.getHeaders("Authentication-Info");
    assertEquals(1,values.length);
    Map<AuthenticationInfoToken,String> parsedAuthInfo=AuthenticationInfoToken.parseHeader(values[0].getValue());
    assertEquals("Didn't expect a new nonce.",nonce,parsedAuthInfo.get(AuthenticationInfoToken.NEXT_NONCE));
    assertEquals(DigestQop.AUTH.getToken(),parsedAuthInfo.get(AuthenticationInfoToken.MESSAGE_QOP));
    String nonceCountString=toHex(thisNonceCount);
    assertEquals(createRspAuth("userOne",REALM_NAME,"passwordOne","/",nonce,nonceCountString,clientNonce),parsedAuthInfo.get(AuthenticationInfoToken.RESPONSE_AUTH));
    assertEquals(clientNonce,parsedAuthInfo.get(AuthenticationInfoToken.CNONCE));
    assertEquals(nonceCountString,parsedAuthInfo.get(AuthenticationInfoToken.NONCE_COUNT));
  }
}
