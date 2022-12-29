public class remove_duplicates {

    public static void main(String[] args) {
        
    }

    public int removeDuplicates(int[] nums) {
        int k=0;
        
      for(int i=0;i<nums.length;i++){
          
          if(i==0||nums[i]!=nums[i-1]){
              System.out.println(nums[i]);
              nums[k]=nums[i];
              k++;
          }
          
      }
        
        return k;
    }
    
}
