package com.dkit.gd2.johnloane;

import java.util.Comparator;

public class PlayerScoreComparator implements Comparator<Player>
{
    @Override
    public int compare(Player p1, Player p2)
    {
        return p1.getScore() - p2.getScore();
    }
}
