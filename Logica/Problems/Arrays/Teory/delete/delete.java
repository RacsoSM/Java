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

      /*   System.out.println("\n\nARRAY ELIMINANDO ULTIMO ELEMENTO");
        delete_last(intArray, length);
      */

      System.out.println("\n\nARRAY ELIMINANDO PRIMER ELEMENTO");
      delete_first(intArray, length);
      remove_element.ImprimeInt(intArray);
        
    } 
    public static void delete_last (int [] intArray, int length){
        length--;
        for(int i=0;i<length;i++){
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
    }

    public static void delete_first (int [] intArray, int length){
   
       // Starting at index 1, we shift each element one position to the left.
        for (int i = 1; i < length; i++) {
            // Shift each element one position to the left
            intArray[i - 1] = intArray[i];
        }

        // Note that it's important to reduce the length of the array by 1.
        // Otherwise, we'll lose consistency of the size. This length
        // variable is the only thing controlling where new elements might get added.
     
        length--;
    }

   


}
