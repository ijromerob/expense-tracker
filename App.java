import java.util.Scanner;

public class App {

  public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter your age: ");
    int age = Integer.parseInt(scanner.nextLine());
    System.out.println("your age is "+age);
  }
}