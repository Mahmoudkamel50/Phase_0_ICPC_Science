import java.util.*;
public class base {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        if(a>=1&&a<=Math.pow(10,3)){
            if(b>=1&&b<=Math.pow(10,3)){
                System.out.println("floor "+a+"/"+b+" = "+(int)(Math.floor(a/b)));
                System.out.println("ceil "+a+"/"+b+" = "+(int)(Math.ceil(a/b)));
                System.out.println("round "+a+"/"+b+" = "+Math.round(a/b));
            }
        }
    }
}
