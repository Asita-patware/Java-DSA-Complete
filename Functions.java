import java.util.*;

public class Functions {

    // ---- BASIC FUNCTIONS ----


    // Takes two integers (a and b) and returns their sum.
    public static int sumOfnum(int a , int b){ // parameters/formal parameters
        int sum = a+b;
        return sum ;
    }


    // Takes two integers (a and b) and returns their product.
    public static int calculate_product(int a , int b){
        int product = a * b ;
        return product;
    }
    

    // Function to calculate factorial of a number
    public static int calculate_factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
        // Example Output: calculate_factorial(4) → 24
    }


    // Function to calculate Binary Coefficient nCr
    public static int bincoeff(int n , int r){
        int n_fact = calculate_factorial(n);
        int r_fact = calculate_factorial(r);
        int nmr_fact = calculate_factorial(n-r);

        int bincoeff = (n_fact) / ((r_fact) * (nmr_fact));
        return bincoeff;
        // Example Output: bincoeff(5,2) → 10
    }


    // PRIME NUMBER FUNCTIONS

    // Normal prime check
    public static boolean isPrime(int n){
        if (n<=1) { 
            return false;
        }
        if (n == 2) {
            return true;
        }
        for(int i = 2; i <= n-1; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
        // Example Output: isPrime(7) → true
    }


    // Optimized prime check using √n
    public static boolean isPrimeOptimized(int n){
        if (n <= 1) {
            return false;
        }    
        if (n == 2) {
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
        // Example Output: isPrimeOptimized(9) → false
    }


    // Print all prime numbers till n (primes In Range)
    public static void primesInRange(int n){
        for(int i = 2; i <= n; i++) {
            if (isPrimeOptimized(i)) {
                System.out.print(i + " ");
            }
        }
        // Example Output: primesInRange(10) → 2 3 5 7
    }

    // NUMBER CONVERSION 

    // Convert Binary to Decimal
    public static void binToDec(int binNum){
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int last_digit = binNum % 10;
            decNum = decNum + (last_digit * (int)(Math.pow(2 , pow)));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println(decNum);
        // Example Output: binToDec(101) → 5
    }


    // Convert Decimal to Binary
    public static void DecToBin(int DecNum){
        int pow = 0;
        int BinNum = 0;
        while (DecNum > 0) {
            int rem = DecNum % 2;
            BinNum = BinNum + (rem * (int)(Math.pow(10 , pow)));
            pow++;
            DecNum = DecNum / 2;
        }
        System.out.println(BinNum);
        // Example Output: DecToBin(12) → 1100
    }

    
    // ---- PRACTICE QUESTIONS ----

    // Q1: Compute average of three numbers
    public static float computeAvg(float a, float b, float c){
        return (a + b + c) / 3;
        // Example Output: computeAvg(2,4,6) → 4.0
    }


    // Q2: Check even or odd
    public static boolean isEven(int n){
        return n % 2 == 0;
        // Example Output: isEven(8) → true
    }


    // Q3: Check palindrome number
    public static boolean palindrome(int num){
        int org_num = num;
        int rev = 0;

        while(num > 0){
            int last_digit = num % 10;
            rev = (rev * 10) + last_digit;
            num = num / 10;
        }
        return (org_num == rev);
        // Example Output: palindrome(121) → true
    }


    // Q4: Sum of digits
    public static int cal_sum(int num){
        int sum = 0;
        while (num > 0) {
            int last_digit = num % 10;
            sum += last_digit;
            num /= 10;
        }
        return sum;
        // Example Output: cal_sum(123) → 6
    }


    // ---- MAIN METHOD ----

    public static void main(String[] args){

        // ---- Uncomment any block to test functions ----

        //System.out.println(sumOfnum(2,3));
        //System.out.println(calculate_product(3,5));
        // System.out.println(calculate_factorial(4));  // Output: 24
        // System.out.println(bincoeff(5,2));           // Output: 10
        // System.out.println(isPrime(32));             // Output: false
        // System.out.println(isPrimeOptimized(3));              // Output: true
        // primesInRange(10);                           // Output: 2 3 5 7
        // DecToBin(12);                                // Output: 1100
        // binToDec(101);                               // Output: 5
        // System.out.println(computeAvg(2,4,6));       // Output: 4.0

        
        //  Scanner sc = new Scanner(System.in);
        /* System.out.print("Enter a number: ");                // Output: false
        int n = sc.nextInt();

        if (isEven(n)) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }  */ 


        /* 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (palindrome(num)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        } */
          

        // System.out.println(cal_sum(123));            // Output: 6

    }
}
