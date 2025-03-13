public class Validation {

    float validateFloat(float number){
        Scanner scanner = new Scanner(System.in);
        while (number <= 0){
            System.out.println("You entered an invalid number");
            System.out.println("the number should be a positive");
            System.out.print("Please enter a valid number: ");
            
        };
        return number;
    }
}