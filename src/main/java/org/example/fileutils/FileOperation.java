package org.example.fileutils;

import org.example.base.Assignment;

import java.util.Arrays;
import java.util.List;

public class FileOperation extends Assignment {

    private void performOperation(String inputPath, String outPath){
        FileUtils.copyFile(inputPath, outPath);
        List<String> results =  FileUtils.readFile(FileUtils.getValidPath(outPath));
        assert results != null;
        results.forEach(System.out::println);
    }

    @Override
    public void execute() {
        String inputPath = takeStringInput("Enter input path");
        String outPath = takeStringInput("Enter path to store copy results");
        performOperation(inputPath, outPath);
    }
}
