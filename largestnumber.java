import java.util.*;
public class largestnumber {
    static void largenumber(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }System.out.println("Largest number is :"+largest);
    }
    public static void main(String Args[]){
        int arr[] = {2,5,7,20,22,4,5};
        largenumber(arr);
    }
}
