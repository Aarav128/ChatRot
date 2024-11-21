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
    String input = scanner.nextLine();

    while (getResponse(input)) {
      String input = scanner.nextLine();
    }
  }

  public static boolean getResponse(String input) {
    if (state == 0) {
      System.out.print(name + ", We have a lot to explore! We have three enclosures. There is Enclosure A, Enclosure B, and Enclosure C. Choose one: ");
      state = 1;
    }
    else if (state == 1) {
      if (input.toLowerCase().contains("enclosure a")) {
        System.out.print("Choose the number of the animal you want to see (1-" + (EnclosureA.length + 1) + "): ");
        state = 2;
      }
      else {
        System.out.print("Please give me a valid enclosure: ");
      }
    }
    else if (state == 2) {
      Animal animal = enclosureA.getAnimal(Integer.parseInt(input));
      System.out.println("Excellent choice! " + animal.getName() + " is a " + animal.getSpecies() + " and is " + animal.getAge() + " years old. Fun fact! " + animal.getSpecies().getFunFact());
      System.out.print("You can choose another animal or leave. Do you want to choose another animal (yes/no)? ");
      state = 3;
    }
    else if (state == 3) {
      if (input.toLowerCase().equals("yes")) {
        System.out.print("Which animal would you like to choose (1-" + (EnclosureA.length + 1) + ")? ");
        state = 3;
      }
      else if (input.toLowerCase().equals("no")) {
        System.out.print("Would you like to look at another enclosure? ");
        state = 4;
      }
      else {
        System.out.print("It's a yes or no question, blud. ");
      }
    }
    else if (state == 4) {
      if (input.toLowerCase().equals("yes")) {
        System.out.print(name + ", We have a lot to explore! We have three enclosures. There is Enclosure A, Enclosure B, and Enclosure C. Choose one: ");
      }
      else if (input.toLowerCase().equals("no")) {
        System.out.print("Thank you for coming. Toodaloo!");
        return false;
      }
      else {
        System.out.print("It's a yes or no question, blud. ");
      }
    }
    return true;
  }
}
