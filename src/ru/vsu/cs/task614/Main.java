package task620;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x;
        double e;
        int n;

        x = getXVar();
        n = getNVar();
        e = getEVar();
        showResult(sumN(n, x));
        showResult(sumNMoreE(n, x, e));
        showResult(sumNMoreEShare10(n, x, e));
        showResult(mathOfFunction(n, x));
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
            return sumN;
        } else {
            return sumN;
        }
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
            if (Math.abs(first) < Math.abs(e)) {
                sumNMoreE += first;
            }
            while (y < n) {
                tempVar = (Math.pow(x, degree) / getFactorial(numberOfFactorial));
                if (Math.abs(tempVar) < Math.abs(e)) {
                    sumNMoreE = sumNMoreE + tempVar;
                }
                numberOfFactorial += 2;
                degree += 2;
                y++;
            }
            return sumNMoreE;
        } else {
            return sumNMoreE;
        }
    }

    public static double sumNMoreEShare10(int n, double x, double e) {
        double sumNMoreEShare10 = 0;
        double tempVar;
        double first = 1;
        int numberOfFactorial = 2;
        int degree = 2;
        sumNMoreEShare10 += first;
        double eShare10 = e / 10;

        if (n >= 1) {
            int y = 0;
            y++;
            if (Math.abs(first) < Math.abs(eShare10)) {
                sumNMoreEShare10 += first;
            }
            while (y < n) {
                tempVar = (Math.pow(x, degree) / getFactorial(numberOfFactorial));
                if (Math.abs(tempVar) < Math.abs(eShare10)) {
                    sumNMoreEShare10 = sumNMoreEShare10 + tempVar;
                }
                numberOfFactorial += 2;
                degree += 2;
                y++;
            }
            return sumNMoreEShare10;
        } else {
            return sumNMoreEShare10;
        }
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
            return mathOfFunct;
        } else {
            return mathOfFunct;
        }
    }

    public static int getFactorial(int f) {
        if (f <= 1) {
            return 1;
        } else {
            return f * getFactorial(f - 1);
        }
    }

    public static double getXVar() {
        double x;

        Scanner s1 = new Scanner(System.in);
        System.out.print("Input X:");
        x = s1.nextDouble();
        return x;
    }

    public static int getNVar() {
        int n;

        Scanner s1 = new Scanner(System.in);
        System.out.print("Input N:");
        n = s1.nextInt();
        return n;
    }

    public static double getEVar() {
        double e;

        Scanner s1 = new Scanner(System.in);
        System.out.print("Input E:");
        e = s1.nextDouble();
        return e;
    }

    public static void showResult(double result) {
        System.out.println("Result: " + result);
    }
}