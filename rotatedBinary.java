public class rotatedBinary{
    public static void main(String args[]){

    }
    static int pivod(int arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end-start);
            if ( mid>start &&  arr[mid]>arr[mid+1]){
                return mid;
            }
            if (arr[mid]<arr[mid-1]){
                return mid -1;

            }
            if (arr[mid]<arr[start]){
                end = mid-1
            }
            else{
                start = mid+1;
            }

        }
    }
}