import java.util.*;
public class base {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int a = input.nextInt();
        char s = input.next().charAt(0);
        int b = input.nextInt();
        char q = input.next().charAt(0);
        long c = input.nextLong();
        if(a>=0&&a<=100&&b>=0&&b<=100&&c>=-Math.pow(10,5)&&c<=Math.pow(10,5)&&q=='='&&(s=='+'||s=='-'||s=='*')){
            switch(s){
                case '-' :{
                    if(a-b==c){
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println(a-b);
                    }
                    break;
                }
                case '+' :{
                    if(a+b==c){
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println(a+b);
                    }
                    break;
                }
                case '*' :{
                    if(a*b==c){
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println(a*b);
                    }
                    break;
                }
                default:break;
            }
        }
    }
}
