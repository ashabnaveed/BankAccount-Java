import org.junit.Before;

class Main {
  public static void main(String[] args) {
    BankAccountTest t = new BankAccountTest();
    
    t.setUp();
    t.testToString();
    t.setUp();
    t.testAccessors();
    t.testMutators();
    t.testDeposits();
  }
}