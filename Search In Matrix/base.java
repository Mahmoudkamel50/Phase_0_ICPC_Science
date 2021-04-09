import java.util.*;
public class base {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int n = input.nextInt();
        int m = input.nextInt();
        long[][] arr = new long[n][m];
        if(n>=2&&n<=100&&m>=2&&m<=100){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    long ar = input.nextLong();
                    if(ar>=1&&ar<=Math.pow(10,5)){
                        arr[i][j] = ar;
                    }
                }
            }
            long x = input.nextLong();
            if(x>=1&&x<=Math.pow(10,5)){
                for(int a=0;a<n;a++){
                    for(int b=0;b<m;b++){
                        if(arr[a][b]==x){
                            System.out.println("will not take number");
                            System.exit(0);
                        }
                    }
                }
                System.out.println("will take number");
            }
        }
    }
}
