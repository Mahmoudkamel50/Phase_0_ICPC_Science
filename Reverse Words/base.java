import java.util.*;
public class base {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        String blogName = input.nextLine();;
        StringBuilder reverseString = new StringBuilder();
        String[] words = blogName.split(" ");
        for(String word : words){
            String reverseWord = new StringBuilder(word).reverse().toString();
            reverseString.append(reverseWord + " ");
        }
        System.out.println( reverseString.toString().trim() );
    }
    
}
