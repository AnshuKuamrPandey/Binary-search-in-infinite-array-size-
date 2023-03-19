public class CeilingOfChar {
    public static void main(String[] args) {
        char arr [] = {'c','f','j'};
        char  target = 'k';
      System.out.println( m1(arr, target)); 

    }
    static char m1(char [] arr,char target ){
        int start = 0; 
        int end = arr.length-1;
        while (start <=end){
            int mid = (start+end)/2; 
            if (target <arr[mid]){
                end = mid -1; 

            }
            else {
                start = mid +1;
            }
        }
        return arr[start%arr.length];

    }
    
}
