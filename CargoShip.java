public class CargoShip extends Ship {
    // field for capacity in tons
    private int cap;

    // constructor
    public CargoShip(String name, String year, int cap) {
        super(name, year);
        this.cap = cap;
    }

    // accessor for capacity
    public int getCap() {
        return cap;
    }

    // mutator for capacity
    public void setCap(int cap) {
        this.cap = cap;
    }

    // override toString method for printing
    @Override
    public String toString() {
        return super.toString() + "\nCargo capacity: " + cap + " tons";
    }

    // override compareTo method to compare based on capacity
    @Override
    public int compareTo(Ship ship) {
        if (ship instanceof CargoShip) {
            return Integer.compare(this.cap, ((CargoShip) ship).getCap());
        }
        return super.compareTo(ship);
    }
}
