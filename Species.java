public class Species {
    public static final Species LION = new Species("Lion", "Lions are the only cats that live in groups");
    public static final Species TIGER = new Species("Tiger", "Tigers are the largest species of cat! They are also carnivores, meaning they only eat meat.");
    public static final Species DOG = new Species("Dog", "I like dogs");

    String speciesName;
    String funFact;
    public Species(String name, String fact) {
        speciesName = name;
        funFact = fact;
    }
}
