package com.company;

/**Bokijonov Mukhsinjon 52336*/
/** Definition of subclass CruiseShip from superclass Ship */
public class CruiseShip extends Ship{
    private int passengerCapacity;

    public CruiseShip(String na, String year, String accident_year, int capacity){
        super(na,year,accident_year);
        passengerCapacity = capacity;
    }

    /** Setter */
    public void setPassengerCapacity(int capacity){
        passengerCapacity = capacity;
    }

    /** Getter */
    public int getPassengerCapacity(){
        return passengerCapacity;
    }

    /** The toString() method of superclass Ship is overridden by the subclass */
    @Override
    public String toString(){
        String SHIP = "";
        SHIP = "CruiseShip Info: \n";
        SHIP = SHIP + "CruiseShip Name: " + getName() + "\n";
        SHIP = SHIP + "CruiseShip Passenger Capacity: " + getPassengerCapacity() + " persons\n";
        SHIP = SHIP + "Year Built: " + getYearBuilt() + "\n";
        SHIP = SHIP + "Accident Year: " + getaccidentYear() + "\n";
        return SHIP;
    }
}