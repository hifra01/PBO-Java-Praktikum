package polymorphism.overloading;

import sun.security.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;

public class Hitung {

    public static int maxNumber(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static double maxNumber(double num1, double num2) {
        return Math.max(num1, num2);
    }

    public static double maxNumber(int num1, double num2) {
        return Math.max(num1, num2);
    }

    public static double maxNumber(double num1, int num2) {
        return Math.max(num1, num2);
    }

    public static int maxNumber(int[] nums) {
        return max(nums);
    }

    private static int max(int[] t) {
        int maximum = t[0];   // start with the first value
        for (int i = 1; i < t.length; i++) {
            if (t[i] > maximum) {
                maximum = t[i];   // new maximum
            }
        }
        return maximum;
    }

}
