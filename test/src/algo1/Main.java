package algo1;

import algo2.Ladder;
import algo3.Solution;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayOfOperations arrayOfOperations = new ArrayOfOperations();
        int[] res = arrayOfOperations.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4});
        System.out.println(Arrays.toString(res));
        Ladder ladder=new Ladder();
        int[] result=ladder.solution(new int[]{ 4, 4, 5, 5, 1},new int[]{3,2,4,3,1});
        System.out.println(Arrays.toString(result));
        Solution solution=new Solution();
       int minSum= solution.solution(new int[]{ 1, 5, 2, -2});
       System.out.println(minSum);
    }
}
