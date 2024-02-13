package cz.engeto.ja;

import java.math.BigDecimal;

public class Computer {

    private String description;

    private int yearOfProduction;

    private BigDecimal price;

    public Computer(String description, int yearOfProduction, BigDecimal price) {
        this.description = description;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
    }

    public Computer(String description, int yearOfProduction, int price){
        this(description, yearOfProduction, BigDecimal.valueOf(price));
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return description+" ("+ yearOfProduction+
                ", price = " + price + " Kč)";

    }
}
