import java.util.Scanner;

public class Main {
  static int state = 0;
  static String[] confused = {"I don't know what you mean. ", "What did you say? ", "Please enter a valid response: ", "I don't know how to respond to that..."};
  static Enclosure enclosureA = new Enclosure(new Animal[] {
    new Animal(Species.Lion, "Bob", 5), 
    new Animal(Species.Tiger, "Michael", 8)}, "Savanna", 75);
  static String name;

  public static void main(String[] args) {
    System.out.println("Welcome to the zoo!");
    System.out.print("What is your name? ");
    Scanner scanner = new Scanner(System.in);
    name = scanner.nextLine();

    while (true) {
      String input = scanner.nextLine();
      getResponse(input);
    }
  }

  public static void getResponse(String input) {
    if (state == 0) {
      System.out.print(name + ", We have a lot to explore! Choose one: ");
      state = 1;
    }
    else if (state == 1) {
      if (input.toLowerCase().contains("enclosure a")) {
        System.out.print("Choose one of our animals to look at: ");
        state = 4;
      }
      else {
        System.out.print("Please give me a valid enclosure. ");
      }
    }
    else if (state == 4) {
      Animal animal = enclosureA.getAnimal(Integer.parseInt(input));
      System.out.print("Excellent choice! " + animal.getName() + " is a " + animal.getSpecies() + " and is " + animal.getAge() + " years old. Fun fact! " + animal.getSpecies().getFunFact());
    }
  }
}
