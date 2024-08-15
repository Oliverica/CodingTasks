package org.example.e68;

import java.util.Arrays;

public class E68Arrays {
    public static void main(String[] args) {
        // Create an array of characters and store the values 's', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'
        char[] characters = {'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};
        int[] indices = {0, 2, 4, 6, 1, 10};

        // Print the characters at the indices that form the word "syntax"
        for (int index : indices)
            System.out.print(characters[index]);






    }
}
