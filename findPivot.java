public class findPivot{
      public static void main (String args [] ){
        int nums [] = {3,4,5,6,7,0,1,2};
        // int nums [] = {1,3};
        int target = 0;
        // System.out.println(pivot1(nums));
        System.out.println( rbs(nums,target));
        
    }
    static int rbs (int nums [] , int target ){
        int large = pivot1(nums);
        int s = 0;
        int e = nums.length-1;
          if (large ==-1){
            return m1(nums,target);
          }

        if (target>=nums[s]){
            e = large;
            while(s<=e){
                int mid =  s +(e-s)/2;
                if (nums[mid]<target){
                    s = mid +1;
                }
                if (nums[mid]>target){
                    e = mid-1;
                }
                else if (nums[mid]== target) {
                    return mid;
                }

            }
        }
            
        else{
           s = large+1;
            while(s<=e){
                int mid =  s +(e-s)/2;
                if (nums[mid]<target){
                    s = mid +1;
                }
                if (nums[mid]>target){
                    e = mid-1;
                }
                else if (nums[mid]== target) {
                    return mid;
                }
        }
        }

            
    return -1;

      
    }

    static int pivot1 (int nums[]){
        int s = 0;
        int e = nums.length-1;
        while (s<=e){
            int mid = s +(e-s)/2;
            if ( mid<nums.length-1 && nums[mid]>nums[mid+1]){
                return mid;
            }
            if ( mid>s && nums [mid]<nums[mid-1]){
                return mid-1;
            }
            if (nums[s]<=nums[mid]){
                s= mid+1;
            }
            else{
                e=mid-1;
            }
           
        }
        return -1;
    }
        static int m1 (int arr[] ,int target ){
        int start = 0; 
        int end = arr.length-1;
        boolean result  = false ;   
        while (start <=end ){
          int   mid = (start+end)/2;
          if (target <arr[mid]){
            end =mid -1; 

          }
          else if (target >arr[mid] ){
            start = mid +1; 

          }
          else{
         return mid ; 
            
          }
        }
        
        return -1;
    }
}
