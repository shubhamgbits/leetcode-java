package coding.leetcode.blind75.dp.q2HouseRobbers;

public class HouseRobber {

    public static int robber(int[] nums){
        int first = 0;
        int second = nums[0];

        for(int i = 1; i<nums.length; i++){
            int temp = second;
            second = Math.max(second, nums[i] + first);
            first = temp;
        }

        return second;
    }

    public static int badSolution(int[] nums) {
        // Fails for [2, 1, 1, 2] where answer is 4
        int length = nums.length;

        int money = 0;
        for (int i=0; i<length; i=i+2){
            money += nums[i];
        }

        int money2 = 0;
        for(int i =1; i<length; i=i+2){
            money2 += nums[i];
        }
        return Math.max(money2,money);
    }
}
