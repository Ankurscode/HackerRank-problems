
import java.util.*;
    public class Solution {
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            if(n%2!=0){
                System.out.println("Weird");
            }
            else if(n%2==0&& 2<=n&& n<5){
                System.out.println("Not Weird");
            }
            else if(n%2==0 && 6<n && 20>=n){
                System.out.println("Weird");
            }
            else if(n%2==0 && n>20){
                System.out.println("Not Weird");
            }
        }
    }

