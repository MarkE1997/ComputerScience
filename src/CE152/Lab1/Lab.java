package CE152.Lab1;
import java.util.Scanner;
public class Lab {

    public static void calcInterest() {
        // insert code for exercise on calculating interest
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the initial balance of the saving account");
        double balance = input.nextInt();

        System.out.println("Please enter the yearly rate of interest (in percent) on the account");
        double rate = input.nextInt();
        rate = rate/100;
        double thisYearBal = balance * rate;

        balance = balance + thisYearBal;
        System.out.println("Balance after 1 year: " + balance);
        thisYearBal = balance * rate;
        balance = balance + thisYearBal;
        System.out.println("Balance after 2 years: " + balance);
        thisYearBal = balance * rate;
        balance = balance + thisYearBal;
        System.out.println("Balance after 3 years: " + balance);

    }
    public static void calcMeans() {
        // insert code for exercise on calculating means
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter two double numbers:");
        double num1 = input.nextInt();
        double num2 = input.nextInt();
        double[] dataArray;
        dataArray = new double[2];
        dataArray[0] = num1;
        dataArray[1] = num2;

        // arithmetic
        double ariMean = ((num1 + num2)/2);

        // geometric
        double geoMean = Math.sqrt(num1 * num2);

        // harmonic
        double sum = 0.0;
        for (double aDataArray : dataArray) {
            sum += 1.0 / aDataArray;
        }
        double harMean = dataArray.length / sum;

        System.out.println("Arithmetic mean: " + ariMean);
        System.out.println("Geometric mean: " + geoMean);
        System.out.println("Harmonic mean: " + harMean);

    }

    public static void greetName() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String fname = input.next();
        System.out.println("Please enter your second name: ");
        String sname = input.next();
        System.out.println("Hello " + fname.trim() + " " + sname.trim() + "!");

    }

    public static void escapeSeq() {
        System.out.println("\"Hello,\n World\"");
        System.out.println("\t\\t|t//t/");
        System.out.println("#\'a\\ab\\b'^");
    }

    public static void ageDiffrence() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first age, in months and years");
        System.out.print("Years: ");
        int years1 = input.nextInt();
        System.out.print("Months: ");
        int months1 = input.nextInt();

        System.out.println("Please enter the second age, in months and years");
        System.out.print("Years: ");
        int years2 = input.nextInt();
        System.out.print("Months: ");
        int months2 = input.nextInt();
        int diff1;
        int diff2;
        if (years1 > years2) {
            diff1 = (years1 - years2);
            if (months1 > months2) {
                diff2 = (months1 - months2);
                System.out.println("The diff is " + diff1 + " years and " + diff2 + " months");
            }
            else {
                diff2 = (months2 - months1);
                System.out.println("The diff is " + diff1 + " years and " + diff2 + " months");
            }
        }
        else {
            diff1 = (years2 - years1);
            if (months1 < months2) {
                diff2 = (months2 - months1);
                System.out.println("The diff is " + diff1 + " years and " + diff2 + " months");
            }
            else {
                diff2 = (months1 - months2);
                System.out.println("The diff is " + diff1 + " years and " + diff2 + " months");
            }
        }

    }

    public static void nextCharacters() {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a character: ");
    char userIn = input.next().charAt(0);
    int character = (int) userIn;
    character ++;
    System.out.println(Character.toString((char)character));
    character ++;
    System.out.println(Character.toString((char)character));
}

    public static void triangleArea() {
//      take inputs
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the coordinates of the three corners of a triangle:");
        System.out.print("X Coordinate A: ");
        int coord1x = input.nextInt();
        System.out.print("Y Coordinate A: ");
        int coord1y = input.nextInt();
        System.out.print("X Coordinate B: ");
        int coord2x = input.nextInt();
        System.out.print("Y Coordinate B: ");
        int coord2y = input.nextInt();
        System.out.print("X Coordinate C: ");
        int coord3x = input.nextInt();
        System.out.print("Y Coordinate C: ");
        int coord3y = input.nextInt();

//      calculate the area
        double area = (((coord1x*(coord2y-coord3y))+(coord2x*(coord3y-coord1y))+(coord3x*(coord1y-coord2y)))/2);
        if (area < 0) {
            area *= -1;
        }
//      print the area
        System.out.print("The absolute area is: " + area);
    }
}