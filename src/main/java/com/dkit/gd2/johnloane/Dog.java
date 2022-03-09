package com.dkit.gd2.johnloane;

public class Dog
{
    private final String NAME;

    public Dog(String name)
    {
        this.NAME = name;
    }

    public String getName()
    {
        return NAME;
    }

    @Override
    public final boolean equals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }

        if(obj instanceof Dog)
        {
            String objName = ((Dog) obj).getName();
            return this.NAME.equals(objName);
        }
        return false;
    }
}
