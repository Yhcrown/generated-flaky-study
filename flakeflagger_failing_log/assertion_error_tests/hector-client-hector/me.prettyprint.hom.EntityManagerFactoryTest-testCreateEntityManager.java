@Test public void testCreateEntityManager(){
  EntityManager entityManager=entityManagerFactory.createEntityManager();
  assertNotNull(entityManager);
// --> Flaky assertion: possible message: ;     assertTrue(entityManagerFactory.isOpen());    
}
