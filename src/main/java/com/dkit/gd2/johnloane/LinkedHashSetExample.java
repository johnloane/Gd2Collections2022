package com.dkit.gd2.johnloane;

//In this example we want to store a list of unique players based on their usernames but also care about the order in which they are inserted

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample
{
    public static void main(String[] args)
    {
        Set<String> uniqueUsernames = new LinkedHashSet<>();
        addFiveUsernames(uniqueUsernames);
        printUsernames(uniqueUsernames);
    }

    private static void printUsernames(Set<String> uniqueUsernames)
    {
        for(String user : uniqueUsernames)
        {
            System.out.println(user);
        }
    }

    private static void addFiveUsernames(Set<String> uniqueUsernames)
    {
        addNewUser(uniqueUsernames, "Leanne");
        addNewUser(uniqueUsernames, "Stephen");
        addNewUser(uniqueUsernames, "James");
        addNewUser(uniqueUsernames, "Andrew");
        addNewUser(uniqueUsernames, "James");
    }

    private static void addNewUser(Set<String> uniqueUsernames, String username)
    {
        if(!(uniqueUsernames.add(username)))
        {
            System.out.println(username + " already exists");
        }
    }
}
