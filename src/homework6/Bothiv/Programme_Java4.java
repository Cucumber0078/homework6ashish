//4.1 Declare two instance and two static variables.
//4.2 Declare one instance method.
//4.3 Declare one static method.
//4.4 Call all four instance and static variables into both instance and static methods inside the
//print statement.
//4.5 Declare the Main method.
//4.6 Call both instance and static methods into the Main method and run the programme.
package homework6.Bothiv;

public class Programme_Java4 {
 int a=10;
 int b=20;
 static String name="ashish";
 static String surname="Mor";
 public static void main(String[]args){
     Programme_Java4 obg= new Programme_Java4();
     obg.myMethod();
     ashish();

 }
  public void myMethod(){
      System.out.println(a);
      System.out.println(b);
  }
  public static void ashish(){
      System.out.println("name");
      System.out.println("surname");
  }
}


