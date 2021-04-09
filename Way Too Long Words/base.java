import java.util.*;
public class base {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int t = input.nextInt();
        String s ;
        if(t>=1&&t<=100){
            for(int i=0;i<t;i++){
                s = input.next();
                if(s.length()>=1&&s.length()<=100){
                    System.out.println(tooString(s));
                }
            }
        }
    }
    public static String tooString(String s){
        int count =0;
        if(s.length()>10){
            for(int i=1;i<s.length()-1;i++){
                count++;
            }
            
            return (s.charAt(0))+(String.valueOf(count))+(s.charAt(s.length()-1));
        }
        else{
            return s;
        }
    }
}
