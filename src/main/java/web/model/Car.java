package web.model;

public class Car {

    String brand;
    String color;
    int manufactureYear;

    public Car() {
    }

    public Car(String brand, String color, int manufactureYear) {
        this.brand = brand;
        this.color = color;
        this.manufactureYear = manufactureYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", manufactureYear=" + manufactureYear +
                '}';
    }
}
