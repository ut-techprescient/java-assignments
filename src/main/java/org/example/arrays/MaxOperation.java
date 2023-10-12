package org.example.arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxOperation implements ArrayOperation{

    @Override
    public void doOperation(int[] numArray) {
        OptionalInt maxValue = Arrays.stream(numArray).max();
        System.out.println("Maximum Value from Array" + maxValue);
    }
}
