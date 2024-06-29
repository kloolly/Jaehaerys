class Vehicle {
    private int x1 = 1;
    public int x2 = 2;
    protected int x3 = 3;

    public int getX1() {
        return x1;
    }

    final protected int getSum() {
        return (x1+x2+x3);
    }
}
