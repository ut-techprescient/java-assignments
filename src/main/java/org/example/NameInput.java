package org.example;

import org.example.base.Assignment;

import java.util.Scanner;

public class NameInput extends Assignment {

    public void execute(){
        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = inputName.nextLine();
        System.out.println("Hello and welcome: " + name);
    }
}
