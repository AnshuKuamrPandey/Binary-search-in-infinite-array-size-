public class baseCode {
    public static void main (String args[]){
        int arr[] = {21,32,43,53,65,75,666};
        int target = 3 ;
      System.out.println(  m1(arr, target));

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