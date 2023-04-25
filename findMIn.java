public class findMIn{
    public static void main(String args []){
        // int nums [] = {3,4,5,6,7,0,1,2};
        int nums [] = {3,4,5,1,2};
        
        System.out.println(min(nums));

    }
    static  int min( int[] nums){
        int s = 0;
         int e = nums.length-1;
          while (s<=e ){
            int mid = s+(e-s)/2;
            if (mid>s && nums [mid]<nums[mid-1]){
                return mid;
            }
            if( mid<nums.length-1 && nums[mid] >nums[mid+1]){
                return mid+1;
            }
            if ( nums[s]<=nums[mid]){
                s = mid+1;

            }
            else {
                e = mid-1;
            }
          }
          return -1;



    }
}