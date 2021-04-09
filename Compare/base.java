import java.util.*;
public class base {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        String s1 = input.nextLine();
        String s2 = input.next();
        if(s1.length()>=1&&s1.length()<=20&&s2.length()>=1&&s2.length()<=20){
            if(s1.compareTo(s2)>0){
                System.out.println(s2);
            }
            else{
                System.out.println(s1); 
            }
        }
        
    }
}
