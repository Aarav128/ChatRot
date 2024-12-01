public class Enclosure {
    private Animal[] animals;
    private int total;
    private String biome;
    private double temperature;

    public Enclosure(Animal[] animals, String biome, double temperature) {
        this.animals = animals;
        this.total = animals.length;
        this.biome = biome;
        this.temperature = temperature;
    }

    public Animal getAnimal(int i) {
        return animals[i];
    }

    public String getBiome() {
        return biome;
    }

    public double getTemp() {
        return temperature;
    }

    public int getTotal() {
        return total;
    }
    public Animal[] getAnimals() {
        return animals;
    }

    public int countSpecies(Species x) {
        int count = 0;
        for (Animal i : animals) {
            if (i.getSpecies() == x) {
                count++;
            }
        }
        return count;
    }
    public String[] animalNames() {
        String[] names = new String[animals.length];
        for(int i = 0; i < animals.length; i++) {
            names[i] = animals[i].getName();
        }
        return names;
    }
}