package org.example.e106;

public class E106StringBuilder {
    public static void main(String[] args) {

        //Instantiate a StringBuffer object
        StringBuffer sb = new StringBuffer();

        //Append values to the StringBuffer
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        //Convert content to uppercase
        String result = sb.toString().toUpperCase();
        System.out.println(result);

    }
}
