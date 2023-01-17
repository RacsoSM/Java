public class two_sum {
    public static void main(String[] args) {
        /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.
        Debe de tomarse los numeros en cualquier posicion del array
        
        Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        Example 2:
        Input: nums = [3,2,4], target = 6
        Output: [1,2]

        Example 3:
        Input: nums = [3,3], target = 6
        Output: [0,1]

        Constraints:
        2 <= nums.length <= 104
        -109 <= nums[i] <= 109
        -109 <= target <= 109
        Only one valid answer exists.
        */
        int target = 18;
        int arr [] = {2,7,11,15};
        twoSum(arr, target);
       
    }
    public static int[] twoSum(int[] nums, int target) {
        int arr [] = new int [2];
        int x=0,aux=0;

        for(int i=0;i<nums.length;i++){
          for(int k=i+1;k<nums.length;k++){
            if(nums[i]+nums[k]==target){
                arr[x]=i;
                arr[x+1]=k;
                imprimeInt(arr);
                return arr;
            }
          }
        }
        imprimeInt(arr);
        return arr;
    }
    public static void imprimeInt (int [] nums){
        for(int i:nums){
            System.out.print(i+",");
        }
    }
    
}
