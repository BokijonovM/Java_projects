package com.company;

/**Bokijonov Mukhsinjon 52336*/
/** Define Ship class */
public class Ship{
    private String name;
    private String yearBuilt;
    private final String yearAccident;

    /** Construct initialize the member of variables */
    public Ship(String na, String year, String accident_year){
        name = na;
        yearBuilt = year;
        yearAccident = accident_year;
    }

    /** Setter methods for private variable names*/
    public void setName(String na){
        name = na;
    }

    public void setYearBuilt(String year){
        yearBuilt = year;
    }

    public void setAccidentYear(String accident_year){
        yearBuilt = accident_year;
    }

    /** Getter methods for private variable names */
    public String getName(){
        return name;
    }

    public String getYearBuilt(){
        return yearBuilt;
    }

    public String getaccidentYear(){
        return yearAccident;
    }

    /** toString method of Object class is overridden to return a string
     * with the details of the Ship
     */
    @Override
    public String toString(){
        String SHIP="";
        SHIP = "Ship Info: \n";
        SHIP = SHIP + "Ship Name: " + getName() + "\n";
        SHIP = SHIP + "Year Built: " + getYearBuilt() + "\n";
        SHIP = SHIP + "Accident Year: " + getaccidentYear() + "\n";
        return SHIP;
    }
}