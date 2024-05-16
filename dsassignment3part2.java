// Name: Chidera Anamege


import java.util.Scanner;
import java.util.Random;

public class dsassignment3part2 {
    public static void main(String[] args) {

        // the given list of states and capitals
        String[][] statesAndCapitals = {
                {"Alabama", "Montgomery"},
                {"Alaska", "Juneau"},

                {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"},
                {"California", "Sacramento"},

                {"Colorado", "Denver"},
                {"Connecticut", "Hartford"},
                {"Delaware", "Dover"},
                {"Florida", "Tallahassee"},

                {"Georgia", "Atlanta"},
                {"Hawaii", "Honolulu"},
                {"Idaho", "Boise"},
                {"Illinois", "Springfield"},

                {"Maryland", "Annapolis"},
                {"Minnesota", "Saint Paul"},
                {"Iowa", "Des Moines"},

                {"Maine", "Augusta"},
                {"Kentucky", "Frankfort"},
                {"Indiana", "Indianapolis"},
                {"Kansas", "Topeka"},

                {"Louisiana", "Baton Rouge"},
                {"Oregon", "Salem"},
                {"Oklahoma", "Oklahoma City"},

                {"Ohio", "Columbus"},
                {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismark"},

                {"New York", "Albany"},

                {"New Mexico", "Santa Fe"},
                {"New Jersey", "Trenton"},
                {"New Hampshire", "Concord"},

                {"Nevada", "Carson City"},
                {"Nebraska", "Lincoln"},
                {"Montana", "Helena"},
                {"Missouri", "Jefferson City"},

                {"Mississippi", "Jackson"},
                {"Massachusettes", "Boston"},
                {"Michigan", "Lansing"},

                {"Pennslyvania", "Harrisburg"},
                {"Rhode Island", "Providence"},

                {"South Carolina", "Columbia"},
                {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"},
                {"Texas", "Austin"},

                {"Utah", "Salt Lake City"},
                {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"},

                {"Washington", "Olympia"},
                {"West Virginia", "Charleston"},
                {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}

        };

        // this will be for user input
        Scanner sc = new Scanner(System.in);

        // a random number generator for selecting a state
        Random random = new Random();

        int totalCorrectAnswers = 0;
        int numberOfQuestions = 5;

        // this loop will loop the questions, and randomized generation
        for (int i = 0; i < numberOfQuestions; i++) {

            int randomStateIn = random.nextInt(statesAndCapitals.length);
            String state = statesAndCapitals[randomStateIn][0];
            String capital = statesAndCapitals[randomStateIn][1];

            // this is where the user will get to guess the capital
            System.out.println("The capital of " + state + " is ______. ");
            String userInput = sc.nextLine();

            // this checks if the answer is correct and makes the question/answer case-insensitive
            if (userInput.equalsIgnoreCase(capital)) {
                System.out.println("Correct!");
                totalCorrectAnswers++;
            } else {
                System.out.println("Incorrect. The capital of " + state + " is " + capital + ".");
            }

            System.out.println();
        }

        // this will display the total number of correct answers
        System.out.println("You got " + totalCorrectAnswers + " out of " + numberOfQuestions + " correct.");
    }
}
