class LastOccurance{
    public static void main (String  args []){
        int arr[] = {3,4,4,4,5,5,6,6,7,7,8,8,9,9};
        int target = 4;
        System.out.println(m1(arr,target));

    }
    static int m1(int arr[],int target ){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while (start<=end){
            int mid = start +(end-start)/2;
            if (arr[mid]<target){
                start = mid +1;

            }
            else if (arr[mid]>target){
                end = mid-1;

            }
            else {
                ans = mid;
                start = mid +1;
            }
                
        }
        return ans;
    }
}