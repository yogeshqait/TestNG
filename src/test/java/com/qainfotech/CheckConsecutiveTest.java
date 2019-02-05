package com.qainfotech;

import java.util.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckConsecutiveTest
{
    public ArrayList<String> input = new ArrayList<String>();
    public ArrayList<String> output = new ArrayList<String>();
    public ArrayList<String> result = new ArrayList<String>();
    @Test
    public void positive()
    {
        input.add("Rajeev");
        input.add("Nitish");
        input.add("Amit");
        input.add("Rahul");

        output.add("Rajeev");

        CheckConsecutive obj = new CheckConsecutive();
        result = obj.check(input);
        Assert.assertEquals(result, output);
    }

    @Test
    public void threeconsec()
    {
        input.add("Rajeev");
        input.add("Niiish");
        input.add("Amit");
        input.add("Rahul");

        output.add("Rajeev");
        output.add("Niiish");

        CheckConsecutive obj = new CheckConsecutive();
        result = obj.check(input);
        Assert.assertEquals(result, output);
    }
}
