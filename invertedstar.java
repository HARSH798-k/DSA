// Inverted Star pattern using the nested loops. 

public class invertedstar {
    static void invertStar(int x){
        for(int i=1;i<=x;i++){
            for(int j=1;j<x-i+1;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void main(String Args[]){
        invertStar(5);
    }
}
