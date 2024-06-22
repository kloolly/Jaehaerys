public class TestAccount {

  public static void main (String[] args) {

	Account p1, p2, p3;

    p1 = new Account ("Aby Alan", 500);
    System.out.println (p1.numAccount + " " + p1);

    p2 = new Account ("Ben Bowe");
    System.out.println (p2.numAccount + " " + p2);

    p1 = new Account ("Cho Cohn", 500);

    System.out.print (p1.numAccount);
    System.out.print (" " + p1.name);
    System.out.print (": " + p1.balance);
    System.out.println ();

    new Account ("John Nash");

    p2.name = "Dan Davi";
    System.out.print ("--------------------------------");
    p2.deposit (150);
    System.out.print (" true:" + p2.withdraw (70));
    p2.deposit (420);
    System.out.print (" false:" + p2.withdraw (600));
    System.out.println ();
    System.out.print (p2.numAccount + " ");
    System.out.println (p2);

    p3 = new Account ("Eve Edna");
    System.out.print (p3.numAccount + " ");
    System.out.println (p3);

    p3 = new Account ("Fin Faur", 500);
    System.out.print (p3.numAccount + " ");
    System.out.println (p3);
    System.out.println ();
  }
}
