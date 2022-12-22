public class duplicate_zeros {
    
    public static void main(String[] args) {
        /*Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
        Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
        
        Example:1
        Input: arr = [1,0,2,3,0,4,5,0]
        Output: [1,0,0,2,3,0,0,4]
        */


        int arr [] = {1,0,2,3,0,4,5,0};
        System.out.println("Input");
        max_consecutive_ones.ImprimeInt(arr);

        duplicateZeros(arr);

        System.out.println("Output:");
        max_consecutive_ones.ImprimeInt(arr);
    }

    public static void duplicateZeros(int[] arr) {
        int x=0;
        
        for(int i=0;i<arr.length;i++){
            
             if(arr[i]==0){
                 x++;
             }
        }
        
        int copia [] = new int [arr.length+x];
        int t=0;
        
        for(int p=0;p<arr.length;p++){
            
            if(arr[p]==0){
                copia[p+t]=0;
                copia[p+1+t]=0;
                t++;
            }
            else{
                 copia[p+t]=arr[p];
            }
             
        }
        
        
        for(int y=0;y<arr.length;y++){
        
           arr[y]=copia[y];
            
        }
        
    }
}
