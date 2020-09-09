package com.famcs;
import java.util.Scanner;

public class Main {

    public static double factorial(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }
        return factorial(n - 1) * n;

    }

    public static double tailorSeries(double x, int k) {

        double eps = Math.pow(10, -k);
        double result = 0;
        double v = 1;
        int i = 0;
        while (Math.abs(v / factorial(i)) >= eps) {
            result += v / factorial(i);
            v *= x;
            i++;
        }
        return result;

    }

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Input x and k");
            double x = in.nextDouble();
            int k = in.nextInt();
            in.close();
            System.out.printf("exp(" + x + ") with Math.exp() = %.3f\n",Math.exp(x));
            System.out.printf("exp(" + x + ") with TailorSeries() = %.3f\n",tailorSeries(x,k));
        }

        catch (Exception exception) {
            System.out.println(exception);
        }

    }

}

