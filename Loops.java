import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 1. WHILE LOOP EXAMPLES

        // Print numbers from 1 to 10
        int counter1 = 1;
        while (counter1 <= 10) {
            System.out.println(counter1);
            counter1++;
        }


        // Print numbers from 1 to n
        System.out.print("Enter n: ");
        int n1 = sc.nextInt();
        int counter2 = 1;
        while (counter2 <= n1) {
            System.out.println(counter2);
            counter2++;
        }


        // Sum of first n natural numbers
        System.out.print("Enter n: ");
        int n2 = sc.nextInt();
        int sum = 0;
        int i1 = 1;
        while (i1 <= n2) {
            sum += i1;
            i1++;
        }
        System.out.println("Sum = " + sum);


        // Square pattern using while loop
        int lines = 1;
        while (lines <= 4) {
            System.out.println("* * * *");
            lines++;
        }


        // 2. FOR LOOP 

        // Square pattern using for loop
        for (int line = 1; line <= 4; line++) {
            System.out.println("* * * *");
        }


        // Reverse digits of a number
        int num1 = 10899;
        while (num1 > 0) {
            int lastDigit = num1 % 10;
            System.out.print(lastDigit);
            num1 /= 10;
        }
        System.out.println();


        // Reverse a number and store it
        int num2 = 10899;
        int reverse = 0;
        while (num2 > 0) {
            int lastDigit = num2 % 10;
            reverse = reverse * 10 + lastDigit;
            num2 /= 10;
        }
        System.out.println(reverse);


        // 3. DO-WHILE LOOP

        // Print "Hello World" 10 times
        int i2 = 1;
        do {
            System.out.println("Hello World");
            i2++;
        } while (i2 <= 10);

      
        // 4. JUMP STATEMENTS

        // Stop when number divisible by 10 (break)
        int input;
        do {
            System.out.print("Enter a number: ");
            input = sc.nextInt();
            if (input % 10 == 0) {
                break;
            }
            System.out.println(input);
        } while (true);


        // Continue example in for loop
        for (int i3 = 1; i3 <= 5; i3++) {
            if (i3 == 3) {
                continue;
            }
            System.out.println(i3);
        }


        // 5. PRACTICE QUESTIONS

        // Q1: How many times "Hello" is printed?
        for (int i4 = 0; i4 < 5; i4++) {
            System.out.println("Hello");
            i4 += 2;
        }
        // Output: Hello printed 2 times


        // Q2: Sum of even and odd numbers (while loop)
        System.out.print("Enter number of integers: ");
        int count1 = sc.nextInt();

        int evenSum1 = 0;
        int oddSum1 = 0;
        int i5 = 1;

        System.out.print("Enter " + count1 + " numbers: ");
        while (i5 <= count1) {
            int value = sc.nextInt();
            if (value % 2 == 0) {
                evenSum1 += value;
            } else {
                oddSum1 += value;
            }
            i5++;
        }

        System.out.println("Sum of even numbers: " + evenSum1);
        System.out.println("Sum of odd numbers: " + oddSum1);


        // Q3: Sum of even and odd numbers (do-while loop)
        System.out.print("Enter number of integers: ");
        int count2 = sc.nextInt();

        int evenSum2 = 0;
        int oddSum2 = 0;
        int i6 = 1;

        System.out.print("Enter " + count2 + " numbers: ");
        do {
            int value = sc.nextInt();
            if (value % 2 == 0) {
                evenSum2 += value;
            } else {
                oddSum2 += value;
            }
            i6++;
        } while (i6 <= count2);

        System.out.println("Sum of even numbers: " + evenSum2);
        System.out.println("Sum of odd numbers: " + oddSum2);


        // Q4: Factorial of a number
        System.out.print("Enter a number: ");
        int factNum = sc.nextInt();

        long fact = 1;
        if (factNum < 0) {
            System.out.println("Factorial not defined for negative numbers");
        } else {
            for (int i7 = 1; i7 <= factNum; i7++) {
                fact *= i7;
            }
            System.out.println("Factorial = " + fact);
        }


        // Q5: Multiplication table
        System.out.print("Enter a number: ");
        int tableNum = sc.nextInt();

        for (int i8 = 1; i8 <= 10; i8++) {
            System.out.println(tableNum + " * " + i8 + " = " + (tableNum * i8));
        }

        
        // Q6: Scope explanation
        for (int i9 = 0; i9 <= 5; i9++) {
            System.out.println("i = " + i9);
        }
        // System.out.println(i9);  // Error: i9 is out of scope


        // Q7: Prime number check
        System.out.print("Enter a number: ");
        int primeNum = sc.nextInt();

        boolean isPrime = true;
        if (primeNum <= 1) {
            isPrime = false;
        } else {
            for (int i10 = 2; i10 <= Math.sqrt(primeNum); i10++) {
                if (primeNum % i10 == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

        sc.close();
    }
}
