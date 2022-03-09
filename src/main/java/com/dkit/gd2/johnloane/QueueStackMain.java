package com.dkit.gd2.johnloane;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueueStackMain
{
    public static void main(String[] args)
    {
        testPriorityQueueInt();
        testPriorityQueuePlayer();
        testQueue();
        testStack();
    }

    private static void testStack()
    {
        Stack<String> gameStates = new Stack<>();
        gameStates.add("TitleState");
        System.out.println(gameStates.pop());
        gameStates.add("MenuState");
        System.out.println(gameStates.pop());
        gameStates.add("GameState");
        gameStates.add("PauseState");
        System.out.println(gameStates.pop());
        System.out.println(gameStates.pop());

    }

    private static void testQueue()
    {
        Queue messageQueue = new LinkedList();
        messageQueue.add("This is the first message");
        messageQueue.add("Second");
        messageQueue.add("Third");

        System.out.println(messageQueue);
        System.out.println(messageQueue.size());

        while(!messageQueue.isEmpty())
        {
            System.out.println(messageQueue.poll());
        }
    }

    private static void testPriorityQueuePlayer()
    {
        PriorityQueue<Player> playerQueue = new PriorityQueue<>(new PlayerScoreComparator());
        Player dylan = new Player("Dylan");
        dylan.setScore(30000);
        Player emily = new Player("Emily");
        emily.setScore(31000);
        Player james = new Player("James");
        james.setScore(44000);

        playerQueue.add(dylan);
        playerQueue.add(emily);
        playerQueue.add(james);

        System.out.println(playerQueue);

        for(int i =0; i < 3; i++)
        {
            System.out.println(playerQueue.poll());
        }

    }

    private static void testPriorityQueueInt()
    {
        PriorityQueue<Integer> intQueue = new PriorityQueue<>();
        for(int i =10; i > 0; i--)
        {
            intQueue.add(i);
        }
        System.out.println(intQueue);

        for(int i =0; i < 10; i++)
        {
            System.out.println(intQueue.poll());
        }
    }
}
