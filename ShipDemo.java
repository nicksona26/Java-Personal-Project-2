import java.util.ArrayList;
import java.util.Collections;

public class ShipDemo {
    public static void main(String[] args) {
        // array list to hold ship objects
        ArrayList<Ship> ships = new ArrayList<>();

        // array list to hold
        ArrayList<Ship> cruiseShips = new ArrayList<>();

        // add ships to the array list ships
        CruiseShip ship1 = new CruiseShip("RonSkee","1876",300);
        CargoShip ship2 = new CargoShip("Jenny","1765", 200);
        TankerShip ship3 = new TankerShip("The Ray Fucho", "2003", "Oil", 2000);
        ships.add(ship1);
        ships.add(ship2);
        ships.add(ship3);

        // add ships to the array list CruiseShips
        CruiseShip ship4 = new CruiseShip("DisneyMagic1", "1998",2400);
        CruiseShip ship5 = new CruiseShip("DisneyMagic2", "2002",2500);
        CruiseShip ship6 = new CruiseShip("DisneyMagic3", "2011",400);
        cruiseShips.add(ship4);
        cruiseShips.add(ship5);
        cruiseShips.add(ship6);

        // print all
        for (Ship ship : ships) {
            System.out.println(ship);
            System.out.println("----------------------------");
        }


        // print before sort
        System.out.println("\nBefore sorting three objects of CruiseShip:");
        for (int i = 0; i < cruiseShips.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + cruiseShips.get(i));
        }

        // sort based on maxPass
        cruiseShips.sort((shipX, shipY) -> {
            if (shipX instanceof CruiseShip && shipY instanceof CruiseShip) {
                return Integer.compare(((CruiseShip) shipY).getMaxPass(), ((CruiseShip) shipX).getMaxPass());
            } else {
                return 0;
            }
        });

        // print after sort
        System.out.println("\nAfter sorting three objects of CruiseShip:");
        for (int i = 0; i < cruiseShips.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + cruiseShips.get(i));
        }
    }
}
