public class Species {
    public static final Species Lion = new Species("Lion", "Lions are the only cats that live in groups.");
    public static final Species Tiger = new Species("Tiger", "Tigers are the largest species of cat! They are also carnivores, meaning they only eat meat.");
    public static final Species Wolf = new Species("Wolf", "Awooooo!");
    public static final Species Hawk = new Species("Hawk", "In Native American cultures, hawks are revered for their keen sense of sight and ability to fly at great heights.");
    public static final Species Moose = new Species("Moose", "Moose are also called rubber-nosed swamp donkeys.");
    public static final Species Bear = new Species("Bear", "Bears have the largest relative brain size of any carnivore.");
    public static final Species Fox = new Species("Fox", "Foxes make use of the earth's magnetic field to hunt.");
    public static final Species Owl = new Species("Owl", "Owls make regurgitated balls of undigested parts of its pray, such as bones, teeth, and fur, called pellets, which are frequently disected in science classes.");
    public static final Species Crab = new Species("Crab", "Crabs are decapods, meaning they have 10 legs.");
    public static final Species Seal = new Species("Seal", "Seals can dive to great depths underwater and stay there for up to two hours.");
    public static final Species SeaTurtle = new Species("Sea Turtle", "Only 1 in 1,000 Turtles eill mskr it to Adulthood, but those who do will live for a long long time!");
    public static final Species Pelican = new Species("Pelican", "There are more than half a dozen species of pelicans, but all of them have the famous throat pouch for which the birds are best known.");
    public static final Species Fish = new Species("Fish", "There are over 27,000 identified species of fish, and an estimated 15,000 more that have not yet been identified.");
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