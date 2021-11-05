public class Exercise4 {
    //inspiration from Elisa//

    public static void main(String[] args) {

        //The stats we have
        int currentPopulations = 331002651;
        int secondsOfNewBirth = 7;
        int secondsOfNewDeath = 13;

        //Stats of how many seconds, minutes, hours and days
        int seconds = 60;
        int minutes = 60;
        int hours = 24;
        int days = 365;

        //Calculations of how many minutes there is in 5 years
        int secondsIn5Years = seconds * minutes * hours * days * 5; //The 5 is years in the future

        //Calculations of birth growth in 5 years
        int birthGrowth = secondsIn5Years/secondsOfNewBirth;
        //Calculations of death growth in 5 years
        int deathGrowth = secondsIn5Years/secondsOfNewDeath;

        //Our growth in 5 years
        int growthIn5Years = birthGrowth - deathGrowth;
        System.out.println("The population will grow with " + growthIn5Years + " people in 5 years");

        //Our sum in 5 years
        int sumOfPopulationIn5Years = currentPopulations + growthIn5Years;
        System.out.println("The sum of people in the US in 5 years is: " + sumOfPopulationIn5Years);
    }
}
