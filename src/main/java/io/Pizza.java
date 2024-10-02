package io;

public class Pizza {

    private int price; // Total price of the pizza
    private boolean isVeg; // true if pizza is Veg, false if Meat
    private boolean isLarge; // true if the pizza is large

    // Prices for additional options
    private int extraCheesePrice = 1; // Price for extra cheese
    private int extraToppingsPrice = 2; // Price for extra toppings
    private int backPackPrice = 3; // Price for takeaway packaging
    private int largePizzaPrice = 2; // Additional price for large pizza

    private int basePizzaPrice; // Base price of the pizza (without extras)

    // Flags to check if extras are added
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    // Constructor to initialize pizza type and size
    public Pizza(boolean isVeg, boolean isLarge) {
        this.isVeg = isVeg; // Set if pizza is Veg or Meat
        this.isLarge = isLarge; // Set if pizza is large

        // Set the base price based on pizza type
        if (this.isVeg) {
            this.price = 4; // Veg pizza price
        } else {
            this.price = 6; // Meat pizza price
        }

        // Add cost for large size if selected
        if (this.isLarge) {
            this.price += largePizzaPrice; // Add cost for large size
            System.out.println("Large pizza selected. Additional " + largePizzaPrice + " JD added.");
        }

        basePizzaPrice = this.price; // Store base price (veg or meat with large option)
    }

    // Method to add extra cheese to the pizza
    public void addExtraCheese() {
        // Check if extra cheese is already added
        if (!isExtraCheeseAdded) {
            isExtraCheeseAdded = true; // Set the flag
            this.price += extraCheesePrice; // Update total price
            System.out.println("Extra cheese added.");
        } else {
            System.out.println("Extra cheese is already added!!!.");
        }
    }

    // Method to add extra toppings to the pizza
    public void addExtraToppings() {
        // Check if extra toppings are already added
        if (!isExtraToppingsAdded) {
            isExtraToppingsAdded = true; // Set the flag
            this.price += extraToppingsPrice; // Update total price
            System.out.println("Extra toppings added.");
        } else {
            System.out.println("Extra toppings are already added!!!.");
        }
    }

    // Method to opt for takeaway
    public void takeAway() {
        // Check if takeaway option is already opted
        if (!isOptedForTakeAway) {
            isOptedForTakeAway = true; // Set the flag
            this.price += backPackPrice; // Update total price
            System.out.println("Takeaway added.");
        } else {
            System.out.println("Takeaway is already opted!!!.");
        }
    }

    // Method to generate and display the bill
    public void getBill() {
        StringBuilder bill = new StringBuilder(); // StringBuilder for efficient string manipulation
        System.out.println("Pizza price: " + basePizzaPrice + " JD"); // Display base price
        if (isExtraCheeseAdded) {
            bill.append("Extra Cheese added: ").append(extraCheesePrice).append(" JD\n"); // Add extra cheese to bill
        }
        if (isExtraToppingsAdded) {
            bill.append("Extra Toppings added: ").append(extraToppingsPrice).append(" JD\n"); // Add extra toppings to bill
        }
        if (isOptedForTakeAway) {
            bill.append("Takeaway opted: ").append(backPackPrice).append(" JD\n"); // Add takeaway to bill
        }
        bill.append("Total Bill: ").append(this.price).append(" JD\n"); // Display total bill
        System.out.println(bill);
    }
}
