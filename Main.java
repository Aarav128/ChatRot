import java.util.Scanner;

public class Main {
  static int state = 0;

  public static void main(String[] args) {
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
      if (input.toLowerCase().contains("lion")) {
        System.out.println("Choose one of our lions to look at: ");
        state = 4;
      }
      else {
        System.out.println("Please give me a species.");
      }
    }
  }
}
