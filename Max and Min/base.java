import java.util.*;
public class base {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int[] x = new int[3];
        int y ;
        for(int i=0;i<3;i++){
            y = input.nextInt();
            if(y>=-Math.pow(10,5)&&y<=Math.pow(10,5)){
                x[i] = y;
            }
        }
        System.out.println(Min(x) + " " + Max(x));
    }
    public static int Max(int[] x){
        int temp=x[0];
        for(int i=0;i<x.length;i++){
            if(x[i]>temp){
                temp = x[i];
            }
        }
        return temp;
    }
    public static int Min(int[] x){
        int temp=x[0];
        for(int i=0;i<x.length;i++){
            if(x[i]<temp){
                temp = x[i];
            }
        }
        return temp;
    }
}
