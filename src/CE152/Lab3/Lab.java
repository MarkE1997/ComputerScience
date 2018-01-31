package CE152.Lab3;

import java.util.Arrays;


public class Lab {
    static double sum(double[] x) {
        double total = 0;
        for (double aX : x) {
            total = total + aX;
        }
        return total;
    }
    static double mean(double[] x) {
        return sum(x) / x.length;
    }

    static double min(double[] x) {
        Arrays.sort(x);
        return x[0];
    }

    static double max(double[] x) {
        Arrays.sort(x);
        return x[x.length -1];
    }

}
