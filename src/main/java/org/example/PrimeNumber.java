package org.example;

import org.example.base.Assignment;

public class PrimeNumber extends Assignment {

    private boolean isPrime(int num){
        if(num <= 3 ){
            return true;
        }
        int sqrtInt = (int) Math.ceil(Math.sqrt(num));

        for(int i=2; i<=sqrtInt; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    @Override
    public void execute() {
        int integerInput = takeIntegerInput("Prime number :");
        if(isPrime(integerInput)){
            displayMessage("Your "+integerInput+" number is prime");
        }else {
            displayMessage("Your " + integerInput + " number is not prime");
        }
    }
}
