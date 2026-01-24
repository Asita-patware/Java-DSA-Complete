public class PatternPartOne {

    public static void main(String[] args) {

        // 1. Star Pattern (Increasing)
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();


        // 2. Inverted Star Pattern (Approach 1)
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();


        // 3. Inverted Star Pattern (Approach 2 using n)
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();


        // 4. Number Pattern (1 12 123 1234)
        int num = 4;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();


        // 5. Character Pattern (A AB ABC ABCD)
        int limit = 4;
        char ch = 'A';
        for (int i = 1; i <= limit; i++) {
            for (int chars = 1; chars <= i; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
