public class Diamond {
    static void diamondpattern(int n){
        // first half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            for(int l=2;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //    second half
        for(int i=n-1;i>=1;i--){
            for(int j=(n-i);j>=1;j--){
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--){
                System.out.print("* ");
            }
            for(int l=i;l>=2;l--){
                System.out.print("* ");
            }
            System.out.println();
        }
     

    }
    public static void main(String Args[]){
        diamondpattern(5);
    }
}
