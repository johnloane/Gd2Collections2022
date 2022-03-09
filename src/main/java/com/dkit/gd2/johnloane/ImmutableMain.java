package com.dkit.gd2.johnloane;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class ImmutableMain
{
    public static void main(String[] args)
    {
        StringBuilder name = new StringBuilder();
        name.append("Niall");
        System.out.println(name);
        name.replace(0, 5,"Ben");
        System.out.println(name);

        NotQuiteImmutableList notQuiteImmutable = new NotQuiteImmutableList(Arrays.asList("a", "b", "c"));
        notQuiteImmutable.getList().add("d");



    }
}
