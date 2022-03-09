package com.dkit.gd2.johnloane;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DogMain
{
    public static void main(String[] args)
    {
        Labrador bubbles = new Labrador("Bubbles");
        Dog bubbles2 = new Dog("Bubbles");

        System.out.println(bubbles2.equals(bubbles));
        System.out.println(bubbles.equals(bubbles2));


    }
}
