package web.model;

public class Car {
    private int id;
    private String brand;
    private String model;


    public Car(int id, String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
