// Star pattern using the nested loops .

class Star{
    static void star(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void main(String Args[]){
        star(5);
    }
}