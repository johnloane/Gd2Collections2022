package com.dkit.gd2.johnloane;

import java.util.HashMap;
import java.util.Map;

public class MapProgram
{
    public static void main(String[] args)
    {
        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java"))
        {
            System.out.println("Java already in the map");
        }
        else
        {
            languages.put("Java", "Java is alright");
        }

        languages.put("Javascript", "Not as good as Java");
        languages.put("C++", "Just as good as Java");

        System.out.println(languages.put("html", "Easier than Java"));
        System.out.println(languages.put("html", "Easier than Java"));

        if(languages.replace("Java", "Java is alright", "Something new"))
        {
            System.out.println("Replaced Java");
        }
        else
        {
            System.out.println("Python was not in the map");
        }

        for(String key : languages.keySet())
        {
            System.out.println(key + " : " + languages.get(key));
        }

        if(languages.containsKey("Java"))
        {
            System.out.println("Java is alreadt a key in the map");
        }




    }

}
