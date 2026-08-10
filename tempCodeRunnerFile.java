import java.util.Scanner;

public class AllPragrams {

    // 1. Addition, Subtraction, Multiplication and Division
    static void arithmeticOperations(Scanner sc) {

        System.out.println("\n--- 1. Arithmetic Operations ---");

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));

        if (b != 0) {
            System.out.println("Division = " + (a / b));
        } else {
            System.out.println("Division is not possible by zero.");
        }
    }


    // 2. Even or Odd
    static void evenOdd(Scanner sc) {

        System.out.println("\n--- 2. Even or Odd ---");

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }


    // 3. Positive or Negative
    static void positiveNegative(Scanner sc) {

        System.out.println("\n--- 3. Positive or Negative ---");

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println(n + " is Positive");
        } else if (n < 0) {
            System.out.println(n + " is Negative");
        } else {
            System.out.println(n + " is Zero");
        }
    }


    // 4. Leap Year
    static void leapYear(Scanner sc) {

        System.out.println("\n--- 4. Leap Year ---");

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if ((year % 400 == 0) ||
            (year % 4 == 0 && year % 100 != 0)) {

            System.out.println(year + " is a Leap Year");

        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }


    // 5. Largest of 3 Numbers
    static void largestOfThree(Scanner sc) {

        System.out.println("\n--- 5. Largest of 3 Numbers ---");

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int largest;

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("Largest number = " + largest);
    }


    // 6. Divisible by 3 or 5
    static void divisibleByThreeOrFive(Scanner sc) {

        System.out.println("\n--- 6. Divisible by 3 or 5 ---");

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n % 3 == 0 || n % 5 == 0) {
            System.out.println(n + " is divisible by 3 or 5");
        } else {
            System.out.println(n + " is not divisible by 3 or 5");
        }
    }


    // 7. Prime Number
    static void primeNumber(Scanner sc) {

        System.out.println("\n--- 7. Prime Number ---");

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {

            for (int i = 2; i <= Math.sqrt(n); i++) {

                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }
    }


    // 8. Perfect Number
    static void perfectNumber(Scanner sc) {

        System.out.println("\n--- 8. Perfect Number ---");

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {

            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == n && n > 0) {
            System.out.println(n + " is a Perfect Number");
        } else {
            System.out.println(n + " is not a Perfect Number");
        }
    }


    // 9. Armstrong Number
    static void armstrongNumber(Scanner sc) {

        System.out.println("\n--- 9. Armstrong Number ---");

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int original = n;
        int temp = n;
        int digits = 0;

        // Count digits
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        temp = n;
        int sum = 0;

        // Calculate Armstrong sum
        while (temp != 0) {

            int digit = temp % 10;

            sum = sum + (int) Math.pow(digit, digits);

            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println(n + " is an Armstrong Number");
        } else {
            System.out.println(n + " is not an Armstrong Number");
        }
    }


    // 10. Prime Numbers Between a Range
    static void primeNumbersInRange(Scanner sc) {

        System.out.println("\n--- 10. Prime Numbers in Range ---");

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int n = start; n <= end; n++) {

            if (n <= 1) {
                continue;
            }

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {

                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(n + " ");
            }
        }

        System.out.println();
    }


    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("       JAVA PROGRAM COLLECTION");
        System.out.println("====================================");

        arithmeticOperations(sc);
        evenOdd(sc);
        positiveNegative(sc);
        leapYear(sc);
        largestOfThree(sc);
        divisibleByThreeOrFive(sc);
        primeNumber(sc);
        perfectNumber(sc);
        armstrongNumber(sc);
        primeNumbersInRange(sc);

        sc.close();
    }
}