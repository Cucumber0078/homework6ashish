//3.1 Declare one instance and one static variable.
//3.2 Declare one instance method.
//3.3 Declare one static method.
//3.4 Call both instance and static variables into both instance and static methods inside the
//print statement.
//3.5 Declare the Main method.
//3.6 Call both instance and static methods into the Main method and run the programme.
package homework6.Bothiv;

public class Java_Programme3 {
    int a=10;
    String name= "Ashish";
    public static void main(String[]args){
        Java_Programme3 obj = new Java_Programme3();
        obj.myMethod();
        ashish();

    }
          public void myMethod(){
              System.out.println(a);
          }

          public static void ashish(){
        System.out.println("name=Ashish" );
          }


}
