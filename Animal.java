public class Animal {
    public class Species {
        String speciesName;
        String funFact;
        public Species(String name, String fact) {
            speciesName = name;
            funFact = fact;
        }
    }
    public static Species LION = new Animal.Species("Lion", "Lions are the only cats that live in groups");

    public Animal(Species species ) {

    }
}
