package com.david.mdc_junit5;

/**
 *
 * @author David Rodrigues
 */
public class MathUtil {

    public static int mdc(int a, int b) {
        if (b > 0 && a % b == 0) {
            return b;
        }
        return -1;
    }
}
