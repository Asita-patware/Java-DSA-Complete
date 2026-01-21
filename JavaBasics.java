import java.util.*;

public class JavaBasics {
    public static void main(String[] args) {

        // Boilerplate Code -- This is the basic structure required to run any Java program.

        // Output in Java
        System.out.println("Hello, Java!");   // prints with newline
        System.out.print("Learning ");        // prints without newline
        System.out.print("GitHub\n");        // prints GitHub and moves to new line


        // Print a Pattern
        System.out.println("Star Pattern:");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");


        // Comments in Java

        // This is a single-line comment

        /*
           This is a multi-line comment
           Used to explain code blocks
        */

    
        // Input in Java (All Methods)
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next();          
        // next() → reads a single word (stops at space)

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);    
        // next().charAt(0) → reads first character from input

        sc.nextLine();                    
        // nextLine() → consumes leftover newline

        System.out.print("Enter a full sentence: ");
        String sentence = sc.nextLine();  
        // nextLine() → reads the entire line including spaces

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();          
        // nextInt() → reads an integer value

        System.out.print("Enter a float: ");
        float price = sc.nextFloat();    
        // nextFloat() → reads decimal (float) value

        System.out.print("Enter a boolean: ");
        boolean flag = sc.nextBoolean(); 
        // nextBoolean() → reads true or false

        System.out.println("\nInputs");
        System.out.println("Word: " + word);
        System.out.println("Character: " + ch);
        System.out.println("Sentence: " + sentence);
        System.out.println("Integer: " + num);
        System.out.println("Float: " + price);
        System.out.println("Boolean: " + flag);

        sc.close();
    }

}
