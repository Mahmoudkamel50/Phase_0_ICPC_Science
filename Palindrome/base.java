import java.util.*;
public class base {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        String s = input.nextLine();
        if(s.length()<=1&&s.length()<=1000){
            if(isPalindrome(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static boolean isPalindrome(String s){
        String s1 = filter(s);
        String s2 = reverse(s1);
        return s2.equals(s1);
    }
    public static String filter(String s){
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((Character.isLetterOrDigit(s.charAt(i)))){
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
    public static String reverse(String s){
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        return str.toString();
    }
}
