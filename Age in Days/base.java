import java.util.*;
public class base {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y=0;
        int z=0;
        int t=0;
        if(x>=0&&x<=Math.pow(10,6)){
            y = x/365;
            z = (x-365*y)/30;
            t = x-365*y-z*30;
            System.out.println(y+" years");
            System.out.println(z+" months");
            System.out.println(t+" days");
        }
    }
}
