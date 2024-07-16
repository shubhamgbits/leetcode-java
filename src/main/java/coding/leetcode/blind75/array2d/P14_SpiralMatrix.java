package coding.leetcode.blind75.array2d;

import java.util.ArrayList;
import java.util.List;

public class P14_SpiralMatrix extends Utils{
    public List<Integer> spiralOrder(int[][] matrix) {

        int left = 0, right = matrix[0].length, top = 0, bottom = matrix.length;

        //System.out.println(bottom);


        List<Integer> result = new ArrayList<Integer>();

        while(left<right && top<bottom){
            for(int i = left; i<right; i++)
                result.add(matrix[top][i]);
            top++;

            for(int i= top; i<bottom; i++)
                result.add(matrix[i][right-1]);
            right--;

            if(!(left<right && top<bottom))
                break;

            for(int i= right-1; i>left-1; i--)
                result.add(matrix[bottom-1][i]);
            bottom--;

            for(int i = bottom-1; i>top-1; i--)
                result.add(matrix[i][left]);
            left++;
        }

        return result;
    }
}
