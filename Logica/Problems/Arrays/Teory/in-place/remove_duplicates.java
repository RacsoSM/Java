public class remove_duplicates {

    public static void main(String[] args) {
        int nums [] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("ARRAY ORIGINAL");
        ImprimeInt(nums);

        removeDuplicates(nums);

        System.out.println("ARRAY CAMBIADO");
        ImprimeInt(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int k=0;
        
      for(int i=0;i<nums.length;i++){
          
          if(i==0||nums[i]!=nums[i-1]){
              nums[k]=nums[i];
              k++;
          }
      } 
        return k;
    }

    public static void ImprimeInt(int [] V){ 
        for (int i = 0; i < V.length; i++) {
            
                System.out.println("["+V[i]+"]"+" Pos "+ i);
            
        }
    }
    
}
