import java.util.*;
public class base {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long[] a = new long[n];
        if(n>=1&&n<=Math.pow(10,3)){
            for(int i=0;i<n;i++){
                a[i] = input.nextLong();
            }
            for(int j=0;j<n;j++){
                if(a[j]>=-Math.pow(10,9)&&a[j]<=Math.pow(10,9)){
                    if(n%2==0){
                        for(int k=1;k<=n/2;k++){
                            System.out.print(a[a.length-k*2] + " ");
                        }
                    }
                    else{
                        for(int k=0;k<=(n)/2;k++){
                            System.out.print(a[a.length-k*2-1] + " ");
                        }
                        
                    }
                }
                break;
            }
        }
    }
}
