import java.util.*;
public class base {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println(sum(x,y));
    }
    public static int sum(int x,int y){
        return x+y;
    }
}
