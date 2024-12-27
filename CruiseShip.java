public class CruiseShip extends Ship{
    // field for maximum passengers
    private int maxPass;

    // constructor
    public CruiseShip(String name, String year, int maxPass) {
        super(name, year);
        this.maxPass = maxPass;
    }

    // accessor for max passengers
    public int getMaxPass() {
        return maxPass;
    }

    // mutator for max passengers
    public void setMaxPass(int maxPass) {
        this.maxPass = maxPass;
    }

    // override toString method for printing
    @Override
    public String toString() {
        return super.toString() + "\nMaximum Passengers: " + maxPass;
    }

    // override compareTo to compare based on max passengers
    @Override
    public int compareTo(Ship ship) {
        if (ship instanceof CruiseShip) {
            return Integer.compare(this.maxPass, ((CruiseShip) ship).getMaxPass());
        }
        return super.compareTo(ship);
    }
}
