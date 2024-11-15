public class Species {
    public static Species LION = new Species("Lion", "Lions are the only cats that live in groups");

    String speciesName;
    String funFact;
    public Species(String name, String fact) {
        speciesName = name;
        funFact = fact;
    }
}
