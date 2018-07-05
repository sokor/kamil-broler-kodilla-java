package com.kodilla.testing.collection;
import java.util.*;
import java.lang.*;


public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers){
        ArrayList<Integer> even = new ArrayList<Integer>();
        for (Integer number: numbers){
            if (number % 2 ==0){
                even.add(number);

            }
        }
        return even;
    }
}
