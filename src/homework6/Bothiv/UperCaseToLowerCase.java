package homework6.Bothiv;

import java.util.Scanner;

public class UperCaseToLowerCase {
        private static Scanner sc;
        public static void main(String[] args) {
            String uppStr;

            sc= new Scanner(System.in);

            System.out.print("\nEnter Uppercase String to convert = A ");
            uppStr = sc.nextLine();

            String uppStr2 = uppStr.toLowerCase( );
            System.out.println("\nThe Lowercase String  =  " + uppStr2);
        }
    }
