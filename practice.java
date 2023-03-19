public class practice {
    public static void main (String args[]){
        int arr[] = {23,34,45,56,56,56,67,76,55};
        int target = 56;
        System.out.println(bineary(arr, target));
       
    }
    
       
    static int bineary (int arr[],int target ){
        int start = 0;
        int end = arr.length-1; 
        int ans= -1;
        while (start<=end){
           int mid = start +(end-start )/2;
           if (target <arr[mid]){
            end=mid-1;

           }
           else if (target >arr[mid]){
            start = mid+1;
           }
           else {
            ans = mid;
            end = mid-1;
           }
    
    
            }
            return ans;
            
    
    }
    
}
//  while (start<=end){
//             int mid = start +(end-start)/2;
//             if (arr[mid]<target){
//                 start = mid +1;

//             }
//            else if(arr[mid]>target){
//                 end = mid-1;
//             }
//             else{
//                 ans= mid;
//                end = mid-1;
//                //start = mid+1;
                

                
//             }
