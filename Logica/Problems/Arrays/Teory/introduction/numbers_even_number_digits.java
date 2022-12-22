public class numbers_even_number_digits {
    
    public static void main(String[] args) {

        // Given an array nums of integers, return how many of them contain an even number of digits.
        /*EXAMPLE 1
         * Input: nums = [12,345,2,6,7896]
           Output: 2

          EXAMPLE 2
          Input: nums = [555,901,482,1771]
            Output: 1 
         */
        int nums [] = {12,345,2,6,7896};
        System.out.println("ESTE ES EL CONTENIDO DEL ARRAY");
        max_consecutive_ones.ImprimeInt(nums);

        System.out.println("\n\n"+findNumbers(nums)+" numeros del array tienen numeros de digitos pares");

    }

    public static int findNumbers(int[] nums) {
        int e=0,x=0;
        String t="";
        for(int i=0; i<nums.length;i++){
            
            t=Integer.toString(nums[i]);
            e= t.length();
    
                if(e % 2 == 0){
                    x++;
                }

        }
        return x;
    }

}
