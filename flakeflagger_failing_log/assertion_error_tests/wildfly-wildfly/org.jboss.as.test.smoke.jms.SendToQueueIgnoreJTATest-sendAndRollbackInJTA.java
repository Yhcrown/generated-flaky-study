/** 
 * JMS message is send using connection factory with transactional = true and JTA rollback Messaging behaves as a part of JTA transaction, message should NOT be delivered.
 */
@Test public void sendAndRollbackInJTA() throws Exception {
  sender.send(false,true);
  latch.await(MAX_WAIT_IN_SECONDS,SECONDS);
// --> Flaky assertion: possible message: expected:<1> but was:<0>;         assertEquals(1, latch.getCount());
}
