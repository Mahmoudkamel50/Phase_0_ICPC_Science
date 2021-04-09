import java.util.*;
public class base {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int x = input.nextInt();
        if(x>999&&x<=9999){
            while(x>=10){
              x/=10; 
            }
            if(x%2==0){
                System.out.println("EVEN");
            }
            else{
                System.out.println("ODD");
            }
        }
    }
}
