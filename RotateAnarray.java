import java.util.Arrays;
public class RotateAnarray{
    public static void main (String args []){
      int nums [] = {1,2,3,4,5,6,7};
      int k = 4;
      reverse(nums,0,nums.length-1);
      reverse(nums,0,k-1);
      reverse(nums,k,nums.length-1);
      System.out.println(Arrays.toString(nums));

    }
    static void reverse ( int nums[],int start,int end){
      while(start <end){
        int tem = nums[start];
        nums[start] = nums[end];
        nums[end] = tem;
        start ++;
        end--;
      }
    }
}