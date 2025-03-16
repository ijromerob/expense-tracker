public class Restaurants extends Transfer {

  String restaurant;

  public Restaurants() {
    System.out.print("Please enter a restaurant: ");
    String restaurant = scanner.nextLine();
    this.restaurant = restaurant;
  }

  @Override
  void printTransaction() {
    System.out.println(transferDate + " Description: " + description + " Amount: " + amount + " restaurant: "
        + this.restaurant);
  }

}
