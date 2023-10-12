package org.example.fileutils;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileUtils {

    public static List<String> readFile(Path file){
        try{
            return Files.readAllLines(file, StandardCharsets.UTF_8);
        }
        catch (Exception exp){
            exp.printStackTrace();
        }
        return null;
    }

    private static Path writeToFile(Path file, List<String> allLines){
        try{
            return Files.write(file, allLines);
        }
        catch (Exception exp){
            exp.printStackTrace();
        }
        return null;
    }

    public static Path getValidPath(String filePath){
        return Paths.get(filePath);
    }

    public static void copyFile(String filePath1, String filePath2){
        Path validPath1 = getValidPath(filePath1);
        Path validPath2 = getValidPath(filePath2);
        List<String> allLines = readFile(validPath1);
        writeToFile(validPath2, allLines);
    }
}
