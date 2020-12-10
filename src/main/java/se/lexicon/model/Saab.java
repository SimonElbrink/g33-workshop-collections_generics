package se.lexicon.model;

public class Saab extends Car{

    private static final String BRAND = "Saab";

    private int horsePower;

    public Saab (String model, int horsePower){
        super(BRAND, model);
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {

        return "Saab{" +
                "id=" + super.getId() +
                ", brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                "horsePower=" + horsePower +
                '}';
    }
}
