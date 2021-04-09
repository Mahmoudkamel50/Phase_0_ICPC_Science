import java.util.*;
public class base {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int x = input.nextInt();
        int a,b=0,c=1;
        for(int i=1;i<=x;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.print(a+" ");
        }
    }
}
