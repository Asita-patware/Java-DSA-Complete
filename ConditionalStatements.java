import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. BASIC DECISION MAKING (if-else / else-if)
        // Example 1: Income Tax Calculator (else-if ladder)
        System.out.print("Enter your income: ");
        int income = sc.nextInt();
        int tax;

        if (income <= 500000) {
            tax = 0;
        } else if (income > 500000 && income <= 1000000) {
            tax = (int) (income * 0.20f);
        } else {
            tax = (int) (income * 0.30f);
        }

        System.out.println("Calculated Tax: " + tax);


        // 2. LOGICAL APPLICATIONS

        // Example 2: Largest of 2 Numbers
        int a = 10, b = 20;
        if (a > b) { 
            System.out.println("Largest of two: " + a);
        } else {
            System.out.println("Largest of two: " + b);
        }
        

        // Example 3: Largest of 3 Numbers
        int x = 15, y = 25, z = 10;
        if (x >= y && x >= z) {
            System.out.println("Largest of three: " + x);
        } else if (y >= z) {
            System.out.println("Largest of three: " + y);
        } else {
            System.out.println("Largest of three: " + z);
        }

        // Example 4: Odd or Even
        int number = 7;
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }


        // 3. TERNARY OPERATOR

        // Example 5: Odd or Even using ternary
        int n = 4;
        String result = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println("Ternary Result: " + result);

        // Example 6: Pass or Fail using ternary
        int marks = 89;
        String status = (marks >= 33) ? "Pass" : "Fail";
        System.out.println("Student Status: " + status);


        // 4. SWITCH STATEMENT

        // Example 7: Weekdays using switch
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day");
        }


        // Example 8: Calculator using switch
        int num1 = 10, num2 = 5;
        char operator = '+';

        switch (operator) {
            case '+': System.out.println("Addition: " + (num1 + num2)); break;
            case '-': System.out.println("Subtraction: " + (num1 - num2)); break;
            case '*': System.out.println("Multiplication: " + (num1 * num2)); break;
            case '/': System.out.println("Division: " + (num1 / num2)); break;
            default: System.out.println("Invalid operator");
        }


        // 5. PRACTICE QUESTIONS

        // Q1: Positive or Negative
        System.out.print("Enter any number: ");
        int value = sc.nextInt();

        if (value > 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative Number");
        }

        // Q2: Fever Check
        double temp = 103.5;
        if (temp > 100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You don't have a fever");
        }

        // Q3: Leap Year Check
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        sc.close();
    }
}
