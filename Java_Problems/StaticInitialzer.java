import java.util.*;
public class StaticInitialzer {
    public static void main(String[] args) {
        System.out.println(flag);
    }
    static int B;
    static int H;
    static boolean flag=true;

    static{
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of B"+B);
        B=in.nextInt();
        System.out.println("Enter the value of H"+H);
        H=in.nextInt();
        if(B<=0||H<0){
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }
    }

}
