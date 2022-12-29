public class remove_element_w_greatest {

    public static void main(String[] args) {
        
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
            System.out.println(x);
            
            arr[i-1]=arr[i];
        }
           arr[arr.length-1]=-1;
        
        return arr;
    }
    
}
