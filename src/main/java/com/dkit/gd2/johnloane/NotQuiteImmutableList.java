package com.dkit.gd2.johnloane;

import java.util.ArrayList;
import java.util.List;

public final class NotQuiteImmutableList
{
    private final List<String> list;

    public NotQuiteImmutableList(List<String> list)
    {
        this.list = new ArrayList(list);
    }

    public List<String> getList()
    {
        //To make immutable - return a copy instead of a reference
        return new ArrayList(list);
    }
}
