public class binarysearch {
    static void search(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
        while(start <=end){
            int mid = (start+end)/2 ;
            if(arr[mid]==key){
                System.out.println("Element at index : "+mid);
                return;
            }if(arr[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;  
            }
        }
        System.out.println("Element " + key + " not found in the array.");
    }
    public static void main(String Args[]){
        int arr[] = {1,2,4,5,6,7,9,10};
        int key = 3;
        search(arr,key);
    }
}
