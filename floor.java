import java.util.Scanner;



public class floor {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        int arr[] = {12,23,34,45,55,66,77,121,344};
        int target = sc.nextInt();
       System.out.println(m1(arr, target)); 

    }
    static int m1(int arr[],int target){
        int start = 0; 
        int end = arr.length-1;
        while (start<=end){

            int mid = (start+end)/2;
            if (target==arr[mid]){
                return arr[mid];
                
            }
            if (target <arr[mid]){
                end = mid-1;
            }
            else if  (target>arr[mid]){
                start=mid+1;
            }
        }
        // int floor = target ;
        // for (int i = arr.length-1; i >= 0; i--) {
        //     if (arr[i]<floor){
        //         floor=arr[i];
        //     }
            
        // }
        // return floor ;
        return arr[end] ; 
    }
    
}
