public class max_consecutive_ones {
    public static void main(String[] args) {
int x=0;
        int[] nums= {0,1,0,1,1,1};
      
        System.out.println("El array dado es: ");
        ImprimeInt(nums);
        
        x=findMaxConsecutiveOnes(nums);
        System.out.println("El numero maximo de 1 consecutivos es: "+x);

    }

    //Given a binary array nums, return the maximum number of consecutive 1's in the array.
   
        
        public static int findMaxConsecutiveOnes(int[] nums) {
            int y=0,x=0,z=0;
       
            
                 for(int i=0; i< nums.length;i++){
                
                     if(nums[i]==1){
                         x++;
                     }
                     
                     if(x>y){
                         y=x;
                     }
                     
                     if(nums[i]==0){
                       x=0;
                     }     
    
                }
              
            
            return y;
        }

        public static void ImprimeInt(int [] V){ 
            for (int i = 0; i < V.length; i++) {
                
                    System.out.println("["+V[i]+"]"+" Pos "+ i);
                
            }
        }
        
    
    
}
