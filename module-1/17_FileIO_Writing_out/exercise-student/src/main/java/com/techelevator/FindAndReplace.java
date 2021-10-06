package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("What is the search word?");
        String searchWord = kb.nextLine();

        System.out.println("What is the replacement word?");
        String replacementWord = kb.nextLine();

        System.out.println("What is the source file?");
        String sourceFileString = kb.nextLine();

        System.out.println("What is the destination file?");
        String destinationFileString = kb.nextLine();

        File sourceFile = new File(sourceFileString);
        File destinationFile = new File(destinationFileString);

        if (destinationFile.exists()) {
            destinationFile.delete();
            try {
                destinationFile.createNewFile();
            } catch (IOException e) {
                System.out.println("File already exists.");
            }
        }

        try (PrintWriter printWriter = new PrintWriter(destinationFile);) { // try with resources creates redundant close
            Scanner inputStreamer = new Scanner(sourceFile);


            while (inputStreamer.hasNextLine()) {
                String currentLine = inputStreamer.nextLine();
                printWriter.println(currentLine);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

    }


}
