package org.example;

import org.example.base.Assignment;

import java.util.Arrays;

public class WordCount extends Assignment {

    private void countWord(String sen){
        long count = Arrays.stream(
                sen
                .trim()
                .split("\\s+|:|\\.")
                )
                .filter(f -> !f.trim().isEmpty())
                .count();
        displayMessage("Total words in sentence "+ count);
    }

    @Override
    public void execute() {
        String sen = this.takeStringInput("Sentence: ");
        countWord(sen);
    }
}
