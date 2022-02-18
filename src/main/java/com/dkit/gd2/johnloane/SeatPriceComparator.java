package com.dkit.gd2.johnloane;

import java.util.Comparator;

public class SeatPriceComparator implements Comparator
{

    @Override
    public int compare(Object s1, Object s2)
    {
        if(((Seat)(s1)).getPrice() < ((Seat)(s2)).getPrice())
        {
            return -1;
        }
        else if(((Seat)(s1)).getPrice() > ((Seat)(s2)).getPrice())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
