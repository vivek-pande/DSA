import java.util.Arrays;

public class Squares_of_a_Sorted_Array {

    /*
     * Given an integer array nums sorted in non-decreasing order, return an array
     * of the squares of each number sorted in non-decreasing order.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [-4,-1,0,3,10]
     * Output: [0,1,9,16,100]
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     * Example 2:
     * 
     * Input: nums = [-7,-3,2,3,11]
     */
    public static void main(String[] args) {

        int[] nums = { -4, -1, 0, 3, 10 };

        int i = 0;
        int j = nums.length - 1;

        int k = nums.length - 1;
        int[] res = new int[nums.length];
        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                res[k]=nums[i]*nums[i];
                i=i+1;
            }
            else{
                res[k]=nums[j]*nums[j];
                j=j-1;
            }
            k=k-1;
        }
        System.out.println(Arrays.toString(res));

    }

}
