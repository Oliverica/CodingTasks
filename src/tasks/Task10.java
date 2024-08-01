package tasks;


import java.util.HashSet;
import java.util.Set;

public class Task10 {
    public static void main(String[] args) {

        //Write a program to print out duplicate elements from an Array of Strings

        String[] duplicateEl = {"Potato", "Tomato", "Olive", "Cheese", "Tomato", "Olive", "Banana"};

        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String element : duplicateEl) {

            if (!seen.add(element)) {
                duplicates.add(element);
            }
        }
        System.out.println("Duplicate elements: " + duplicates);
    }
}

