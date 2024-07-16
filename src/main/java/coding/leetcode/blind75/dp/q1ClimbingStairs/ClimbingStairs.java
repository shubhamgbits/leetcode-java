package coding.leetcode.blind75.dp.q1ClimbingStairs;

public class ClimbingStairs {

    public static void solve(int steps){
        int[] dp = new int[steps+1];

        dp[1] = 1;
        dp[2] = 2;


    }

    public static int solveWithNoExtraMemory(int steps){
        int one = 1;
        int two = 1;

        while(steps>1){
            int temp = two;
            two = one + two;
            one = two;
            steps--;
        }
        return two;
    }

}
