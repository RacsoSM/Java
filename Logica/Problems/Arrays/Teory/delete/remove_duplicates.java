public class remove_duplicates {

    public static void main(String[] args) {
        
/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates,
 then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums. 

Example 1: 
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
*/


        int nums [] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("ARRAY ORIGINAL");
        remove_element.ImprimeInt(nums);

        removeDuplicates(nums);
        System.out.println("ARRAY SIN DUPLICADOS");
        remove_element.ImprimeInt(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int copia [] = new int [nums.length];
        int t=0,x=0;
        
        for(int p=0;p<copia.length;p++){
            copia[p]=101;
        }
        
        for(int i=0;i<nums.length;i++){
            t=nums[i];
            for (int y=0;y<nums.length;y++){
                
                if(t==copia[y]){
                    break;
                }
                
                if(copia[y]==101){
                    copia[x]=t;
                    x++;
                    break;
                }
            }
            
        }
        
        
        for(int w=0;w<nums.length;w++){
            nums[w]=copia[w];
        }
        
        return x;
        
    }
    
}
