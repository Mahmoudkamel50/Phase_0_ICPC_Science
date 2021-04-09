import java.util.*;
public class base {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long[] x = new long[2];
        for(int i=0;i<=1;i++){
            x[i] = input.nextInt();
        }
        if(x[0]>=1&&x[0]<=Math.pow(10,5)&&x[1]>=1&&x[1]<=Math.pow(10,5)){
            System.out.println(x[0] + " + " + x[1] + " = " + (x[0]+x[1]));
            System.out.println(x[0] + " * " + x[1] + " = " + (x[0]*x[1]));
            System.out.println(x[0] + " - " + x[1] + " = " + (x[0]-x[1]));
        }
    }
}
//