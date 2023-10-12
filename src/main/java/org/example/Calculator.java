package org.example;

import org.example.base.Assignment;

public class Calculator extends Assignment {

    private void add(int a, int b){
        int res = a + b;
        displayMessage("Addition Result : " + res);
    }

    private void multiply(int a, int b){
        int res = a + b;
        displayMessage("Multiplication Result : " + res);
    }

    private void division(int a, int b){
        double res = (double) a / b;
        displayMessage("Division Result : " + res);
    }

    private void sub(int a, int b){
        int res = a - b;
        displayMessage(" Subtraction Result : " + res);
    }

    private void operations(int a, int b, char op){

        if (op == '+'){
            this.add(a, b);
            return;
        }

        if (op == '-'){
            this.sub(a, b);
            return;
        }

        if (op == '*'){
            this.multiply(a, b);
            return;
        }

        if (op == '/'){
            this.division(a, b);
            return;
        }

        displayMessage("No Operation Selected");

    }

    private char operator(){
        String msg = "Enter valid operator among these: {'+', '-', '*', '/'} ";
        return this.takeCharInput(msg);
    }

    public void execute(){
        int a = this.takeIntegerInput("Number 1");
        int b = this.takeIntegerInput("Number 2");
        char op = this.operator();
        System.out.println(a);
        System.out.println(b);
        System.out.println(op);

        this.operations(a, b, op);
    }
}
