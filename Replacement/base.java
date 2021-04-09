import java.util.*;
public class base {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int[] y = new int[x];
        if(x>=2&&x<=1000){
            for(int i=0;i<y.length;i++){
                y[i] = input.nextInt();
                if(y[i]<=-Math.pow(10,5)&&y[i]>=Math.pow(10,5)){
                    System.exit(0);
                }
                if(y[i]>0){
                    y[i] = 1;
                }
                else if(y[i]<0){
                    y[i] = 2;
                }
                else{
                    y[i]=0;
                }
            }

        }
        for(int j =0;j<y.length;j++){
            System.out.print(y[j] + " ");
        }
    }
}
