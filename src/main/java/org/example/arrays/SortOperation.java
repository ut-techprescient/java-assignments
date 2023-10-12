package org.example.arrays;

import java.util.Arrays;

public class SortOperation implements ArrayOperation{

    @Override
    public void doOperation(int[] numArray) {
        int[] sortedRes = Arrays.stream(numArray).sorted().toArray();
        System.out.println("Sorted Array: "+ Arrays.toString(sortedRes));
    }
}
