package algo2;

public class Ladder {
    public int[] solution(int[] A, int[] B) {
        int L = A.length;
        int max = 0;
        for (int i = 0; i < L; i++) {
            max = Math.max(A[i], max);
        }
        int[] ladder = new int[max+1];
        ladder[0] =1;
        ladder[1] =1;
        for(int i=2; i<= max; i++){
            ladder[i] = (ladder[i-1] + ladder[i-2]) % (1 << 30);
        }
        int[] results = new int[L];
        for(int i=0; i<L; i++){
            results[i] = ladder[A[i]] % (1 << B[i]);
        }

        return results;
    }
}
