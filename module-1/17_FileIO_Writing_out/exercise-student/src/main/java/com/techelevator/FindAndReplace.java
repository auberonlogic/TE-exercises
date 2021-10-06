package com.techelevator;

import java.io.File;
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
        File sourceFile = new File(sourceFileString);
        try {
            Scanner source = new Scanner(sourceFile);
        } catch (IOException e) {
            System.out.println("Not a valid file. Ending program...");
            System.exit(0);
        }

        System.out.println("What is the destination file?");
        String destinationFileString = kb.nextLine();
        File destinationFile = new File(destinationFileString);
        try (Scanner input = new Scanner(sourceFile); PrintWriter pw = new PrintWriter(destinationFile)) {
            while(input.hasNextLine()) {
                String line = input.nextLine();
                line = line.replace(searchWord, replacementWord);
                pw.println(line);
            }
        } catch (IOException e) {
            System.out.println("Not a valid destination. Ending program...");
            System.exit(0);
        }
    }
}
