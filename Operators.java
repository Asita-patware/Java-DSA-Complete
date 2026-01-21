import java.util.Scanner;
public class Operators {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    /*     System.out.println("Arithmetic Operators");
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.println("Addition: " + (x + y));
        System.out.println("Subtraction: " + (x - y));
        System.out.println("Multiplication: " + (x * y));
        System.out.println("Division: " + (x / y));
        System.out.println("Modulo: " + (x % y));

        System.out.println("\nUnary Operators");
        int a = 5;
        System.out.println("Original a = " + a);
        System.out.println("Post-increment a++ = " + (a++));
        System.out.println("Now a = " + a);
        System.out.println("Pre-increment ++a = " + (++a));
        System.out.println("Post-decrement a-- = " + (a--));
        System.out.println("Now a = " + a);
        System.out.println("Pre-decrement --a = " + (--a)); */

        System.out.println("\nRelational Operators");
        System.out.println(x + " == " + y + " ? " + (x == y));
        System.out.println(x + " != " + y + " ? " + (x != y));
        System.out.println(x + " > " + y + " ? " + (x > y));
        System.out.println(x + " < " + y + " ? " + (x < y));
        System.out.println(x + " >= " + y + " ? " + (x >= y));
        System.out.println(x + " <= " + y + " ? " + (x <= y));

        System.out.println("\n=== Logical Operators ===");
        boolean p = true;
        boolean q = false;
        System.out.println("p && q = " + (p && q));
        System.out.println("p || q = " + (p || q));
        System.out.println("!p = " + (!p));

        System.out.println("\n=== Assignment Operators ===");
        int z = 10;
        System.out.println("z = " + z);
        z += 5; // z = z + 5
        System.out.println("z += 5 -> " + z);
        z -= 3; // z = z - 3
        System.out.println("z -= 3 -> " + z);
        z *= 2; // z = z * 2
        System.out.println("z *= 2 -> " + z);
        z /= 4; // z = z / 4
        System.out.println("z /= 4 -> " + z);
        z %= 3; // z = z % 3
        System.out.println("z %= 3 -> " + z);

        System.out.println("\n=== Operator Precedence ===");
        int exp1 = 2 + 3 * 4; // Multiplication first
        int exp2 = (2 + 3) * 4; // Parentheses first
        System.out.println("2 + 3 * 4 = " + exp1);
        System.out.println("(2 + 3) * 4 = " + exp2);

        System.out.println("\n=== Practice Question 1: Average of 3 numbers ===");
        System.out.print("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        float avg = (n1 + n2 + n3) / 3.0f; // Use float for correct division
        System.out.println("Average = " + avg);

        System.out.println("\n=== Practice Question 2: Area of Square ===");
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();
        int area = side * side;
        int $ = 24; // just for operator demo
        System.out.println("Area of square = " + area);
        System.out.println("Demo variable $ = " + $);

        System.out.println("\n=== Practice Question 3: Billing with GST ===");
        System.out.print("Enter cost of pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter cost of pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter cost of eraser: ");
        float eraser = sc.nextFloat();

        float totalCost = pencil + pen + eraser;
        float gst = totalCost * 0.18f; // 18% GST
        float grandTotal = totalCost + gst;

        System.out.println("Total cost without GST: " + totalCost);
        System.out.println("GST: " + gst);
        System.out.println("Final bill amount: " + grandTotal);

        sc.close();
    }
}
