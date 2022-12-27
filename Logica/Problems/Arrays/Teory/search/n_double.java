public class n_double {
    
    public static void main(String[] args) {
        
    }

    public boolean checkIfExist(int[] arr) {
        
        for(int i=0;i<arr.length;i++){
             //   System.out.println("primer for, valor de i: "+i+ " valor del array en esta posición: "+arr[i]);
            for(int j=0;j<arr.length;j++){
             //   System.out.println("segundo for, valor de j: "+j+ " valor del array en esta posición: "+arr[j]);
                if((arr[i]== (arr[j]*2)) && i!=j){
                    return true;
                }
            }
        }
        return false;
    }
}
