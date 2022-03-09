package com.dkit.gd2.johnloane;

import java.util.PriorityQueue;

public class PriorityQ
{
    public static void main(String[] args)
    {
        PriorityQueue<Player> testQueue = new PriorityQueue(new PlayerScoreComparator());
        Player player1 = new Player("John");
        player1.setScore(1);
        Player player2 = new Player("Niall");
        player2.setScore(10);
        Player player3 = new Player("Enda");
        player3.setScore(100);

        testQueue.add(player1);
        testQueue.add(player2);
        testQueue.add(player3);
        System.out.println(testQueue);
        System.out.println(testQueue.poll());
        System.out.println(testQueue.poll());

    }
}
