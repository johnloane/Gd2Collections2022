package com.dkit.gd2.johnloane;

import java.util.Objects;

public class Player implements Comparable<Player>
{
    private String name;
    private int hitPoints;
    private int score;

    public Player(String name)
    {
        this.name = name;
        this.hitPoints = 100;
        this.score = 0;
    }

    public void setHitPoints(int i)
    {
        this.hitPoints = i;
    }

    public int getHitPoints()
    {
        return hitPoints;
    }

    @Override
    public int compareTo(Player o)
    {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString()
    {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", score=" + score +
                '}';
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int i)
    {
        this.score = i;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }
}
