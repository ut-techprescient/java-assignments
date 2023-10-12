package org.example.encryption;

public class Operation {

    private final char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
                                    'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
                                    'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};


    private final int shuffleIdx = 3;

    private char enIndex(char val){
        char newChar = Character.toUpperCase(val);
        int charIdx = -1;
        for(int i=0; i < alphabets.length; i++){
            if (alphabets[i] == newChar){
                charIdx = i;
                break;
            }
        }

        // returning same char if not an alphabet
        if (charIdx == -1){
            return val;
        }
        int newIdx = (charIdx + shuffleIdx) % 26;
        return alphabets[newIdx];
    }

    private char deIndex(char val){
        char newChar = Character.toUpperCase(val);
        int charIdx = -1;
        for(int i=0; i < alphabets.length; i++){
            if (alphabets[i] == newChar){
                charIdx = i;
                break;
            }
        }

        // returning same char if not an alphabet
        if (charIdx == -1){
            return val;
        }
        int newIdx = Math.abs(charIdx - shuffleIdx) % 26;
        return alphabets[newIdx];
    }

    public String encrypt(String rawText){
        String newString = "";
        for(int i=0; i<rawText.length(); i++){
            newString += enIndex(rawText.charAt(i));
        }
        return newString;
    }

    public String decrypt(String encodedText){
        String newString = "";
        for(int i=0; i<encodedText.length(); i++){
            newString += deIndex(encodedText.charAt(i));
        }
        return newString;
    }
}
