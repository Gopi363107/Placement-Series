import java.util.*;
public class two_sum  {
   public static int[] twoSum(int[] nums, int target) {
      int[] ans =new int[2]; 
      HashMap<Integer,Integer> mpp = new HashMap<>();
      for(int i = 0 ; i < nums.length ; i++){
         int diff = target - nums[i];
         if(mpp.containsKey(diff)){
            ans[0] = mpp.get(diff);
            ans[1] = i;

         }
         mpp.put(nums[i],i);

      }
      return ans;
        
   }
   public static void main(String[] args){
      int[] nums={2,7,11,15};
      int target = 9;
      int[] result = twoSum(nums,target);
      System.out.print( result[0] + ", " + result[1]);
      

   }
}
