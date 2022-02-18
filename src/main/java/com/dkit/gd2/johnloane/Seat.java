package com.dkit.gd2.johnloane;

public class Seat implements Comparable
{
    private final String seatNumber;
    private double price;
    private boolean reserved = false;

    public Seat(String seatNumber, double seatPrice)
    {
        this.seatNumber = seatNumber;
        this.price = seatPrice;
    }

    public boolean reserve()
    {
        if(!this.reserved)
        {
            this.reserved = true;
            System.out.println("Seat " + seatNumber + " reserved");
            return true;
        }
        else
        {
            System.out.println("The seat " + seatNumber + " has already been reserved");
            return false;
        }
    }

    public boolean cancel()
    {
        if(this.reserved)
        {
            this.reserved = false;
            System.out.println("Reservation of seat " + seatNumber + " cancelled");
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getSeatNumber()
    {
        return seatNumber;
    }

    @Override
    public String toString()
    {
        return  seatNumber + " " + price;
    }

    @Override
    public int compareTo(Object o)
    {
        return this.seatNumber.compareToIgnoreCase(((Seat)(o)).getSeatNumber());
    }

    public double getPrice()
    {
        return price;
    }
}
