import java.util.*;
public class base {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean y=false;
        do{
            int x = input.nextInt();
            if(x>=Math.pow(10,3)&&x<=Math.pow(10,5)){
                if(x==1999){
                    System.out.println("Correct");
                    y =false;
                }
                else{
                    System.out.println("Wrong");
                    y=true;
                }
            }
        }while(y);
    }
}
