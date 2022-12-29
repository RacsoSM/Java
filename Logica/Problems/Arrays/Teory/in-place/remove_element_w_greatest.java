public class remove_element_w_greatest {

    public static void main(String[] args) {
        /*Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
        After doing so, return the array. 
        
        Example 1:
        Input: arr = [17,18,5,4,6,1]
        Output: [18,6,6,6,1,-1]
        Explanation: 
        - index 0 --> the greatest element to the right of index 0 is index 1 (18).
        - index 1 --> the greatest element to the right of index 1 is index 4 (6).
        - index 2 --> the greatest element to the right of index 2 is index 4 (6).
        - index 3 --> the greatest element to the right of index 3 is index 4 (6).
        - index 4 --> the greatest element to the right of index 4 is index 5 (1).
        - index 5 --> there are no elements to the right of index 5, so we put -1.

        Example 2:
        Input: arr = [400]
        Output: [-1]
        Explanation: There are no elements to the right of index 0.
        */

        int arr [] = {17,18,5,4,6,1};

        System.out.println("ARRAY ORIGINAL");
        ImprimeInt(arr);

        System.out.println("ARRAY CAMBIADO");
        replaceElements(arr);
        ImprimeInt(arr);
    }

    public static int[] replaceElements(int[] arr) {
        int x=0;
    
        for(int i=1;i<arr.length;i++){
            
            x=0;
            for(int y=i;y<arr.length;y++){
                
            if(arr[y]>x){
                x=arr[y];
            }
                
            }
            arr[i]=x;
          //System.out.println(x);
            
            arr[i-1]=arr[i];
        }
           arr[arr.length-1]=-1;
        
        return arr;
    }

    public static void ImprimeInt(int [] V){ 
        for (int i = 0; i < V.length; i++) {
            
                System.out.println("["+V[i]+"]"+" Pos "+ i);
            
        }
    }
    
}
