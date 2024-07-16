package coding.leetcode.blind75.dp.q2HouseRobbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HouseRobberCircularHouses {
    public static int rob(int[] nums){
        if (Arrays.asList(1, 2, 3).contains(nums.length))
                return Arrays.stream(nums).max().getAsInt();
        return Math.max(helper(Arrays.copyOfRange(nums, 0, nums.length)), helper(Arrays.copyOfRange(nums, 1, nums.length-1)));
    }

    public static int helper(int[] nums){
        int first = 0;
        int second = nums[0];
        int temp = second;

        for(int i=1; i<nums.length;i++){
            temp = second;
            second = Math.max(second, first+nums[i]);
            first = temp;
        }

        return second;
    }
}
