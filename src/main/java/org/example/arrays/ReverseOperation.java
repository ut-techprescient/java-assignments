package org.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseOperation implements ArrayOperation{

    @Override
    public void doOperation(int[] numArray) {
        ArrayList<Integer> reverseResult = new ArrayList<Integer>();
        int ct = numArray.length-1;
        while (ct >= 0){
            reverseResult.add(numArray[ct]);
            ct--;
        }
        System.out.println("Reverse of array" + reverseResult);
    }
}
