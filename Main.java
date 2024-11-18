import java.util.Scanner;

public class Main {
  static int state = 0;
  static String[] confused = {"I don't know what you mean", "What did you say?", "Please enter a valid response", "I don't know how to respond to that..."};
  Enclosure enclosure;
  public static void main(String[] args) {
    new Main().loop();
  }
  public void loop() {
    enclosure = new Enclosure(new Animal[] {
      new Animal(Species.Lion, "Bob", 5), 
      new Animal(Species.Tiger, "Michael", 8)}, "Savanna", 75);
    System.out.println("Welcome to the zoo!");
    System.out.println("What is your name?");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();

    System.out.println("We have a lot to explore! Choose one: ");

    while (true) {
      String input = scanner.nextLine();
      getResponse(input);
    }
  }

  public static void getResponse(String input) {
    if (state == 0) {
      System.out.println("We have a lot to explore! Choose one: ");
      state = 1;
    }
    else if (state == 1) {
      if (input.toLowerCase().contains("enclosure a")) {
        System.out.println("Choose one of our animals to look at: ");
        state = 4;
      }
      else {
        System.out.println("Please give me a species.");
      }
    }
  }
}
