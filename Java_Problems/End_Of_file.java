
import java.util.*;
public class End_Of_file {
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scan =new Scanner(System.in);
            int linenumber=1;
            while(scan.hasNext()){
                String line=scan.nextLine();
                System.out.println(linenumber+" "+line);
                linenumber++;
            }

        }

    }


