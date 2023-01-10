public class remove_element {
    
    public static void main(String[] args) {

        /*Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

        Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

        Return k after placing the final result in the first k slots of nums.
        
        
        Example 1: 
        Input: nums = [3,2,2,3], val = 3
        Output: 2, nums = [2,2,_,_]
        
        Example 2:
        Input: nums = [0,1,2,2,3,0,4,2], val = 2
        Output: 5, nums = [0,1,4,0,3,_,_,_]
        
        */

        int nums [] = {0,1,2,2,3,0,4,2};
        int val = 2;

        System.out.println("ARRAY INICIAL");
        ImprimeInt(nums);

        removeElement2(nums,val);

        System.out.println("ARRAY FINAL");
        ImprimeInt(nums);
        
    }

    public static int removeElement2(int[] nums, int val) {
        int x=0,k=0;
        for (int i=0;i<nums.length;i++){
            
           if(nums[i]!=val){
              // System.out.println("entrada numero "+x);
             nums[x]=nums[i]; 
               x++;
           }
        
        }
        
        return x;
    }
    public static int removeElement(int[] nums, int val) {
      
        int k=0,x=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                k++;
            }
        }
        System.out.println("el numero a eliminar sale  "+k+ "veces");
        int copia[] = new int [nums.length];
        System.out.println("el tamaño del array copia es de   "+copia.length);
        for(int i=0;i<nums.length;i++){
            if (nums[i]!=val){
                copia[x]=nums[i];
                x++;
            }
            
          
          
        }
        for(int i=0;i<copia.length;i++){
            nums[i]=copia[i];
           // System.out.print(copia[i]+", ");    
            System.out.print(nums[i]+", ");  
        }
          System.out.print("Tamaño del array nums "+nums.length);      

        
        
        
        return k;
    }

    public static void ImprimeInt(int [] V){ 
        for (int i = 0; i < V.length; i++) {
            
                System.out.println("["+V[i]+"]"+" Pos "+ i);
            
        }
    }
    
}
