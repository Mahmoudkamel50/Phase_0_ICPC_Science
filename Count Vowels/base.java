import java.util.*;
public class base {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        String s = input.nextLine();
        if(s.length()>=2&&s.length()<=200){
            counter(s);
        }
    }
    public static void counter(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case 'a':count++;break;
                case 'e' :count++;break;
                case 'i' :count++;break;
                case 'o' : count++;break;
                case 'u' : count++;break;
                case 'A':count++;break;
                case 'E' :count++;break;
                case 'I' :count++;break;
                case 'O' : count++;break;
                case 'U' : count++;break;
                default:;
            }
        }
        System.out.println(count);
    }
}
