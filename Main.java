import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("enter a year:");
        int year = scanner.nextInt();
        boolean isLeapYear = (year%4==0&&year%100 !=0)||(year%400==0);

if (isLeapYear){
    System.out.println(year + "leap year ");
    }
else{
    System.out.println(year + "not leap year ");
        }
scanner.close();
    }
}