package homework6.Bothiv;

import java.util.Scanner;

public class Calculator {
    static int a;
    static int b;
    public static void main (String[]args){
        Calculator obg = new Calculator();
        obg.addition();
        obg.Subtraction();
        Multiplication();
        division();

    }
    public void addition(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("please enter first value = ");
        a=scanner.nextInt();
        System.out.print("please enter second value = ");
        b=scanner.nextInt();
        Calculator obj = new Calculator();
        System.out.println("Addition = " + (a+b));
    }
    public void Subtraction(){
        System.out.println("Subtraction= " + (a-b));
    }

    public static void Multiplication(){
        System.out.println("Multiplication = " + (a*b));
    }

    public static void division(){
        System.out.println("division =" + (a/b));
    }






}
