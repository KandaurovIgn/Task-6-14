package task614;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x = getDoubleValue("X - var");
        int n = getIntValue("N - numbers");
        double e = getDoubleValue("Epsilon");

        showResult(sumN(n, x), "Sum N numbers");
        showResult(sumNMoreE(n, x, e), "Sum N More Epsilon");
        showResult(sumNMoreEShare10(n, x, e), "Sum N More E share 10");
        showResult(mathOfFunction(n, x), "Math of Function");
    }

    public static double sumN(int n, double x) {
        double sumN = 0;
        double first = 1;
        int numberOfFactorial = 2;
        int degree = 2;

        if (n >= 1) {
            int y = 0;
            sumN += first;
            y++;
            while (y < n) {
                sumN = sumN + (Math.pow(x, degree) / getFactorial(numberOfFactorial));
                numberOfFactorial += 2;
                degree += 2;
                y++;
            }
        }
        return sumN;
    }

    public static double sumNMoreE(int n, double x, double e) {
        double sumNMoreE = 0;
        double first = 1;
        int numberOfFactorial = 2;
        int degree = 2;
        double tempVar;

        if (n >= 1) {
            int y = 0;
            y++;
            if (Math.abs(first) > Math.abs(e)) {
                sumNMoreE += first;
            }

            while (y < n) {
                tempVar = (Math.pow(x, degree) / getFactorial(numberOfFactorial));
                if (Math.abs(tempVar) > Math.abs(e)) {
                    sumNMoreE = sumNMoreE + tempVar;
                }
                numberOfFactorial += 2;
                degree += 2;
                y++;
            }
        }
        return sumNMoreE;
    }

    public static double sumNMoreEShare10(int n, double x, double e) {
        double sumNMoreEShare10 = 0;
        double tempVar;
        double first = 1;
        int numberOfFactorial = 2;
        int degree = 2;
        double eShare10 = e / 10;

        if (n >= 1) {
            int y = 0;
            y++;
            if (Math.abs(first) > Math.abs(eShare10)) {
                sumNMoreEShare10 += first;
            }

            while (y < n) {
                tempVar = (Math.pow(x, degree) / getFactorial(numberOfFactorial));
                if (Math.abs(tempVar) > Math.abs(eShare10)) {
                    sumNMoreEShare10 = sumNMoreEShare10 + tempVar;
                }
                numberOfFactorial += 2;
                degree += 2;
                y++;
            }
        }
        return sumNMoreEShare10;
    }

    public static double mathOfFunction(int n, double x) {
        double mathOfFunct = 0;
        double first = 1;
        int numberOfFactorial = 2;
        int degree = 2;

        if (n >= 1) {
            int y = 0;
            mathOfFunct += first;
            y++;

            while (y < n) {
                mathOfFunct = mathOfFunct + (Math.pow(x, degree) / getFactorial(numberOfFactorial));
                numberOfFactorial += 2;
                degree += 2;
                y++;
            }
        }
        return mathOfFunct;
    }

    public static int getFactorial(int f) {
        if (f <= 1) {
            return 1;
        } else {
            return f * getFactorial(f - 1);
        }
    }

    public static int getIntValue(String valueName) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input " + valueName + ":");

        return scanner.nextInt();
    }

    public static double getDoubleValue(String valueName) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input " + valueName + ":");

        return scanner.nextDouble();
    }

    public static void showResult(double result, String typeOfResult) {
        System.out.println("Result " + typeOfResult + ": " + result);
    }
}
