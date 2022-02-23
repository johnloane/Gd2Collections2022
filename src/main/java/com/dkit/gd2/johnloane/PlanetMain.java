package com.dkit.gd2.johnloane;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PlanetMain
{
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args)
    {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Neptune", 60266);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto", 90582);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        //printMoonsOfPlanet("Mars");

        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842);
        planets.add(pluto);

        printAllPlanets();

        //Add all moons to a Hashset
//        Set<HeavenlyBody> moons = new HashSet<>();
//        populateMoons(moons);
//        printAllMoons(moons);



    }

    private static void printAllPlanets()
    {
        for(HeavenlyBody planet : planets)
        {
            System.out.println(planet.getName());
        }
    }

    private static void printAllMoons(Set<HeavenlyBody> moons)
    {
        for(HeavenlyBody moon : moons)
        {
            System.out.println("\t" + moon.getName());
        }
    }

    private static void populateMoons(Set<HeavenlyBody> moons)
    {
        for(HeavenlyBody planet : planets)
        {
            moons.addAll(planet.getSatellites());
        }
    }

    private static void printMoonsOfPlanet(String planet)
    {
        HeavenlyBody planetToPrint = solarSystem.get(planet);
        System.out.println("Moons of " + planetToPrint.getName());
        for(HeavenlyBody moon : planetToPrint.getSatellites())
        {
            System.out.println("\t" + moon.getName());
        }
    }



}
