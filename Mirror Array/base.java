import java.util.*;
public class base {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int n = input.nextInt();
        int m = input.nextInt();
        long a;
        long[][] arr = new long[n][m];
        if(n>=1&&n<=100&&m>=1&&m<=100){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a = input.nextLong();
                    if(a>=1&&a<=Math.pow(10,9)){
                        arr[i][j] = a;
                    }
                }
            }
            MirrorArray(arr,n,m);
            for(int q=0;q<n;q++){
                for(int w=0;w<m;w++){
                    System.out.print(arr[q][w]+" ");
                }
                System.out.println();
            }
        }
    }
    public static long[][] MirrorArray(long[][] arr,int n,int m){
        for(int i=0;i<n;i++){
            int start =0;
            int end = m-1;
            while(start<end){
            long temp = arr[i][start];
            arr[i][start] = arr[i][end];
            arr[i][end] = temp;
            start++;
            end--;
            }
        }
        
        return arr;
    }
}
