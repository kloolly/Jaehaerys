public class TestCoffee {
  public static void main (String[] args) {
    Coffee c1 = new Coffee ();
    Coffee c2 = new Coffee ("Amazon", 6.5);
    Starbox s1 = new Starbox (false);
    Starbox s2 = new Starbox (true);

    c1.printBill (3); // 3*5 = 15
    System.out.println ();
    c2.printBill (4); // 4*6.5 = 26
    System.out.println ();

    s1.printBill (3);
    System.out.println ();
    s2.printBill (5);
    System.out.println ();
  }
}
