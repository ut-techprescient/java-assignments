package org.example;

import org.example.base.Assignment;

public class Palindrome extends Assignment {

    private boolean isPalindrome(String word){
        int wordLen = word.length();
        int ct = 0;
        while(ct <= wordLen/2){
            char firstChar = word.charAt(ct);
            char lastChar = word.charAt(wordLen-ct-1);
            if(firstChar != lastChar){
                return false;
            }
            ct++;
        }
        return true;
    }

    @Override
    public void execute() {
        String word = takeStringInput("Enter word to check palindrome");
        if(isPalindrome(word)){
            displayMessage("Entered " + word + " is palindrome");
        }else{
            displayMessage("Entered " + word + " is not palindrome");
        }
    }
}
