package com.dkit.gd2.johnloane;

public class ImmutableInt
{
    private final int value;

    public ImmutableInt(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }
}
