import java.util.ArrayList;
public class numbers_missed {
    
    public static void main(String[] args) {
    
        /*Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums. 
         
        Example 1:
        Input: nums = [4,3,2,7,8,2,3,1]
        Output: [5,6]

        Example 2:
        Input: nums = [1,1]
        Output: [2]

        Constraints:
        n == nums.length
        1 <= n <= 105
        1 <= nums[i] <= n
        */
        ArrayList <Integer> miss = new ArrayList <Integer>();
        System.out.println("ARRAYLIST ORIGINAL:");
        int nums [] = {4,3,2,7,8,2,3,1};
        ImprimeInt(nums);

        findDisappearedNumbers(nums);
    }

    public static void findDisappearedNumbers(int[] nums) {
        ArrayList <Integer> miss = new ArrayList <Integer>();
  
    
       for (int i = 0; i < nums.length; ++i) {
            while (nums[i] != i + 1 && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != i + 1) {
                miss.add(i + 1);
            }
        }

        System.out.println("\n\nNUMEROS FALTANTES");

        for (int num : miss) {
			System.out.println(miss);
		}

        /*for (int x = 0; x < miss.size(); x++) {
			int num = miss.get(x);
			System.out.println(num);
		}*/
        
    }
    
    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }



    public static void ImprimeInt(int [] V){ 
        for (int i = 0; i < V.length; i++) {
            
                System.out.println("["+V[i]+"]"+" Pos "+ i);
            
        }
    }

    
}
