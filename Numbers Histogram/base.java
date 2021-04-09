import java.util.*;
public class base {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char s = input.next().charAt(0);
        int n = input.nextInt();
        int[] k = new int[n];
        for(int y=0;y<k.length;y++){
            k[y]=input.nextInt();
        }
        if(s=='+'||s=='-'||s=='*'||s=='/'){
            for(int i=0;i<n;i++){
                for(int j=0;j<k[i];j++){
                    System.out.print(s);
                }
                System.out.println();
            }
        }
    }
}
