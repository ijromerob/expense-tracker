public class Restaurants extends Transfer {

  String restaurant;

  public Restaurants() {
    System.out.print("Please enter a restaurant: ");
    String restaurant = scanner.nextLine();
    this.restaurant = restaurant;
  }

  void printCostTransaction() {
    super.printTransaction();
    System.out.println("restaurant: " + this.restaurant);
  }

}
