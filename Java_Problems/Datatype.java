import java.util.*;
public class Datatype {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();  // Number of test cases

            for (int i = 0; i < t; i++) {
                try {
                    long n = sc.nextLong();  // Read the number to check
                    System.out.println(n + " can be fitted in:");

                    // Check byte
                    if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                        System.out.println("* byte");
                    }

                    // Check short
                    if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                        System.out.println("* short");
                    }

                    // Check int
                    if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                        System.out.println("* int");
                    }

                    // Check long
                    if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                        System.out.println("* long");
                    }

                } catch (Exception e) {
                    System.out.println(sc.next() + " can't be fitted anywhere.");
                }
            }
            sc.close();
        }
    }


