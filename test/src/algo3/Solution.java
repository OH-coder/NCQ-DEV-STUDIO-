package algo3;

public class Solution {
    public int solution(int[] a) {
        int somme = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            final int value = Math.abs(a[i]);
            somme += value;
            if (max < value) {
                max = value;
            }
            a[i] = value;
        }
        final int[] counts = new int[max + 1];
        for (int value: a) {
            counts[value]++;
        }
        // O(sum(abs(a)))
        final int[] r = new int[somme + 1];
        for (int i = 1; i < r.length; i++) {
            r[i] = -1;
        }

        for (int i = 1; i < counts.length; i++) {
            for (int j = 0; j < r.length; j++) {
                if (r[j] >= 0) {
                    r[j] = counts[i];
                } else if (j - i >= 0 && r[j - i] > 0) {
                    r[j] = r[j - i] - 1;
                }

            }
        }
        int result = somme;
        for (int i = 0; i < r.length / 2 + 1; i++) {
            if (r[i] >= 0 && result > Math.abs(somme - 2 * i)) {
                result = Math.abs(somme - 2 * i);
            }
        }
        return result;
    }
}
