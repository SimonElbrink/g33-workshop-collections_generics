package se.lexicon.model;

public class Volvo extends Car{

    private double loadCapacity;

    private static final String BRAND = "Volvo";

    public Volvo (String model, double loadCapacity){
        super(BRAND, model);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
