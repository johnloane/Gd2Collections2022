package com.dkit.gd2.johnloane;

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
        //demoTheatre();
        //testPlayer();
//        Player test = new Player("P1");
//        System.out.println(('0'+0));
//        System.out.println(test.hashCode());


    }

    private static void testPlayer()
    {
        ArrayList<Player> playersArray = new ArrayList<>();
        LinkedList<Player> playersList = new LinkedList<>();
        System.out.println("ARRAY TIME");
        add1000Players(playersArray);
        playersArray.get(0).setScore(100000);
        printPlayerList(playersArray);
        set200PlayersHealthZero(playersArray);
        long startTime = System.currentTimeMillis();
        remove200RandomPlayers(playersArray);
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution remove list time: " + (endTime-startTime));

        System.out.println("LIST TIME");
        add1000Players(playersList);
        startTime = System.currentTimeMillis();
        remove200RandomPlayers(playersList);
        endTime = System.currentTimeMillis();
        System.out.println("Total execution remove list time: " + (endTime-startTime));

        set200PlayersHealthZero(playersArray);
        startTime = System.currentTimeMillis();
        removeDeadPlayers(playersArray);
        endTime = System.currentTimeMillis();
        System.out.println("Total execution remove dead time array: " + (endTime-startTime));

        set200PlayersHealthZero(playersList);
        startTime = System.currentTimeMillis();
        removeDeadPlayers(playersList);
        endTime = System.currentTimeMillis();
        System.out.println("Total execution remove dead time list: " + (endTime-startTime));

        set200PlayersHealthZero(playersList);
        startTime = System.currentTimeMillis();
        removeDeadPlayersIterator(playersList);
        endTime = System.currentTimeMillis();
        System.out.println("Total execution remove dead time iterator: " + (endTime-startTime));
    }

    private static void removeDeadPlayers(List<Player> players)
    {
        for(int i=0; i < players.size();i++)
        {
            if(players.get(i).getHitPoints() == 0)
            {
                players.remove(i);
            }
        }
    }

    private static void removeDeadPlayersIterator(List<Player> players)
    {
        ListIterator<Player> itr = players.listIterator();
        while(itr.hasNext())
        {
            if (itr.next().getHitPoints() == 0)
            {
                itr.remove();
            }
        }
    }

    private static void set200PlayersHealthZero(List<Player> players)
    {
        Random random = new Random();
        for(int i=0; i < 2000; i++)
        {
            int indexToKill = random.nextInt(players.size());
            players.get(indexToKill).setHitPoints(0);
        }
    }

    private static void add1000Players(List<Player> players)
    {
        long startTime = System.currentTimeMillis();
        for(int i=0; i < 10000; i++)
        {
            String name = "P"+i;
            players.add(new Player(name));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time insert list: " + (endTime-startTime));
    }

    private static void remove200RandomPlayers(List<Player> players)
    {
        Random random = new Random();
        for(int i=0; i < 2000; i++)
        {
            int indexToRemove = random.nextInt(players.size());
            players.remove(indexToRemove);
        }
    }

    private static void printPlayerList(List<Player> players)
    {
        Collections.sort(players, new PlayerScoreComparator());
        for(Player player : players)
        {
            System.out.println(player);
        }
    }



    private static void demoTheatre()
    {
        Theatre townHallTheatre = new Theatre("Town Hall", 20, 30);
        townHallTheatre.reserveSeatBinary("A01");

        //Collections.sort(townHallTheatre.getSeats());

        //Copy of the seats in the townHallTheatre
        List<Seat> seatCopy = new ArrayList<>(townHallTheatre.getSeats());
        seatCopy.get(0).reserve();
        printList(seatCopy);
        System.out.println("PRINTING THREATE SEATS");
        townHallTheatre.printSeats();

        System.out.println("PRINTING COPY SEATS");
        Collections.shuffle(seatCopy);
        printList(seatCopy);
        long startTime = System.currentTimeMillis();
        //sortList(seatCopy);
        Collections.sort(seatCopy);

        //Collections.copy does not work how you would expect
//        List<Seat> newList = new ArrayList<>(townHallTheatre.getSeats().size());
//        Collections.copy(newList, townHallTheatre.getSeats());

        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime));
        System.out.println("SORTED LIST");
        printList(seatCopy);

        List<Seat> priceSeats = new ArrayList<>(townHallTheatre.getSeats());
        Collections.sort(priceSeats, new SeatPriceComparator());
        printList(priceSeats);

        Seat minSeat = Collections.min(seatCopy);
        Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat is " + minSeat.getSeatNumber() );
        System.out.println("Max seat is " + maxSeat.getSeatNumber());
        //townHallTheatre.printSeats();
        startTime = System.currentTimeMillis();
        townHallTheatre.reserveSeatLinear("T30");
        endTime = System.currentTimeMillis();
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

    private static void printList(List<Seat> seatList)
    {
        for(Seat currentSeat : seatList)
        {
            System.out.print(" " + currentSeat.getSeatNumber() + " " + currentSeat.getPrice());
        }
        System.out.println();
        System.out.println("=".repeat(100));
    }

    private static void sortList(List<Seat> list)
    {
        for(int i=0; i < list.size()-1; i++)
        {
            for(int j=i+1; j < list.size(); j++)
            {
                if(list.get(i).compareTo(list.get(j)) > 0)
                {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
