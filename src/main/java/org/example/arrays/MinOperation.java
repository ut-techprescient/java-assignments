package org.example.arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class MinOperation implements ArrayOperation{

    @Override
    public void doOperation(int[] numArray) {
        OptionalInt minValue = Arrays.stream(numArray).min();
        System.out.println("Minimum element: " + minValue);
    }
}
