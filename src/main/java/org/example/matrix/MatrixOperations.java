package org.example.matrix;

import org.example.base.Assignment;

public class MatrixOperations extends Assignment {

    private final int[][] defFirstMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    private final int[][] defSecondMatrix = {
            {11, 12, 13},
            {14, 15, 16},
            {17, 18, 19}
    };

    private int[][] add(int[][] firstMatrix, int[][] secondMatrix){
        for(int i=0; i < firstMatrix.length; i++){
            for(int j=0; j< firstMatrix[i].length; j++){
                firstMatrix[i][j] += secondMatrix[i][j];
            }
        }
        return firstMatrix;
    }

    private int[][] subtract(int[][] firstMatrix, int[][] secondMatrix){
        for(int i=0; i < firstMatrix.length; i++){
            for(int j=0; j< firstMatrix[i].length; j++){
                firstMatrix[i][j] -= secondMatrix[i][j];
            }
        }
        return firstMatrix;
    }

    private int[][] multiply(int[][] firstMatrix, int[][] secondMatrix){
        int[][] result = new int[firstMatrix.length][firstMatrix[0].length];

        for(int i=0; i< firstMatrix.length; i++){
            for(int j=0; j<firstMatrix[i].length; j++){
                result[i][j] = 0;
                for(int k=0; k<firstMatrix[i].length; k++){
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }


        return result;
    }


    @Override
    public void execute() {

        String msg = "";
        msg += "Enter Matrix Choice Operation: \n";
        msg += "\n 1. Add";
        msg += "\n 2. Subtract";
        msg += "\n 3. Multiplication";
        this.displayMessage(msg);
        int choice = this.takeIntegerInput("Enter your choice");

        if ( choice < 1 || choice > 3){
            System.out.println("Invalid Operation");
            return;
        }

        int[][] response = new int[3][3];

        switch (choice){
            case 1: {
                response = this.add(defFirstMatrix, defSecondMatrix);
                break;
            }

            case 2: {
                response = this.subtract(defFirstMatrix, defSecondMatrix);
                break;
            }
            case 3: {
                response = this.multiply(defFirstMatrix, defSecondMatrix);
                break;
            }

        }

        for (int[] ints : response) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println("\n");
        }


    }
}
