import java.util.Scanner;

public class Main {
  static int state = 0;
  static String[] confused = {"I don't know what you mean. ", "What did you say? ", "Please enter a valid response.", "I don't know how to respond to that...", "Answer the question I asked you.", "Please repeat with more clarity."};
  static Enclosure savanna = new Enclosure(new Animal[] {
    new Animal(Species.Lion, "Bob", 5), 
    new Animal(Species.Tiger, "Michael", 8),
    new Animal(Species.Lion, "Lizzy", 3),
    new Animal(Species.Hawk, "Cooper", 1)
  }, "Savanna", 75);
  static Enclosure woods = new Enclosure(new Animal[] {
    new Animal(Species.Bear, "Bruno", 8),
    new Animal(Species.Wolf, "Ralph", 13),
    new Animal(Species.Fox, "Nick", 2),
    new Animal(Species.Owl, "Archimedes", 1),
    new Animal(Species.Moose, "William", 4)

  }, "Woods", 30);
  static Enclosure coastal = new Enclosure(new Animal[] {
    new Animal(Species.Crab, "Crabby", 1),
    new Animal(Species.SeaTurtle, "Donatello", 75),
    new Animal(Species.Fish, "Tracy", 1),
    new Animal(Species.Pelican, "Gulliver", 15),
    new Animal(Species.Seal, "Sally", 25)
  }, "Coastal", 60);
  static Enclosure current;
  static String name;
  static String question;
  static MusicPlayer musicPlayer;
  public static void main(String[] args) {
    System.out.println("Welcome to the zoo! You can write 'quit' at anytime to leave.");
    musicPlayer = new MusicPlayer();
    System.out.print("What is your name? ");
    Scanner scanner = new Scanner(System.in);
    name = scanner.nextLine();
    String input = name;

    while (getResponse(input)) {
      input = scanner.nextLine();
    }
    scanner.close();
  }

  public static boolean getResponse(String input) {
    if(input.toLowerCase().contains("quit")) {
      System.out.println("Byebye! You can come back to ask any more questions at any time if you wish to broaden your intellectual horizons!");
      return false;
    }
    if (state == 0) {
      System.out.println(name + ", We have a lot to explore! We have three enclosures. There are the Savanna, the Woods, and the Coastal Enclosures.");
      askQuestion("Choose one of the enclosures: Savanna, Woods, or Coastal");
      state = 1;
    }
    else if (state == 1) {
      if (input.toLowerCase().contains("savanna")) {
        musicPlayer.playSound("lion.wav");
        System.out.println("This feels good! It is a crisp " + savanna.getTemp() + " degrees here.");
        System.out.println("Welcome to the savanna! This mix of a forest and desert actually occurs nearly everywhere worldwide, but most famously in Africa!\nWe have " 
        + (savanna.getTotal()) + " animals in our savanna enclosure. Here they are: ");
        outputAnimalsList(savanna);
        current = savanna;
        state = 2;
      }
      else if (input.toLowerCase().contains("woods")) {
        musicPlayer.playSound("howl.wav");
        System.out.println("Brrr.... its cold here. Just " + woods.getTemp() + " degrees farenheit.");
        System.out.println("Worldwide there are many types of woods, including tropical forests, boreal forests, and temperate forests. \nThis one is a taiga forest, characterized by cold weather.\nWe have " 
        + (savanna.getTotal()) + " animals in our woods enclosure. Here they are: ");
        outputAnimalsList(woods);
        current = woods;
        state = 2;
      }
      else if (input.toLowerCase().contains("coastal")) {
        musicPlayer.playSound("ocean.wav");
        System.out.println("Little windy here, but not too cold at " + coastal.getTemp() + " degrees.");
        System.out.println("Our cool, oceanside coastal enclosure has both a saltwater area and a sandy beach, with birds, crabs, and sea creatures!\nWe have " 
        + (savanna.getTotal()) + " animals in our coastal enclosure. Here they are: ");
        outputAnimalsList(coastal);
        current = coastal;
        state = 2;
      }
      else {
        randomResponse();
      }
    }
    else if (state == 2) {
      try {
        int index = Integer.parseInt(input);
        index --;
        if (index >= 0 && index < current.getTotal()) {
          Animal animal = current.getAnimal(index);
          System.out.println("Excellent choice! " + animal.getName() + " is a " + animal.getSpecies().getGenus() + " and is " + animal.getAge() + " years old. Fun fact! " + animal.getSpecies().getFunFact());
          askQuestion("You can choose another animal or leave. Do you want to choose another animal (yes/no)? ");
          state = 3;
      }
      else {
        System.out.println("Please enter an integer in the range specified above: ");
      }
      } catch (NumberFormatException e) {
        System.out.print("Please enter a valid integer. ");
      }

    }
    else if (state == 3) {
      if (input.toLowerCase().equals("yes")) {
        askQuestion("Which animal would you like to choose (1-" + (current.getTotal()) + ")? ");
        state = 2;
      }
      else if (input.toLowerCase().equals("no")) {
        askQuestion("Would you like to look at another enclosure? ");
        state = 4;
      }
      else {
        randomResponse();
      }
    }
    else if (state == 4) {
      if (input.toLowerCase().equals("yes")) {
        System.out.println(name + ", We have a lot to explore! We have three enclosures. There are the Savanna, the Woods, and the Coastal Enclosures.");
        askQuestion("Choose one of the enclosures: Savanna, Woods, or Coastal");
        state = 1;
      }
      else if (input.toLowerCase().equals("no")) {
        System.out.print("Thank you for coming. Toodaloo!");
        return false;
      }
      else {
        randomResponse();
      }
    }
    return true;
  }
  public static void randomResponse() {
    String r = confused[(int)(Math.random() * confused.length)];
    System.out.println(r);
    System.out.println(question);
  }
  public static void outputAnimalsList(Enclosure enclosure) {
    for (int i = 0; i < enclosure.getTotal(); i++) {
      Animal a = enclosure.getAnimal(i);
      System.out.println(i+1 + ": " + a.getName() + " is a " + a.getSpecies().getGenus());
    }
    askQuestion("Enter the number for the animal you'd like to learn more about!");
  }
  public static void askQuestion(String q) {
    question = q;
    System.out.println(q);
  }
}
