package homework6.Bothiv;

import java.util.Scanner;

public class FormulaOfArea {
   static double r ;
   static double PI=3.1416;

    public static void main(String[] args){
       Formula();
    }
    public static void Formula (){
        System.out.print("Enter value of r :");
       Scanner scan= new Scanner(System.in);
        r = scan.nextDouble();
        scan.close();
        System.out.println("Area A = " + (3.1416*r*r));

    }
}

