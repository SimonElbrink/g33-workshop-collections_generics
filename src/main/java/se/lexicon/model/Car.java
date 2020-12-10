package se.lexicon.model;

public class Car {


    private static int counter = 0;

    private final int id;
    private String brand;
    private String model;

    public Car (String brand, String model){
        this.id = ++counter;
        this.brand = brand;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}


