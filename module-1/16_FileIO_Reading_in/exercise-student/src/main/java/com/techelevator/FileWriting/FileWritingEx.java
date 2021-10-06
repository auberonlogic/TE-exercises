package com.techelevator.FileWriting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;

public class FileWritingEx {

    public static void main(String[] args) {
        File f = new File("ex_output.txt");
        File o = new File("ex_output2.txt");

        try (Scanner input = new Scanner(f); PrintWriter pw = new PrintWriter(o)) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                line = line.replace("appeared", "shows up");
                pw.println(line);
            }
        } catch (IOException e) {
            System.out.println("ERROR!");
        }
    }

    public static void main2(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a new phrase >>> ");
        String input = kb.nextLine();

        MapsEx m = new MapsEx();
        Map<String, Integer> outputMap = m.countOccurances(input);

        File outputFile = new File("ex_output.txt");


//        FileWriter fw = new FileWriter(outputFile, true);


        // try-with-resources (closable)
        try (PrintWriter pw = new PrintWriter(new FileWriter(outputFile, true))){ // true appends, false replaces
            int max = -1;
            String mostCommonKey = "";
            for (String key : outputMap.keySet()) {
                int value = outputMap.get(key);

                if (value > max) {
                    max = value;
                    mostCommonKey = key;
                }
            }

            pw.print("The most commonly occurring letter in " + input + " is " + mostCommonKey + ", which appeared " + max + " times.");

        } catch (IOException e) {
            System.out.println("Couldn't open file.");
        }


    }

}
