class firstOccurance{
    static int  m1(int arr[], int target){
        int start  = 0; 
        int end = arr.length-1;
        int ans = -1;
        while (start<=end){
            int mid = start +(end-start)/2;
            if (arr[mid]<target){
                start = mid +1;

            }
           else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                ans= mid;
               end = mid-1;
               //start = mid+1;
                

                
            }


        }
        return ans;

    }
    public static void main (String args []){
        int arr[]= {3,4,5,5,5,6,6,7,8};
        int target = 6;
        System.out.println(m1(arr, target));
    }
    
}