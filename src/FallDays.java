import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FallDays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        String userResponse = "";
        //creating arraylist for colors
        ArrayList<String> colors = new ArrayList<>();
        //creating arraylist for drinks
        ArrayList<String> drinks = new ArrayList<>();

        //populating colors arraylist
        colors.add("red");
        colors.add("brown");
        colors.add("yellow");
        colors.add("orange");

        //populating drinks arraylist
        drinks.add("pumpkin");
        drinks.add("spiced latte");
        drinks.add("chai tea");
        drinks.add("hot cocoa");

        //saving the size of colors arraylist in index variable
        int index = colors.size();
        //saving the size of drinks arraylist in index2 variable
        int index2 = drinks.size();

        //create a Loop to prompt the user
        do{
            System.out.println("What's the day? ");
            String input = keyboard.nextLine();

            //generating random index from the colors arraylist
            int colorIndex = rand.nextInt(index);

            //getting value from randomly generated index with 'get()' method
            String randomColor = colors.get(colorIndex);

            //generating random index from the drinks arraylist
            int drinkIndex = rand.nextInt(index2);

            //getting value from randomly generated index with 'get()' method
            String randomDrink = drinks.get(drinkIndex);

            //printing the value saved in 'randomDrink' variable
            System.out.println("\nPerfect fall day for a cup of " + randomDrink + ".");

            //printing the value saved in 'randomColor' variable
            System.out.println("The color of the leaves are " + randomColor);

            //prompt the user again
            System.out.println("Would you like to enter another day Y(yes) or N(no) :");
            userResponse = keyboard.nextLine();

            //loop ends if the user enter 'n'
        } while (!userResponse.equalsIgnoreCase("n"));
        keyboard.close();
    }
}
