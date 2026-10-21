package se.lexicon;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ShoppingList {

    static void main() {
        //Creating an empty list
        ArrayList<String> items = new ArrayList<>();
        //Adding items in the list
        items.add("Apples");
        items.add("Eggs");
        items.add("Bread");
        items.add("Milk");
        items.add("Juice");

        //using for loop to print items
        IO.println("Before removing: ");
        for (int i = 0; i < items.size(); i++) {
            IO.println((i + 1) + "- " + items.get(i));
        }
        //  Removing one item
        items.remove("Milk"); // Removes "Milk"

        //Printing list after removing Milk
        IO.println("After removing: ");
        for (int j = 0; j < items.size(); j++) {
            IO.println((j + 1) + "- " + items.get(j));
        }
    }
}
