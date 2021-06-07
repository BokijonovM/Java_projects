package com.company;

/**Bokijonov Mukhsinjon 52336*/
public class Run{
    public static void main(String[] args)
    {
/** Create an array for Ship class that holds Ship objects */
        Ship ShipArray[] = new Ship[3];
/** Ship */
        Ship ship1 = new Ship("Titanic","1909","1913");
/** CruiseShip */
        Ship cruise_ship = new CruiseShip("Black Pearl","2016","Still alive", 12);
/** CargoShip */
        Ship cargo_ship = new CargoShip("Prelude","2018","Still alive", 499167);
/** Store all objects in the array */
        ShipArray[0] = ship1;
        ShipArray[1] = cruise_ship;
        ShipArray[2] = cargo_ship;
/** Loop for array that prints all ships */
        for (Ship ship : ShipArray) {
            System.out.println(ship);
            System.out.println();
        }
    }
}

