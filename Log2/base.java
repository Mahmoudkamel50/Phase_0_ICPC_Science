import java.util.*;
public class base {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long x = input.nextLong();
        if(x>=1&&x<=Math.pow(10,18)){
            System.out.println((long)(Math.log10(x)/Math.log10(2)));
        }
    }
}
