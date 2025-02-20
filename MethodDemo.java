public class MethodDemo{
  public static void main(String[] args) {
    greet();
    printMessage("this is my message!");
  }

  //method for greet
  public static void greet(){
    System.out.println("Hello from the greet method!");
  }
  //method for message
  public static void printMessage(String message){
    System.out.println(message);
  }
}