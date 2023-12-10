package ie.atu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Features car1 = new Features("20,000","Ford","Red","Mustang",false);
        Features car2 = new Features();

        car2.setCost("30,000");
        car2.setManufacturer("BMW");
        car2.setColour("Black");
        car2.setModel("E30");
        car2.setAutomatic(false);

        System.out.println(car1.toString());
        System.out.println(car2.toString());

    }
}