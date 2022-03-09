package com.dkit.gd2.johnloane;

import java.util.Comparator;

public class PlayerScoreComparator implements Comparator<Player>
{
    @Override
    public int compare(Player p1, Player p2)
    {
        return p2.getScore() - p1.getScore();
    }
}
