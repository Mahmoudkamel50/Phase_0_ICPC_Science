import java.util.*;
public class base {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i,m=0,flag=0;      
        int n=input.nextInt();  
        m=n/2;
        if(n>=2&&n<=Math.pow(10,5)){      
        if(n==0||n==1){  
         System.out.println("NO");      
        }else{  
         for(i=2;i<=m;i++){      
          if(n%i==0){      
           System.out.println("NO");      
           flag=1;      
           break;      
          }      
         }      
         if(flag==0)  { System.out.println("YES"); }  
        }
    }
    }
}
