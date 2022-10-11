package homework6.Bothiv;

import java.util.Scanner;

public class CalculatoTriange {
    static double F;
    public static void main(String []args){
        calculator();
    }
    public static void calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("calculate the area of a triangle= " );
        F=scanner.nextInt();
        scanner.close();
        System.out.println( );
    }
}
