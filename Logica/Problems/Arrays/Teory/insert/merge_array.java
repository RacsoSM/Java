import java.util.Arrays;
public class merge_array {

    public static void main(String[] args) {
        
        /*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
        Merge nums1 and nums2 into a single array sorted in non-decreasing order.
        
        Example 1: 
        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        Output: [1,2,2,3,5,6]
        */

        int nums1[] = {1,2,3,0,0,0};
        int nums2[]={2,5,6};
        int m=3,n=3;

        System.out.println("Array inicial 1");
        ImprimeInt(nums1);

        System.out.println("Array inicial 2");
        ImprimeInt(nums2);

        merge(nums1, m, nums2, n);

        System.out.println("\n\nArray combinado");
        ImprimeInt(nums1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int t=n;
        if(m!=0 && n!=0){
            if(n>m) t=m;  
            if(m>n) t=m;  
            
           
            for (int i=0; i<n;i++){
                nums1[t+i] = nums2[i];
            }
            
        }
        
        else if(n==0){
          for(int i=0;i<n+m;i++){
                nums1[i]=nums1[i];
            }
        }
        
        else if (m==0){
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
        }
       
        
      
        
        Arrays.sort(nums1);
        
    }

    public static void ImprimeInt(int [] V){ 
        for (int i = 0; i < V.length; i++) {
            
                System.out.println("["+V[i]+"]"+" Pos "+ i);
            
        }
    }
    
}
