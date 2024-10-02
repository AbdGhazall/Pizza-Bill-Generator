package io;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner for user input

        System.out.println("Welcome to the Pizza Bill Generator!");
        System.out.println("Choose your pizza type: ");
        System.out.println("1. Veg Pizza\n2. Meat Pizza");
        int pizzaTypeChoice = scanner.nextInt(); // Get user's pizza choice

        // Ask if the user wants a large pizza
        System.out.println("Do you want a large pizza? (yes/no)");
        boolean isLarge = scanner.next().equalsIgnoreCase("yes"); // Determine if pizza should be large

        Pizza pizza; // Declare a pizza object

        // Create a Pizza object based on user's choice
        if (pizzaTypeChoice == 2) {
            System.out.println("You selected Meat Pizza.");
            pizza = new Pizza(false, isLarge); // Meat Pizza
        } else {
            System.out.println("You selected Veg Pizza.");
            pizza = new Pizza(true, isLarge); // Veg Pizza
        }

        boolean exit = false; // Flag to control the loop
        while (!exit) {
            // Display available actions
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Add Extra Cheese\n2. Add Extra Toppings\n3. Opt for Takeaway\n4. Generate Bill\n5. Exit");
            int action = scanner.nextInt(); // Get user's action choice

            // Perform action based on user's choice
            switch (action) {
                case 1:
                    pizza.addExtraCheese(); // Add extra cheese
                    break;
                case 2:
                    pizza.addExtraToppings(); // Add extra toppings
                    break;
                case 3:
                    pizza.takeAway(); // Opt for takeaway
                    break;
                case 4:
                    pizza.getBill(); // Generate bill
                    break;
                case 5:
                    exit = true; // Exit the loop
                    System.out.println("Thank you for using the Pizza Bill Generator!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again."); // Handle invalid input
            }
        }

        scanner.close(); // Close the scanner
    }
}
