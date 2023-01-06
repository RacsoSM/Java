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
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList <Integer> miss = new ArrayList <Integer>();
  
    
       for (int i = 0; i < nums.length; ++i) {
            while (nums[i] != i + 1 && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        
        for (int i = 0; i < nums.length; ++i) {
           // System.out.println("nums[i] = "+nums[i]);
             //System.out.println("i = "+i);
            if (nums[i] != i + 1) {
                miss.add(i + 1);
            }
        }
        return miss;
    }
    
    void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    
}
