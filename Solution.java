
public class Solution {
    public static void main(String[] arg){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int n = 3;
        int m = 3;
        Solution.merge(nums1,m,nums2,n);
        System.out.print("[");
        for (int i = 0; i < n+m; i++) {
            
            System.out.print(nums1 [i]+" "); 
            
        }
        System.out.print("]");   
        System.out.println();
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1 , p2 = n-1 , i = m+n-1 ;
        while(p2 >= 0){
            if(p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[i--] = nums1[p1--];

            }
            else{
                nums1[i--] = nums2[p2--];
            }
        }
    }
}
   
