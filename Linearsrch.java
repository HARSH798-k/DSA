import java.util.*;

public class Linearsrch {
    static void linearsrch(int num[], int key){
        for(int i = 0; i < num.length; i++){
            if(num[i] == key){
                System.out.println("Key at index : " + i);
                break; 
            }else{
                 System.out.println("Key not in array.");
            }
        }
        
        
       
    }
    
    public static void main(String Args[]){
        int num[] = {2, 3, 5, 6, 8, 10, 34, 55, 67, 23};
        int key = 34;
        linearsrch(num, key);
    }
}
