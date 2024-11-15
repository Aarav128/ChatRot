public class Enclosure {
    private Animal[] animals;
    private int total;
    private String biome;
    private double temperature;

    public Enclosure(Animal[] myArr, String myStr, double myDbl) {
        this.animals = myArr;
        this.total = animals.length;
        this.biome = myStr;
        this.temperature = myDbl;
    }

    public static Animal getAnimal(int i) {
        return animals[i];
    }

    public static String getBiome() {
        return biome;
    }

    public static double getTemp() {
        return temperature;
    }

    public static int getTotal() {
        return total;
    }

    public static int countSpecies(Species x) {
        int count = 0;
        for (Animal i : animals) {
            if (i.getSpecies() == x) {
                count++;
            }
        }
        return count;
    }
}