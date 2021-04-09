import java.util.*;
import java.lang.*;
import java.math.*;
public class base {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        if(x>=1&&x<=Math.pow(10,18)){
            double z = Math.log10(x)/Math.log10(2);
            if(z == (long)z){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
