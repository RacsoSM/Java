public class in_place {
    
    public static void main(String[] args) {
        /*Given an Array of integers, return an Array where every element at an even-indexed position is squared.
         
         Input: array = [9, -2, -9, 11, 56, -12, -3]
        Output: [81, -2, 81, 11, 3136, -12, 9]
        Explanation: The numbers at even indexes (0, 2, 4, 6) have been squared, 
        whereas the numbers at odd indexes (1, 3, 5) have been left the same.
         
        there are two ways we could approach it.
        */
        int array [] = {9,-2,-9,11,56,-12,-3};
        int length = array.length;
        System.out.println("ARRAY ORIGINAL");
        remove_element_w_greatest.ImprimeInt(array);
     //   first(array,length);
        second(array,length);


    }
    public static int [] first (int [] array, int length){
        // Check for edge cases.
        if (array == null) {
            return null;
        }

        // Create a resultant Array which would hold the result.
        int result[] = new int[length];

        // Iterate through the original Array.
        for(int i = 0; i < length; i++) {

            // Get the element from slot i of the input Array.
            int element = array[i];

            // If the index is an even number, then we need to square element.
            if (i % 2 == 0) {
            element *= element;
            }

            // Write element into the result Array.
            result[i] = element;
        }
        System.out.println("\n\nARRAY CAMBIADO");
        remove_element_w_greatest.ImprimeInt(result);
        // Return the result Array.
        return result;
     }

     public static int[] second(int[] array, int length) {

        // Check for edge cases.
        if (array == null) {
          return array;
        }
      
        // Iterate through the original array.
        for(int i = 0; i < length; i++) {
      
          // If the index is an even number, then we need to square the element
          // and replace the original value in the Array.
          if (i % 2 == 0) {
            array[i] *= array[i];
          }
          // Notice how we don't need to do *anything* for the odd indexes? :-)
        }
      
        // We just return the original array. Some problems on leetcode require you
        // to return it, and other's dont.
        System.out.println("\n\nARRAY CAMBIADO");
        remove_element_w_greatest.ImprimeInt(array);
        return array;
      }
    
}
