import java.util.*;
public class base {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        long a = input.nextLong();
        long b = input.nextLong();
        long q = input.nextLong();
        System.out.println(Xor(a,b,q));
    }
    public static long Xor(long a, long b, long q){
        if(q == 1){
            return a;
        }
        else if(q == 2){
            return b;
        }
        else{
            return Xor(a, b, q-1)^Xor(a, b, q-2);
        }
    }
}