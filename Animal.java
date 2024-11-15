public class Animal {
    private Species species;
    private String name;
    private int age;
    public Animal(Species species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public Species getSpecies() {
        return species;
    }
    public String getGenus() {
        return species.getGenus();
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void birthday() {
        age++;
        System.out.println(name + " turned " + age + " years old!");
    }

}
