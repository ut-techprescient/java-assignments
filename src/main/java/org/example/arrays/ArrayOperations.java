package org.example.arrays;


import org.example.base.Assignment;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;

public class ArrayOperations extends Assignment {

    private int[] defaultArray(){
        return  new int[]{1, 4, 3, 2, 5, 7, 9, 10, 8, 6};
    }

    private void performOperation(int[] inputNumber, ArrayOperation operation){
        operation.doOperation(inputNumber);
    }

    private int getOperation(){
        String msg = "Enter operation number: ";
        msg += "\n 1. sort";
        msg += "\n 2. reverse";
        msg += "\n 3. min";
        msg += "\n 4. max";
        return takeIntegerInput(msg);
    }


    @Override
    public void execute() {
        char flag = takeCharInput("Enter Y or N for adding input:");
        int[] numbers;
        if (flag == 'Y' || flag == 'y') {
            String values = takeStringInput("Number by space separated: ");
            numbers = Stream.of(values.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            displayMessage("Your input array: " + Arrays.toString(defaultArray()));
        }
        else{
            displayMessage("Taking by default array: " + Arrays.toString(defaultArray()));
            numbers = defaultArray();
        }

        int operationId = getOperation();
        switch (operationId){
            case 1: performOperation(numbers, new SortOperation());
            break;
            case 2: performOperation(numbers, new ReverseOperation());
            break;
            case 3: performOperation(numbers, new MinOperation());
            break;
            case 4: performOperation(numbers, new MaxOperation());
            break;
            default: displayMessage("No Ops selected");
            break;
        }

        displayMessage("Operations Completed Successfully");

    }
}
