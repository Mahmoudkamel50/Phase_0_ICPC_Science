import java.util.*;
public class base {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int[] y = new int[x];
        if(x>=2&&x<=1000){
            for(int i=0;i<y.length;i++){
                y[i] = input.nextInt();
            }
            for(int j =0;j<y.length;j++){
                if(y[j]<=-Math.pow(10,5)&&y[j]>=Math.pow(10,5)){
                    System.exit(0);
                }
            }
            if(freq(x,y)%2==0){
                System.out.println("Unlucky");
            }
            else{
                System.out.println("Lucky");
            }
        }
    }
    public static int freq(int x,int[] y){
        int min = y[0];
        int freq = 1 ;
        for(int i =1;i<x;i++){
            if(y[i]<min){
                min = y[i];
                freq = 1;
            }
            else if(y[i]==min){
                freq++;
            }
        }
        return freq;
    }
}
