import java.util.*;
public class base {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        String s = input.next();
        if(a>=1&&a<=10&&b>=1&&b<=10&&s.length()==a+b+1){
            if((s.substring(0,a).length()==a&&(s.substring(a+1).length()==b&&s.charAt(a)=='-'))){
                for(int i=0;i<s.substring(0,a).length();i++){
                    if(((int)(s.substring(0,a).charAt(i))>=48&&(int)(s.substring(0,a).charAt(i))<=57)){

                    }
                    else{
                        System.out.print("No");
                        System.exit(0);
                    }
                }
                for(int i=0;i<s.substring(a+1).length();i++){
                    if(((int)(s.substring(a+1).charAt(i))>=48&&(int)(s.substring(a+1).charAt(i))<=57)){

                    }
                    else{
                        System.out.print("No");
                        System.exit(0);
                    }
                }
                System.out.println("Yes");
            }
            else{
                System.out.print("No");
            }
        }
        else{
            System.out.println("No");
        }
    }
}