public class OrderAgnosticBS {
    public static void main(String[] args) {
        int arr[] = {78,67,66,65,54,43,34};
        int target = 34;
       System.out.println( m1(arr, target));

        
    }
    static int m1(int arr[],int target){
        int start = 0; 
        int end = arr.length-1; 
     boolean isAce= arr[start]<arr[end];
       while (start<=end){     
        int mid =( start+end)/2;
        if (target==arr[mid]){
            return mid ; 
        }
        if (isAce ==true ){
            if (target<arr[mid] ){
                
                end = mid-1; 
                
            }
            if (target >arr[mid]){
                start= mid+1;
            }

        }
        else {
            if (target >arr[mid]){
                end = mid-1;
            }
            if(target <arr[mid]){
                start= mid+1;
            }
        }
       }
       return -1;

        
    }
}

