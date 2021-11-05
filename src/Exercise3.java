import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        //Write a program that reads a file with n number of strings separated by linebreaks.

        //ArrayList where I save the words from the file
        ArrayList<String> words = new ArrayList<>();

        //Reading the file
        File cvWords = new File("resources/cs words.csv");

        try {
            //Scanning the file
            Scanner scanner = new Scanner(cvWords);

            //Keep scanning until there are anymore lines
            while (scanner.hasNextLine()){
                //Gets word from line
                String lineOfWords = scanner.nextLine();
                //Adds word to our ArrayList
                words.add(lineOfWords);

            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }

        //The program prints how many words are in the file
        int numberOfWords = words.size();
            System.out.println("There are: " + numberOfWords + " words in the file");

    }
}
