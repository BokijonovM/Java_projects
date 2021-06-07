package com.company;

/**Bokijonov Mukhsinjon 52336*/
/** Define subclass CargoShip from superclass Ship */
public class CargoShip extends Ship{
    private int tonnage;


    public CargoShip(String na, String year, String accident_year, int weight){
        super(na,year,accident_year);
        tonnage = weight;
    }

    /** Setter */
    public void setTonnage(int weight)
    {
        tonnage = weight;
    }

    /** Getter */
    public int getTonnage()
    {
        return tonnage;
    }

    /** The toString() method of superclass Ship is overridden by the subclass */
    @Override
    public String toString()
    {
        String SHIP="";
        SHIP = "CargoShip Info: \n";
        SHIP = SHIP + "CargoShip Name: " + getName() + "\n";
        SHIP = SHIP + "CargoShip Capacity: " + getTonnage() + " tons\n";
        SHIP = SHIP + "Year Built: " + getYearBuilt() + "\n";
        SHIP = SHIP + "Accident Year: " + getaccidentYear() + "\n";
        return SHIP;
    }
}