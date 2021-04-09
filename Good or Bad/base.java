import java.util.*;
public class base {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int t = input.nextInt();
        String[] s = new String[t];
        for(int i=0;i<t;i++){
            s[i] = input.next();
        }
        for(int j=0;j<t;j++){
            if(s[j].contains("101")||s[j].contains("010")){
                System.out.println("Good");
            }
            else{
                System.out.println("Bad");
            }
        }
    }
}
