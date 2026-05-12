public class butterflyptrn {
    static void butterflypattern(int x){
        // first half
        for(int i=1;i<=x;i++){

            for(int j=1;j<=i;j++){
                System.out.print("* ");    
            }

            for(int l=1;l<=2*(x-i);l++){
                System.out.print("  ");
            }

            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }System.out.println();
        }
        //second half
        for(int i=x;i>=1;i--){

            for(int j=i;j>=1;j--){
                System.out.print("* ");    
            }

            for(int l=2*(x-i);l>=1;l--){
                System.out.print("  ");
            }

            for(int k=i;k>=1;k--){
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void main(String Args[]){
        butterflypattern(5);
    }
}
