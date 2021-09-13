package KE5;

import java.util.Map;

public class Stringteilung {

    public int c(int[] z, int n) {
        if (z.length == 1) return n;
        if (z.length == 0) return 0;

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < z.length; i++) {
            int[] leftZ = new int[i];
            int[] rightZ = new int[z.length - i - 1];
            for (int j = 0; j < i; j++) {
                leftZ[j] = z[j];
            }
            for (int j = i + 1; j < z.length; j++) {
                rightZ[j - i - 1] = z[j] - z[i];
                int currentValue = n + c(leftZ, z[i]) + c(rightZ, n - z[i]);
                if (currentValue < result) {
                    result = currentValue;
                }
            }
        }
        return result;
    }

    public int hash(int[] z) {
        int result = 0;
        for (int i = 0; i < z.length; i++) {
            result += Math.pow(2, z[i]);
        }
        return result;
    }

    public int cMemoised(int[] z, int n) {
        int[][] savedValues = new int[n + 1][(int) Math.pow(2, n + 1) - 1];
        return cMemoisedRek(z, n, savedValues);
    }

    public int cMemoisedRek(int[] z, int n, int[][] savedValues) {
        if (z.length == 1) {
            savedValues[n][hash(z)] = n;
            return n;
        }
        if (z.length == 0) return 0;
        int zHash = hash(z);
        if (savedValues[n][zHash] != 0) {
            return savedValues[n][zHash];
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < z.length; i++) {
            int[] leftZ = new int[i];
            int[] rightZ = new int[z.length - i - 1];
            for (int j = 0; j < i; j++) {
                leftZ[j] = z[j];
            }
            for (int j = i + 1; j < z.length; j++) {
                rightZ[j - i - 1] = z[j] - z[i];
                int currentValue = n + c(leftZ, z[i]) + c(rightZ, n - z[i]);
                if (currentValue < result) {
                    result = currentValue;
                }
            }
        }
        savedValues[n][zHash] = result;
        return result;
    }
}
