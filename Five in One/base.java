import java.util.*;
public class base {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int n = input.nextInt();
        int i;
        int min;
        int max;
        if(n>=1&&n<=100){
            Integer[] arr = new Integer[n] ;
            int[] Arr = new int[n];
            for(i=0;i<n;i++){
                int x =input.nextInt();
                if(x>=1&&x<=100){
                    arr[i] =x;
                    Arr[i] =x;
                }
                else{
                    System.exit(0);
                }
            }
            
            min = Collections.min(Arrays.asList(arr));
            max = Collections.max(Arrays.asList(arr));
            System.out.println("The maximum number : " + max);
            System.out.println("The minimum number : " + min);
            System.out.println("The number of prime numbers : " + primeCount(Arr, Arr.length));
            System.out.println("The number of palindrome numbers : " + countPalinDigits(Arr, Arr.length));
            System.out.println("The number that has the maximum number of divisors : " + maxDivisors(Arr, n));
            
        }
    }
    public static int primeCount(int arr[], int n) { 
        int max_val = Arrays.stream(arr).max().getAsInt(); 
        Boolean[] prime = new Boolean[max_val + 1]; 
        for (int i = 0; i < max_val + 1; i++) { 
            prime[i] = true; 
        } 
        prime[0] = false; 
        prime[1] = false; 
        for (int p = 2; p * p <= max_val; p++)  
        {
            if (prime[p] == true)  { 
                for (int i = p * 2; i <= max_val; i += p) { 
                    prime[i] = false; 
                } 
            } 
        }
        int count = 0; 
        for (int i = 0; i < n; i++) { 
            if (prime[arr[i]]) { 
                count++; 
            } 
        } 
        return count; 
    }
    public static int countPalinDigits(int Arr[],int n){
        int count =0;
        for(int i=0;i<n;i++){
            if(Arr[i]<10){
                count++;
            }else if(Arr[i]%10==Arr[i]/10){
                count++;
            }
        }
        return count;
    }
    public static int maxDivisors(int Arr[],int n){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        ArrayList<Integer> temp3 = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=1;j<=Arr[i];j++){
                if(Arr[i]%j==0){
                    count++;
                }
            }
            temp.add(count);
        }
        int max=temp.get(0);
        int temp2=0;
        for(int k=0;k<n;k++){
            if(temp.get(k)>max){
                max = temp.get(k);
                temp2=k;
            }
        }
        for(int x=0;x<n;x++){
            if(temp.get(x)==max){
                temp3.add(Arr[x]);
            }
        }
        int Max = temp3.get(0);
        for(int y=0;y<temp3.size();y++){
            if(temp3.get(y)>Max){
                Max = temp3.get(y);
            }
        }
        return Max;
    }
}