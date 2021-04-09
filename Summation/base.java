import java.util.*;
public class base {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        long x = input.nextLong();
        long y = 0 ;
        long count =0;
        for(long i=0;i<x;i++){
            y = input.nextLong();
            count+=y;
        }
        System.out.println(count);
    }
}
