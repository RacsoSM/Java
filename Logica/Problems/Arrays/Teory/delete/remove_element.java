public class remove_element {
    
    public static void main(String[] args) {

        int nums [] = {0,1,2,2,3,0,4,2};
        int val = 2;

        System.out.println("ARRAY INICIAL");
        ImprimeInt(nums);

        removeElement(nums,val);

        System.out.println("ARRAY FINAL");
        ImprimeInt(nums);
        
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
