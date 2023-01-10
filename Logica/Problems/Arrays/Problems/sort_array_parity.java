import remove_duplicates; //IMPORTAMOS ESTE ARCHIVO PARA USAR SU CLASE IMPRIME INT 
public class sort_array_parity {

    public static void main(String[] args) {
        
        /*Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
        Return any array that satisfies this condition. 
        
        Example 1:
        Input: nums = [3,1,2,4]
        Output: [2,4,3,1]
        Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

        Example 2:
        Input: nums = [0]
        Output: [0]
        
        
        Constraints:
        1 <= nums.length <= 5000
        0 <= nums[i] <= 5000*/

        int nums [] = {3,1,2,4};
        System.out.println("ARRAY ORIGINAL");
        remove_duplicates.ImprimeInt(nums); 
        

        sortArrayByParity(nums);
        System.out.println("\n\nARRAY FINAL");
        remove_duplicates.ImprimeInt(nums);

    }

    public static int[] sortArrayByParity(int[] nums) {
        int aux=0;
            for(int i=0;i<nums.length;i++){
             
             for(int y=0;y<nums.length-1;y++){
                 
                 if((nums[y]%2!=0)&&(nums[y+1]%2==0)){
                     
                     aux=nums[y];
                     nums[y]=nums[y+1];
                     nums[y+1]=aux;
                 
                     
                 }
             
             }
         }    
         
         return nums;
         
     }

    
}
