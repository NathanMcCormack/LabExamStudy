package ie.atu;

public class Features extends Car{
    private String colour;
    private String model;
    private boolean automatic;

    public Features() { //default constructor
        this.colour = "";
        this.model = "";
        this.automatic = true;
    }

    public Features(String cost, String manufacturer, String colour, String model, boolean automatic) {
        super(cost,manufacturer);
        this.colour = colour;
        this.model = model;
        this.automatic = automatic;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    @Override
    public String toString() {
        return super.toString() +
                "colour: '" + colour + '\'' +
                ", model: '" + model + '\'' +
                ", automatic: " + automatic +
                '}';
    }
}
