package ie.atu;

public class Car {
  private String cost;
  private String manufacturer;

    public Car() { //default constructor
        this.cost = "";
        this.manufacturer = "";
    }
    public Car(String cost, String manufacturer) {
        this.cost = cost;
        this.manufacturer = manufacturer;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cost='" + cost + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
