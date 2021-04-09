import java.util.*;
public class base{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int n = input.nextInt();
        long[][] arr = new long[n][n];
        int x = input.nextInt();
        int y = input.nextInt();
        long s;
        if(n>=1&&n<=500){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    s = input.nextLong();
                    if(s>=-Math.pow(10,4)&&s<=Math.pow(10,4)){
                        arr[i][j] = s;
                    }
                }
            }
            if(x>=1&&x<=n&&y>=1&&y<=n){
                changeRow(arr, x, y);
                changeColumn(arr, x, y);
                for (int i = 0; i < arr.length; i++) { 
                    for (int j = 0; j < arr[0].length; j++) 
                        System.out.print(arr[i][j] + " "); 
                    System.out.println(); 
                }
            }
        }
        
    }
    public static long[][] changeRow(long[][] arr,int x,int y){
        for(int i=0; i<arr[0].length;i++){
            long temp = arr[x-1][i];
            arr[x-1][i] = arr[y-1][i];
            arr[y-1][i] = temp;
        }
        return arr;
    }
    public static long[][] changeColumn(long[][] arr,int x,int y){
        for(int i=0; i<arr[0].length;i++){
            long temp = arr[i][x-1];
            arr[i][x-1] = arr[i][y-1];
            arr[i][y-1] = temp;
        }
        return arr;
    }
}