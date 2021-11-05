import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that constructs an arraylist containing the numbers 1 to 100, and prints them out.

        //ArrayList for our numbers, with a capacity for a 100
        ArrayList<Integer> numbers = new ArrayList<>(100);

        //For loop for going through the numbers
        for (int i = 1; i <= 100; i++) {
            //Adding our numbers to the ArrayList
            numbers.add(i);

            System.out.println(i);

        }
        //The program ask the user for a number and remove all multiples of that number
        // (except for the number itself) from the list

        //Asking the user for a number
        System.out.println("Please input a number: ");
        //Taking the users number
        int userNumber = scanner.nextInt();
        //Removing the multiplied numbers, but not the userNumber
        numbers.removeIf(integer -> (integer % userNumber == 0 && integer != userNumber));
        System.out.println(numbers);
    }
}
