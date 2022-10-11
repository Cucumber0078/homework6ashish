package homework6.Bothiv;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.out;


public class Fahrenheit {
    static double F;

    public static void main(String[] args) {
        temprature();
    }

    public static void temprature() {
        Scanner scanner = new Scanner(System.in);
        {
            Scanner s = new Scanner(System.in);
            out.print("Enter temprature in fahrenheit : ");
            double f = s.nextDouble();
            double c = 5.0 / 9.0 * (f - 32);
            out.printf("%.2lf%cF is equal to %.2lf%c C%n",
                    f, 248, c, 248);

        }
    }
}