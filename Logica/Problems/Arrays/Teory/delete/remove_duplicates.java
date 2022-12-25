public class remove_duplicates {

    public static void main(String[] args) {
        
    }

    public int removeDuplicates(int[] nums) {
        int copia [] = new int [nums.length];
        int t=0,x=0;
        
        for(int p=0;p<copia.length;p++){
            copia[p]=101;
        }
        
        for(int i=0;i<nums.length;i++){
            t=nums[i];
            for (int y=0;y<nums.length;y++){
                
                if(t==copia[y]){
                    break;
                }
                
                if(copia[y]==101){
                    copia[x]=t;
                    x++;
                    break;
                }
            }
            
        }
        
        
        for(int w=0;w<nums.length;w++){
            nums[w]=copia[w];
        }
        
        return x;
        
    }
    
}
