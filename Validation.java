import java.util.Scanner;

public class Validation {
  // common prompts when an input is not valid
  void reEnterPrompts() {
    System.out.println("You entered an invalid number");
    System.out.println("the number should be a positive");
    System.out.print("Please enter a valid number: ");
  }

  // this method validates the number entered into the system.
  float validateNumber(String number) {
    Scanner scanner = new Scanner(System.in);
    float convertedNumber;
    while (true) {
      try {
        convertedNumber = Float.parseFloat(number);
        while (convertedNumber <= 0) {
          reEnterPrompts();
          convertedNumber = Float.parseFloat(scanner.nextLine());
        }
        ;
        return convertedNumber;

      } catch (Exception e) {
        reEnterPrompts();
        number = scanner.nextLine();
      }
    }
  }
}