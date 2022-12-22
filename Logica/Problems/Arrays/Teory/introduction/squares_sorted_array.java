import java.util.Arrays;
public class squares_sorted_array {
    
    public static void main(String[] args) {
     /*
      * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

      Example 1: 
      Input: nums = [-4,-1,0,3,10]
      Output: [0,1,9,16,100]

      Example 2:
      Input: nums = [-7,-3,2,3,11]
      Output: [4,9,9,49,121]
      */
        int nums [] = {-4,-1,0,3,10};
        System.out.println("ARRAY ORIGINAL");
        max_consecutive_ones.ImprimeInt(nums);

        int sq [] = new int [nums.length];


        sq = sortedSquares(nums);
        System.out.println("\n\nARRAY FINAL, AL CUADRADO Y ORDENADO");
        max_consecutive_ones.ImprimeInt(sq);
    }

    public static int[] sortedSquares(int[] nums) {
        int sq [] = new int [nums.length];
        
        for (int i=0; i<nums.length;i++){
            sq[i] = nums[i]*nums[i];
            System.out.println(sq[i]);
        }
        
        Arrays.sort(sq);
        return sq;
    }

    


}
