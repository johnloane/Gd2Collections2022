package com.dkit.gd2.johnloane;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

/**
 * Time some code
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println((char)('A'+1));
//        int loopSize = 10000;
//        ArrayList<Integer> listToSearch = populateLargeList();
//        final long startTime = System.currentTimeMillis();
//        Collections.binarySearch(listToSearch, 999999);
//        //myLinearSearch(listToSearch, 999999);
//        final long endTime = System.currentTimeMillis();
//        System.out.println("Total execution time: " + (endTime-startTime));
        demoTheatre();

    }

    private static void demoTheatre()
    {
        Theatre townHallTheatre = new Theatre("Town Hall", 20, 30);
        //townHallTheatre.printSeats();
        long startTime = System.currentTimeMillis();
        townHallTheatre.reserveSeatLinear("T30");
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime));
        startTime = System.currentTimeMillis();
        townHallTheatre.reserveSeatBinary("T30");
        endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime));
        townHallTheatre.reserveSeatCustomBinary("T30");

    }

    private static void myLinearSearch(ArrayList<Integer> listToSearch, int searchValue)
    {
        for(int i=0; i < listToSearch.size(); i++)
        {
            if(i == searchValue)
            {
                System.out.println("Found it");
            }
        }
    }

    private static ArrayList<Integer> populateLargeList()
    {
        ArrayList<Integer> largeList = new ArrayList<>();
        for(int i = 0; i < 10000000; i++)
        {
            largeList.add(i);
        }
        return largeList;
    }

    private static void codeToTime(int loopSize)
    {
        for(int i=0; i < loopSize; i++)
        {
            System.out.println("Hello World");
        }
    }
}
