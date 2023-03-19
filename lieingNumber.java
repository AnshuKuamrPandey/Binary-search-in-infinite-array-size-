class lieingNumber{
    public static void main(String[] args) {
        int arr[] = {45,56,56,67,78,89,111,222,333,343};
        int target = 44;
       System.out.println( m1(arr, target));
        
    }
    static int m1(int arr[],int target){
        int start = 0; 
        int end = arr.length-1;
        while (start<=end){
         int   mid = (start +end)/2;
         if (target==arr[mid]){
            return arr[mid];
         }
         else if (target<arr[mid]){
            end = mid-1;
             
         } 
         else if (target >arr[mid]){
            start=mid+1;
         }

        }
        // int lieing = target;
        // for (int i = 0 ; i<arr.length;i++){
        //     if (arr[i]>target){
        //        lieing= arr[i];
        //        break ; 
        //     }
        // }
        return arr[start] ;
    }
}