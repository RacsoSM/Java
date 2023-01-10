public class largest_number {
    public static void main(String[] args){
        /*You are given an integer array nums where the largest integer is unique.
        Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise. 
        
        Example 1:
        Input: nums = [3,6,1,0]
        Output: 1
        Explanation: 6 is the largest integer.
        For every other number in the array x, 6 is at least twice as big as x.
        The index of value 6 is 1, so we return 1.

        Example 2:
        Input: nums = [1,2,3,4]
        Output: -1
        Explanation: 4 is less than twice the value of 3, so we return -1.

        Constraints:
        2 <= nums.length <= 50
        0 <= nums[i] <= 100
        The largest element in nums is unique. 
        */

        int nums [] = {3,6,1,0};
        System.out.println("ARRAY ORIGINAL");
        ImprimeInt(nums);

        System.out.println("EL RESULTADO ES EL INDEX:  "+dominantIndex(nums));
    }

   

     public static int dominantIndex(int[] nums) {
        int sec=-1,may=-1,k=0;
        
        for(int i=0;i<nums.length;i++){
           if(nums[i]>may){
              may=nums[i];
              k=i;
           }
        }
        
        for(int y=0;y<nums.length;y++){
            if(nums[y]>sec && nums[y]<may){
                sec=nums[y];
            }
        }
        
        if((may/2)>=sec) {
            return k;
        }
     
        return -1;
    }

    public static void ImprimeInt(int[] V){
        for(int i:V){
            System.out.println("["+i+"]");
        }
    }
    
}
