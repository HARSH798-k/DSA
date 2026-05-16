public class pair {
    static void arrpair(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start = arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+start+","+arr[j]+") ");
            }System.out.println();
        }
    }
    public static void main(String Args[]){
        int arr[] = {2,4,6,8,10};
        arrpair(arr);
    }
}
