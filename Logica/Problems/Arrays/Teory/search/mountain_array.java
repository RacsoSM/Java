public class mountain_array {
    
    public static void main(String[] args) {
        
    }
    public static boolean validMountainArray(int[] arr) {
        int count = 0;
    boolean check = true;
    int value = 0;
    if(arr.length<2){
        return false;
    }
    if(arr.length<3){
        if(arr[0]==arr[1]){
            return true;
        }
        else{
            return false;
        }
    }
    
    for(int i = 0 ; i<arr.length-1 ; i++){
        if(arr[i] < arr[i+1]){
            value +=1;
            check = true;       
        }
        if(arr[i] > arr[i+1] && check == true){
            count = count+1;      
            check = false;
        }
        
        if(count > 1){
            return false;
        }
        if(arr[i] == arr[i+1]){
            return false;
        }
        if(arr[arr.length-1] > arr[arr.length-2]){
            return false;
        }
        if(value == 0){
            return false;
        }
    }
    return true;
    
}
