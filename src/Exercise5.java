import java.util.Random;

public class Exercise5 {

    //In your own words - explain the following program in 250 words or less.

    //This tells us that we are in the main method/class
    public static void main(String[] args) {
        //We are making a for loop that goes through the numbers 0 to 10
        for (int i = 0; i < 10; i++) {
            //We are calling the method "generateRandomInteger()" for random
            int random = generateRandomInteger();
            //and then we print out the method we just named random
            System.out.println(random);
        }
        //We are printing out the sentence "Random integers generated
        System.out.println("Random integers generated");
    }
    //Here we are making the method that we are using in our main method
    public static int generateRandomInteger(){
        //We are making a new Random with the name randomGenerator
        Random randomGenerator = new Random();
        //Returning the next number, but is no more than 10 times
        return randomGenerator.nextInt(10);

        /* So to summarize. The program is set to generate a random number between 0 - 10.
        A for loop is used to go through the numbers, and the method generateRandomInteger
        is picking a random number every time it's run through the for loop.
        When the for loop stops, the program wil print "Random integers generated"
         */
    }
}
