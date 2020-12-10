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

    @Override
    public String toString() {

        return "Volvo{" +
                "id=" + super.getId() +
                ", brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                "loadCapacity=" + loadCapacity +
                '}';
    }
}
