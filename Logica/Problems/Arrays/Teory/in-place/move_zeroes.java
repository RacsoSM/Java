public class move_zeroes {
    
    public static void main(String[] args) {
        /*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
        Note that you must do this in-place without making a copy of the array. 
        
        Example 1:
        Input: nums = [0,1,0,3,12]
        Output: [1,3,12,0,0]

        Example 2:
        Input: nums = [0]
        Output: [0]

        */

        int nums [] = {0,1,0,3,12};
        System.out.println("ARRAY ORIGINAL");
       remove_duplicates.ImprimeInt(nums);

       moveZeroes(nums);

       System.out.println("\n\nARRAY CAMBIADO");
       remove_duplicates.ImprimeInt(nums);

    }

    public static void moveZeroes(int[] nums) {
        int x=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=0){
                nums[x]=nums[i];
                x++;
            }
        }
    
        for(int i=x;i<nums.length;i++){
            nums[i]=0;
        }
    }
    
}
