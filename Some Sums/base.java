import java.util.*;
public class base {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long n =input.nextLong();
        int a = input.nextInt();
        int b = input.nextInt();
        int count ;
        int sum = 0;
        int sum1=0;
        if(n>=1&&n<=Math.pow(10,4)&&a>=1&&a<=b&&b<=36){
            for(int i=1;i<=n;i++){
                count = i;
                while(count>0){
                    sum+=count%10;
                    count/=10;
                }
                if(sum>=a&&sum<=b){
                    sum1+=i;
                }
                sum=0;
            }
            System.out.println(sum1);
        }
    }  
}