package com.dkit.gd2.johnloane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Theatre
{
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow)
    {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows - 1);

        for(char row = 'A'; row <= lastRow; row++)
        {
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++)
            {
                double price = 12.50;

                if((row < 'D') && (seatNum >= 8 && seatNum <= 23))
                {
                    price = 20.00;
                }
                else if((row > 'L') || (seatNum < 8 || seatNum > 23))
                {
                    price = 10.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName()
    {
        return theatreName;
    }

    public boolean reserveSeatLinear(String seatNumber)
    {
        Seat requestedSeat = null;
        for(Seat seat : seats)
        {
            System.out.print(".");
            if(seat.getSeatNumber().equals(seatNumber))
            {
                requestedSeat = seat;
                break;
            }
        }
        if(requestedSeat == null)
        {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
        return requestedSeat.reserve();
    }

    public boolean reserveSeatBinary(String seatNum)
    {
        Seat searchSeat = new Seat(seatNum, 10.00);
        int i = Collections.binarySearch(seats, searchSeat, null);
        if( i < 0)
        {
            System.out.println("The seat doesn't exist");
            return false;
        }
        else
        {
            return seats.get(i).reserve();
        }
    }

    public boolean reserveSeatCustomBinary(String seatNumber)
    {
        int low = 0;
        int high = seats.size()-1;

        while(low <= high)
        {
            System.out.print(".");
            int mid = (low + high)/2;
            Seat midSeat = seats.get(mid);
            int cmp = midSeat.getSeatNumber().compareTo(seatNumber);

            if(cmp < 0)
            {
                low = mid + 1;
            }
            else if(cmp > 0)
            {
                high = mid - 1;
            }
            else
            {
                return midSeat.reserve();
            }
        }
        System.out.println("There is no seat " + seatNumber);
        return false;
    }

    public void printSeats()
    {
        for(Seat seat : seats)
        {
            System.out.print(seat + " ");
        }
    }

    public List<Seat> getSeats()
    {
        return this.seats;
    }
}
