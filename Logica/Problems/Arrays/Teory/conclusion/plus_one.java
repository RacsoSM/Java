public class plus_one {
    public static void main(String[] args) {
       /*You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered 
        from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
        Increment the large integer by one and return the resulting array of digits.
        
        Example 1:
        Input: digits = [1,2,3]
        Output: [1,2,4]
        Explanation: The array represents the integer 123.
        Incrementing by one gives 123 + 1 = 124.
        Thus, the result should be [1,2,4].

        Example 2:
        Input: digits = [4,3,2,1]
        Output: [4,3,2,2]
        Explanation: The array represents the integer 4321.
        Incrementing by one gives 4321 + 1 = 4322.
        Thus, the result should be [4,3,2,2].

        Example 3:
        Input: digits = [9]
        Output: [1,0]
        Explanation: The array represents the integer 9.
        Incrementing by one gives 9 + 1 = 10.
        Thus, the result should be [1,0].


        Constraints:
        1 <= digits.length <= 100
        0 <= digits[i] <= 9
        digits does not contain any leading 0's.
        */
    }

    public static int[] plusOne(int[] digits) {
        int p=digits.length;
        boolean flag=false;
         
         flag=high(digits);
         if(flag==true)   p=digits.length+1;
          
         int answer [] = new int [p];
         
         for(int i =0;i<digits.length;i++){
             if(digits[digits.length-1]==9 && flag ==true) answer[i+1]=digits[i];
             else    answer[i]=digits[i];      
         }
         
         answer[answer.length-1]++;
          
         for(int k=answer.length-1;k>0;k--){
             if( answer[k]>9){
               answer[k]=0;
               answer[k-1]++;
             } 
         }
         
         return answer;
     }

     public static boolean high (int [] digits){
        int v=0;
        for(int w=0;w<digits.length;w++){
            if(digits[w]==9){
                v++;
            }
        }
       
        if(v==digits.length){
            return true;
        }
       
        return false;
    }
    
}
