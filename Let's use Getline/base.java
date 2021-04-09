import java.util.*;
public class base {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        String s = input.nextLine();
        if(s.length()>=1&&s.length()<=Math.pow(10,6)){
            System.out.println(s.substring(0, s.indexOf("\\")));
        }
    }
}
