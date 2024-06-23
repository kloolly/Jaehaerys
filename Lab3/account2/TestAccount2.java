public class TestAccount2 {

  public static void main (String[] args) {
    Account2 john = new Account2 ("John Doe", 500);
    Account2 jane = new Account2 ("Jane Doe");
	Account2 krung, thai;

    System.out.println (john);
    System.out.println (jane);
    System.out.println ();

    System.out.println (john.getNumAccount ());
    System.out.println (john.getName ());
    System.out.println (john.getBalance ());
    System.out.println ();

    jane.setName ("Jane Smith");
    jane.deposit (100);
    System.out.println (jane.withdraw (70));
    jane.deposit (120);
    System.out.println (jane.withdraw (200));
    System.out.println (jane);
    System.out.println ();

    krung = new Account2 ("Krung", 999);
    System.out.println (krung);

    thai = new Account2 ("Thai");
    System.out.println (thai);
    System.out.println ();
  }
}
