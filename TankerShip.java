public class TankerShip extends Ship {
    // fields for liquid type and liquid capacity
    private String liqType;
    private double liqCap;

    // constructor
    public TankerShip(String name, String year, String liqType, double liqCap) {
        super(name, year);
        this.liqType = liqType;
        this.liqCap = liqCap;
    }

    // accessor for liquid type
    public String getLiqType() {
        return liqType;
    }

    // accessor for liquid capacity
    public double getLiqCap() {
        return liqCap;
    }

    // mutator for liquid type
    public void setLiqType(String liqType) {
        this.liqType = liqType;
    }

    // mutator for liqCap
    public void setLiqCap(double liqCap) {
        this.liqCap = liqCap;
    }

    // override toString method for printing info
    @Override
    public String toString() {
        return super.toString() + "\nType: " + liqType + "\nCapacity: " + liqCap;
    }

    // override compareTo method to compare based on liquid type
    @Override
    public int compareTo(Ship ship) {
        if (ship instanceof TankerShip) {
            return this.liqType.compareTo(((TankerShip) ship).getLiqType());
        }
        return super.compareTo(ship);
    }
}
