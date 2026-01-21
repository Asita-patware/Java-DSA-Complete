import java.util.*;
public class VariablesAndDatatypes {

    public static void main(String[] args) {

        // Basic Data Types in Java
        byte b = 8;
        System.out.println(b);

        char ch = 'a';
        System.out.println(ch);

        boolean var = true;
        System.out.println(var);

        short sh = 16;
        System.out.println(sh);

        int i = 32;
        System.out.println(i);

        long L = 64l;
        System.out.println(L);

        float f = 32.5f;
        System.out.println(f);  // Output: 32.5


        // Simple Sum and Product Example
        int a = 10;
        int b1 = 5;

        int sum = a + b1;
        int product = a * b1;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // Area of Circle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float radius = sc.nextFloat();

        float areaCircle = 3.14f * radius * radius;    // Formula: π × r²
        System.out.println("Area of circle: " + areaCircle);


        // Type Casting Example
        float a2 = 25.12f;
        int b2 = (int) a2;   // Explicitly converting float to int
        System.out.println("Float to Int: " + b2); // Output: 25

        char ch1 = 'A';
        int number = ch1;      // Implicit type conversion (char → int)
        System.out.println("ASCII of A: " + number);    // Output: 65


        // TYPE PROMOTION IN EXPRESSIONS
        // Example 1:
        // byte, short, and char are automatically promoted to int in expressions

        byte num1 = 5;        // 1 byte
        short num2 = 10;      // 2 bytes
        char num3 = 'A';      // character (ASCII value = 65)

        int result1 = num1 + num2 + num3;  
        // Here, num1, num2, & num3 are first promoted to int before addition
        System.out.println("Result1 (promoted to int): " + result1);    // Output: 80


        // Example 2:
        // When int, float, and long are used together,
        // the final result is promoted to the largest data type → double

        int x = 10;        // integer
        float y = 20.5f;   // decimal (float)
        long z = 30L;      // long integer

        double result2 = x + y + z;
        // x → promoted to float
        // z → promoted to float
        // final result → promoted to double
        System.out.println("Result2 (promoted to double): " + result2);     // Output: 60.5


        // PracticeQ1: Average of 3 Numbers
        System.out.print("Enter any 1st number:");
        int n1 = sc.nextInt();
        System.out.print("Enter any 2nd number:");
        int n2 = sc.nextInt();
        System.out.print("Enter any 3rd number:");
        int n3 = sc.nextInt();

        float avg = (n1 + n2 + n3) / 3.0f;         // Divide by 3.0f for float result
        System.out.println("The average is: " + avg);


        // PracticeQ2: Area of Square Example
        System.out.print("Enter side of square:");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Area of square is: " + area);


        // PracticeQ3: Billing System (Total Cost + GST Example)
        System.out.print("Enter cost of pencil:");
        float pencil = sc.nextFloat();

        System.out.print("Enter cost of pen:");
        float pen = sc.nextFloat();

        System.out.print("Enter cost of eraser:");
        float eraser = sc.nextFloat();

        float total_cost = pencil + pen + eraser; // Calculates total
        float gst = (total_cost * 0.18f);         // GST = 18%
        float grand_total = total_cost + gst;

        System.out.println("Total cost without gst: " + total_cost);
        System.out.println("GST: " + gst);
        System.out.println("Final Bill Amount: " + grand_total);

        // PracticeQ4: Identifier Rules
        int $ = 24;  // valid identifier         // '$' is valid in Java identifiers
        System.out.println("Value of $: " + $);

        sc.close();
    }
}
