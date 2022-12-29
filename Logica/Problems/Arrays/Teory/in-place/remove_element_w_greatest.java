public class remove_element_w_greatest {

    public static void main(String[] args) {
       

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
