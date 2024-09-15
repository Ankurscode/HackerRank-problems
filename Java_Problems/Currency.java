
import java.util.*;
import java.text.*;
import java.text.Format;
public class Currency {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double payment = scanner.nextDouble();
            scanner.close();

            // Write your code here.
            NumberFormat usFormat=NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat chinaFormat=NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat franceFormat=NumberFormat.getCurrencyInstance(Locale.FRANCE);
            Locale indiaLocale=new Locale("en","IN");
            NumberFormat indiaFormat=NumberFormat.getCurrencyInstance(indiaLocale);
            String us=usFormat.format(payment);
            String china=chinaFormat.format(payment);
            String france=franceFormat.format(payment);
            String india = indiaFormat.format(payment);

            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
        }
    }

