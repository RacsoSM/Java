public class n_double {
    
    public static void main(String[] args) {
        
     /*Given an array arr of integers, check if there exist two indices i and j such that :
        i != j
        0 <= i, j < arr.length
        arr[i] == 2 * arr[j] 
        
        Example 1:
        Input: arr = [10,2,5,3]
        Output: true
        Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
        */

        int arr [] = {10,2,5,3};
        System.out.println("Se cumplen las caracteristicas requeridas?: "+checkIfExist(arr));


    }

    public static boolean checkIfExist(int[] arr) {
        
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
