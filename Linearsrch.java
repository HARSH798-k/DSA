import java.util.*;

public class Linearsrch {
    static void linearsrch(int num[], int key){
        boolean found = false;
        for(int i = 0; i < num.length; i++){
            if(num[i] == key){
                System.out.println("Key at index : " + i);
                found = true;
                break; 
            }
        }  
        if(!found){
            System.out.println("Key is not in array.");
        }
    }
    
    public static void main(String Args[]){
        int num[] = {2, 3, 5, 6, 8, 10, 34, 55, 67, 23};
        int key = 1;
        linearsrch(num, key);
    }
}
