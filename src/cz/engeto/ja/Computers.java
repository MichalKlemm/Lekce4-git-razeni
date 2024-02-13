package cz.engeto.ja;

public class Computers {

    private String description;

    private int yearOfProduction;

    private double price;

    public Computers(String description, int yearOfProduction, double price) {
        this.description = description;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
