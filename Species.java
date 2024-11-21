public class Species {
    public static final Species Lion = new Species("Lion", "Lions are the only cats that live in groups");
    public static final Species Tiger = new Species("Tiger", "Tigers are the largest species of cat! They are also carnivores, meaning they only eat meat.");
    public static final Species Dog = new Species("Dog", "I like dogs");
    public static final Species Hawk = new Species("Hawk", "In Native American cultures, hawks are revered for their keen sense of sight and ability to fly at great heights.");

    private String genus;
    private String funFact;

    public Species(String genus, String fact) {
        this.genus = genus;
        this.funFact = fact;
    }

    public String getGenus() {
        return genus;
    }
    
    public String getFunFact() {
        return funFact;
    }
}