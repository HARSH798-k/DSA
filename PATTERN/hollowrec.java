// Hollow rectangle using nested loops

public class hollowrec {
    static void hollowrecc(int n,int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==m || j==1 || j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }
    public static void main(String Args[]){
        hollowrecc(5,4);
    }
}
