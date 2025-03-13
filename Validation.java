import java.util.Scanner;

public class Validation {

    float validateFloat(float number){
        Scanner scanner = new Scanner(System.in);
        while (number <= 0){
            System.out.println("You entered an invalid number");
            System.out.println("the number should be a positive");
            System.out.print("Please enter a valid number: ");
            number = Float.parseFloat(scanner.nextLine());
        };
        return number;
    }

    float validateNumeric(string number){
        float convertedNumber;
        while(true){
            try {
                convertedNumber = 
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}