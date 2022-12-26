public class delete {
    
    public static void main(String[] args) {
        // Declare an integer array of 10 elements.
        int[] intArray = new int[10];

        // The array currently contains 0 elements
        int length=0;

        // Add elements at the first 6 indexes of the Array.
        for(int i = 0; i < 6; i++) {
            intArray[length] = i;
            length++;
        }

        System.out.println("ARRAY ORIGINAL");
        remove_element.ImprimeInt(intArray);

        System.out.println("\n\nARRAY ELIMINANDO ULTIMO ELEMENTO");
        delete_first(intArray, length);
      
       
        
    } 
    public static void delete_first (int [] intArray, int length){
        length--;
        for(int i=0;i<length;i++){
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
    }

   


}
