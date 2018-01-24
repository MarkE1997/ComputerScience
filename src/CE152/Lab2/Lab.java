package CE152.Lab2;
import java.util.Scanner;

/**
 * Created by mg17444 on 24/01/2018.
 */
class Lab {
    static void stateOfWater() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a temperature in Celsius.");
        double temp = input.nextInt();

        if (temp > 100) {
            System.out.println("The water would be a gas at this temperature.");
        }
        else if (temp < 0) {
            System.out.println("The water would be solid at this temperature.");
        }
        else {
            System.out.println("The water would be liquid at this temperature.");
        }
    }
    static void calcInterest() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the initial balance of the saving account");
        double balance = input.nextInt();

        System.out.println("Please enter the yearly rate of interest (in percent) on the account");
        double rate = input.nextInt();
        int ratePercent = (int) rate;
        rate = rate/100;

        System.out.println("Please enter the amount of years you wish to calculate.");
        int years = input.nextInt();

        for (int i = 0; i < years ; i++) {
            double thisYearBal = balance * rate;
            balance = balance + thisYearBal;
        }
        System.out.println("The balance after " + years + " years would be £" + balance + " at a rate of "+ratePercent+"%");
    }
    static void isPalindromeWord() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word.");
        String word = input.next();
        Boolean flag = true;
        char[] charArray = word.toCharArray();
        int x = 0;
        int y = charArray.length - 1;
        while (y > x) {
            if (charArray[x] != charArray[y]) {
                flag = false;
            }
            ++x;
            --y;
        }
        if (flag) {
            System.out.println("The word was a palindrome.");
        }
        else {
            System.out.println("The word was not a palindrome.");
        }
    }

}
