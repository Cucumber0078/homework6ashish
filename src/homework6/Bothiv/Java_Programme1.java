package homework6.Bothiv;

//1.1 Declare two instance variables.
//1.2 Declare one instance method.
//1.3 Call both instance variables into the instance method inside the print statement.
//1.4 Declare the Main method.
//1.5 Call the above instance method into the Main method and Run the programme.
public class Java_Programme1 {
    int a = 10;
    int b = 20;

    public static void main(String[] args) {
        Java_Programme1 obj = new Java_Programme1();
        obj.myMethod();

    }
    public void myMethod(){
        System.out.print("a=");
        System.out.println(a);
        System.out.print("b=");
        System.out.println(b);




    }

}




