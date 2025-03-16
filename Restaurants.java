public class Restaurants extends Transfer {

  String restaurant;

  // In this constructor the restaurant name is added
  public Restaurants() {
    System.out.print("Please enter a restaurant: ");
    String restaurant = scanner.nextLine();
    this.restaurant = restaurant;
  }

  // in this method, prints in the terminal the details of the transactions
  @Override
  void printTransaction() {
    System.out.println(transferDate + " Description: " + description + " Amount: " + amount + " restaurant: "
        + this.restaurant);
  }

}
