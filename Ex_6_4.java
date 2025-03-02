import java.util.Scanner;

public class Ex_6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = 0;
        int year;
        while (month == 0) {
            System.out.println("Enter a month (example: January, Jan., Jan, and 1); ");
            String inputMonth = sc.nextLine().toLowerCase();
            switch (inputMonth) {
                case "january": case "jan.": case "jan": case "1":
                    month = 1;
                    break;
                case "february": case "feb.": case "feb": case "2":
                    month = 2;
                    break;
                case "march": case "mar.": case "mar": case "3":
                    month = 3;
                    break;
                case "april": case "apr.": case "apr": case "4":
                    month = 4;
                    break;
                case "may": case "5":
                    month = 5;
                    break;
                case "june": case "jun": case "6":
                    month = 6;
                    break;
                case "july": case "jul": case "7":
                    month = 7;
                    break;
                case "august": case "aug.": case "aug": case "8":
                    month = 8;
                    break;
                case "september": case "sept.": case "sep": case "9":
                    month = 9;
                    break;
                case "october": case "oct.": case "oct": case "10":
                    month = 10;
                    break;
                case "november": case "nov.": case "nov": case "11":
                    month = 11;
                    break;
                case "december": case "dec.": case "dec": case "12":
                    month = 12;
                    break;
                default: System.out.println("Invalid month. Please enter a valid month.");
            }
        }
        boolean validYear = false;
        year = -1;
        while (!validYear) {
            System.out.println("Enter a year (example: 1999): ");
            try {
                year = Integer.parseInt(sc.nextLine());
                if (year <= 0) {
                    System.out.println("Invalid year. Please enter a non-negative number.");
                } else {
                    validYear = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid year. Please enter all digits (e.g., 1999).");
            }
        }
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int days = daysInMonth[month - 1];
        if (month == 2 && isLeapYear) {
            days = 29;
        }
        System.out.println(monthNames[month - 1] + " " + year + " has " + days + " days.");
        sc.close();
    }
}