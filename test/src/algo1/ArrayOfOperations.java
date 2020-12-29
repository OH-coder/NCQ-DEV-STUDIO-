package algo1;

import java.util.*;

public class ArrayOfOperations {
    public int[] solution(int N, int[] A) {
        int[] result = new int[N];
        int max = 0;
        int reset = 0;

        for (int K = 0; K < A.length; K++)
        {
            if (A[K] < 1 || A[K] > N + 1)
                throw new IllegalArgumentException();

            if (A[K] >= 1 && A[K] <= N)
            {
                if (result[A[K] - 1] < reset) {
                    result[A[K] - 1] = reset + 1;
                } else {
                    result[A[K] - 1]++;
                }

                if (result[A[K] - 1] > max)
                {
                    max = result[A[K] - 1];
                }
            }
            else
            {
                reset = max;
            }
        }

        for (int i = 0; i < result.length; i++)
            result[i] = Math.max(reset, result[i]);
        return result;
    }
}
