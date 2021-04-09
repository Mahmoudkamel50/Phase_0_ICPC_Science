import java.util.*;
public class base {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long x1 = input.nextLong();
        long y1 = input.nextLong();
        long x2 = input.nextLong();
        long y2 = input.nextLong();
        if(x1>=1&&x1<=Math.pow(10,9)&&x2>=1&&x2<=Math.pow(10,9)&&y1>=1&&y1<=Math.pow(10,9)&&y2>=1&&y2<=Math.pow(10,9)){
            System.out.println(Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2))));
        }
    }
}
