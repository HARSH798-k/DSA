// Inverted half pyramid pattern using the nested loops. 

public class invertedhalfpyramid {
    static void inverthalfpyd(int x){
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x-i+1;j++){
                System.out.print(j+" ");
            }System.out.println();
        }
    }
    public static void main(String Args[]){
        inverthalfpyd(5);
    }
}
