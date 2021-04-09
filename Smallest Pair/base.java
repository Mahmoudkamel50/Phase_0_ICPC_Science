import java.util.*;
public class base{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int t = input.nextInt();
        if(t>=1&&t<=100){
            for(int i =0;i<t;i++){
                int n = input.nextInt();
                if(n>=2&&n<=100){
                    System.out.println(SmallestPair(Arr(n),n));
                }
            }
            
        }
    }
    public static ArrayList<Integer> Arr(int n){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i =0;i<n;i++){
            arr.add(input.nextInt());
        }
        System.out.println(Collection.min(arr));
        return arr;
    }
    public static int SmallestPair(ArrayList<Integer> arr,int n){
        int min=0;
        ArrayList<Integer> Arr = new ArrayList<Integer>();
        for(int h=0;h<n;h++){
            if(arr.get(h)>=-Math.pow(10,6)&&arr.get(h)<=Math.pow(10,6)){
                for(int i=1;i<n;i++){
                    for(int j=i+1;j<=n;j++){
                        Arr.add(arr.get(i-1)+arr.get(j-1)+j-i);
                    }
                }
            }
        }
        if(!arr.isEmpty()){
            min = Arr.get(0);
        }
        for(int k=0;k<Arr.size();k++){
            if(Arr.get(k)<=min){
                min = Arr.get(k);
            }
        }
        return min;
    }
}