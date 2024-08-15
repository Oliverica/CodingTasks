package org.example.e88;

public class E88ClassAndObject {

    public static void main(String[] args) {
        // Create a class named 'Dog'

        // Declare String variables named 'breed', 'name', and 'color'

        // Declare methods named 'bark()', 'run()', and 'play()' that print messages in the specified format

        // Create the first object of the class 'Dog' with breed = "Husky", name = "AnyName", color = "AnyColor"
        Dog dog1 = new Dog();
        dog1.breed = "Husky";
        dog1.name = "Aris";
        dog1.color = "grey";

        dog1.bark();
        dog1.run();
        dog1.play();

        // Create the third object of the class 'Dog' with breed = "Labrador", name = "AnyName", color = "AnyColor"
        Dog dog2 = new Dog();
        dog2.breed = "Labrador";
        dog2.name = "Holly";
        dog2.color = "black";

        dog2.bark();
        dog2.run();
        dog2.play();
        // Call the methods 'bark()', 'run()', and 'play()' for each object


    }
}
