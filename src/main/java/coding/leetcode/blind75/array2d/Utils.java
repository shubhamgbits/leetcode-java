package coding.leetcode.blind75.array2d;

public class Utils {
    public static final int[][] demoArray = {{1,2,3},{4,5,6},{7,8,9}};
    public static void print2dArray(int[][] array){
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<2; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
