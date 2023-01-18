public class search_insert_position {
    public static void main(String[] args) {
       /*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
        You must write an algorithm with O(log n) runtime complexity. 
        
        Example 1:
        Input: nums = [1,3,5,6], target = 5
        Output: 2

        Example 2:
        Input: nums = [1,3,5,6], target = 2
        Output: 1

        Example 3:
        Input: nums = [1,3,5,6], target = 7
        Output: 4

        Constraints:
        1 <= nums.length <= 104
        -104 <= nums[i] <= 104
        nums contains distinct values sorted in ascending order.
        -104 <= target <= 104
        */
        int nums [] = {1,3,5,6};
        int target=7;
        System.out.println("El array es: ");
        imprimeInt(nums);
        System.out.println("El numero target es: "+target);


        System.out.println("La posicion del numero es o deberia ser: "+searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target) {
        int aux [] = new int [nums.length+1];
     
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            else{
                aux[i]=nums[i];
            }
        }

        for(int k=0;k<nums.length;k++){
            if(aux[k]<target && aux[k+1]>target){
                for(int w=nums.length-1;w>k;w--){
                    aux[w+1]=aux[w];
                }
                aux[k+1]=target;
                break;
            }
        }

        if(aux[nums.length-1]<target){
            aux[aux.length-1]=target;
        }
        if(aux[0]>target){
            return 0;
        }
       
       for(int i=0;i<aux.length;i++){
            if(aux[i]==target){
                return i;
            }
        }
          return 0; //NO SE DEBERIA DE LLEGAR A ESTE PUNTO NUNCA
    }
    public static void imprimeInt(int []num){
        for(int i:num){
            System.out.println("["+i+"]");
        }
    }
}


        
    

