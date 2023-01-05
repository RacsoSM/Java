import java.util.Arrays;
public class third_maximum_number {

    public static void main(String[] args) {
        /*Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number. 
         
        Example 1:
        Input: nums = [3,2,1]
        Output: 1
        Explanation:
        The first distinct maximum is 3.
        The second distinct maximum is 2.
        The third distinct maximum is 1.

        Example 2:
        Input: nums = [1,2]
        Output: 2
        Explanation:
        The first distinct maximum is 2.
        The second distinct maximum is 1.
        The third distinct maximum does not exist, so the maximum (2) is returned instead.

        Example 3:
        Input: nums = [2,2,3,1]
        Output: 1
        Explanation:
        The first distinct maximum is 3.
        The second distinct maximum is 2 (both 2's are counted together since they have the same value).
        The third distinct maximum is 1.

        Constraints:
        1 <= nums.length <= 104
        -231 <= nums[i] <= 231 - 1
        */

        int res=0;
        int nums [] = {2,2,3,1};

        System.out.println("ARRAY ORIGINAL");
        ImprimeInt(nums);

        res=thirdMax(nums);

        System.out.println("El tercer numero mayor es: "+res);
        
    }
    public static int thirdMax(int[] nums) {
        int x=0,res=0,aux=0;
          Arrays.sort(nums);
        
        if(nums.length<3){
            res=nums[nums.length-1];
        }
        
        for(int i=nums.length-1;i>0;i--){
           
            if(nums[i]!=nums[i-1]){
                x++;
            }
            
            if(x==2){
                 res=nums[i-1];
                 break;
            }
            
            else{
               res=nums[nums.length-1];
            }
        
        }
   
        return res;
    }

    public static void ImprimeInt(int [] V){ 
        for (int i = 0; i < V.length; i++) {
            
                System.out.println("["+V[i]+"]"+" Pos "+ i);
            
        }
    }
    
}
