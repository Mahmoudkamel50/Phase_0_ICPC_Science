import java.util.*;
public class base {
    static Scanner input = new Scanner(System.in);
    public static void main(String [] args){
       int n = input.nextInt();
       int q = input.nextInt();
        String S = input.next();
        StringBuilder str = new StringBuilder(S);
        for(int i =0;i<q;i++){
            OP(str);
        }
    }
    public static void OP(StringBuilder str){
        int l,r,pos,save;
        char x;
        String Str = input.next();
        switch(Str){
            case "pop_back" : {
                str.deleteCharAt(str.length()-1);
                break;
            }
            case "front" : {
                System.out.println(str.charAt(0));
                break;
            }
            case "back" : {
                System.out.println(str.charAt(str.length()-1));
                break;
            }
            case "sort" : {
                l=input.nextInt();
                r=input.nextInt();
                if(l<=r){}else{
                    save = l;
                    l = r;
                    r= save;
                }
                char[] charArray = str.substring(l-1,r).toCharArray();
                Arrays.sort(charArray);
                str.replace(l-1, r, new String(charArray));
                break;
            }
            case "reverse" : {
                l=input.nextInt();
                r=input.nextInt();
                if(l<=r){}else{
                    save = l;
                    l = r;
                    r= save;
                }
                StringBuilder temp = new StringBuilder(str.substring(l-1 , r));
                temp.reverse();
                str.replace(l-1, r, temp.toString());
                break;
            }
            case "print" : {
                pos = input.nextInt();
                System.out.println(str.charAt(pos-1));
                break;
            }
            case "substr" : {
                l=input.nextInt();
                r=input.nextInt();
                if(l<=r){}else{
                    save = l;
                    l = r;
                    r= save;
                }
                System.out.println(str.substring(l-1, r));
                break;
            }
            case "push_back" : {
                x = input.next().charAt(0);
                str.insert(str.length(), x);
                break;
            }
            default:;
        }
    }
}