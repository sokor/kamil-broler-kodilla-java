package com.kodilla.testing.collection;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test begin");
    }
    @After
    public void after(){
        System.out.println("Test end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator toBeTested = new OddNumbersExterminator();
        ArrayList<Integer> input = new ArrayList<>();
        List<Integer> result = toBeTested.exterminate(input);

        Assert.assertEquals(input, result);

    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator toBeTested = new OddNumbersExterminator();
        List<Integer> input = Arrays.asList(1,2,3,4,5,6);
        List<Integer> expected = Arrays.asList(2,4,6);
        List<Integer> result = toBeTested.exterminate(input);

        Assert.assertEquals(expected, result);
    }
}
