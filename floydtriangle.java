// Floyd triangle pattern using the nested loops. 

public class floydtriangle {
    static void floydtrngl(int n){
        int x = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(x+" ");
                x++;
            }System.out.println();
        }
    }
    public static void main(String Args[]){
        floydtrngl(4);
    }
}
