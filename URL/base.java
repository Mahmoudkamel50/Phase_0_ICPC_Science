import java.util.*;
public class base {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        String s = input.nextLine();
        if(s.length()>=100&&s.length()<=Math.pow(10,4)){
            String str = s.substring(s.indexOf("?")+1);
            String[] word = (str.split("&",5));
            for(int j=0;j<word.length;j++){
                System.out.println(Split(word[j]));
            }
        }
    }
    public static String Split(String word){
        StringBuilder str = new StringBuilder(word);
        str.replace(word.indexOf('='),word.indexOf('=')+1,": ");
        return str.toString();
    }
}
