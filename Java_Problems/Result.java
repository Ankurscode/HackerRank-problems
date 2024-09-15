
import java.util.*;
public class Result {

    public static void main(String[] args) {
        System.out.println(findDay(8,23,2005));
    }





        public static String findDay(int month, int day, int year) {

            if (!isValidDate(day, month, year)) {
                return "Invalid Date";
            }

            Calendar calendar = new GregorianCalendar(year, month - 1, day);
            String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
            return days[calendar.get(Calendar.DAY_OF_WEEK) - 1];
        }


        private static boolean isValidDate(int day, int month, int year) {
            if (month < 1 || month > 12) {
                return false;
            }

            if (day < 1 || day > 31) {
                return false;
            }


            if (month == 2) {
                if (isLeapYear(year)) {
                    return day <= 29;
                } else {
                    return day <= 28;
                }
            }


            if (month == 4 || month == 6 || month == 9 || month == 11) {
                return day <= 30;
            }

            return true;
        }


        private static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }

    }




