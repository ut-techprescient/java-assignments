package org.example.base;

import java.util.Scanner;

public abstract class Assignment {

    public abstract void execute();


    private Scanner getInput(){
        return new Scanner(System.in);
    }


    public void displayMessage(String msg){
        System.out.println(msg);
    }

    protected String takeStringInput(String msg){
        displayMessage("Enter " + msg + ": ");
        return getInput().nextLine();
    }

    protected char takeCharInput(String msg){
        displayMessage(msg);
        return getInput().next().charAt(0);
    }

    protected Integer takeIntegerInput(String msg){
        displayMessage("Enter " + msg + ": ");
        return getInput().nextInt();
    }

    protected Float takeFloatInput(String msg){
        displayMessage("Enter " + msg + ": ");
        return getInput().nextFloat();
    }

    protected Double takeDoubleInput(String msg){
        displayMessage("Enter " + msg + ": ");
        return getInput().nextDouble();
    }
}
