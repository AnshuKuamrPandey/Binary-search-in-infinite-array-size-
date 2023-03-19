class firstAndLast{
    public static void main(String args []){
        int nums [] = {2,3,3,4,4,5,5,6,7};
        int target = 5;
        // System.out.println(m2(nums,target));
          System.out.println (search(nums,target ,true ));
          System.out.println (search (nums,target,false));
        //  System.out.println (m1(nums,target  ));
        //System.out.println(search(nums,))

        
        
    }
    static int [] m2(int nums[],int target){
        int ans [] = {-1,-1};
        int start = search(nums,target, true);
        int end = search (nums,target, false);
       ans [0]= start ; 
       ans [1] = end ; 
        return ans;
    }
    static int search(int [] nums ,int target ,boolean firstIndex){
        int start = 0 ;
        int end = nums.length-1;
        int ans = -1;
        while (start<=end){
        int mid  = start +(end -start )/2;
        if (nums[mid]<target){
            start = mid+1;
        }
       else  if (nums [mid]>target){
          end=mid-1;

        }
        else {
            // return mid ;
             ans = mid;
            if (firstIndex){
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
        }



        return ans;
    } 
//     static int  m1(int arr[], int target){
//         int start  = 0; 
//         int end = arr.length-1;
//         int ans = -1;
//         while (start<=end){
//             int mid = start +(end-start)/2;
//             if (arr[mid]<target){
//                 start = mid +1;

//             }
//            else if(arr[mid]>target){
//                 end = mid-1;
//             }
//             else{
//                 ans= mid;
//                // end = mid-1;
//                start = mid+1;
                

                
//             }


//         }
//         return ans;
// }
}

