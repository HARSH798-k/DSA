import java.util.*;
public class prefix {
    static void maxSumPrefix(int arr[]){
        int max = Integer.MIN_VALUE; int curr = 0;
        int prefix[] = new int [arr.length];
        //   Prefix calculate
        prefix[0] = arr[0];
        for(int i=1;i<=arr.length-1;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        //  Calculate the curr sum
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                curr = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(max<curr){
                    max = curr ;
                }
            }
        }System.out.println("Maximum sum :"+max);

    }
    public static void main(String Args[]){
        int arr[] = {1,-2,6,-1,3};
        maxSumPrefix(arr);
    }
}
