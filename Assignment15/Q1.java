class Vehicle {
    private String brand;
    private String countryOfOrigin;
    private double basePrice;
    
    public void input(String brand, String countryOfOrigin, double basePrice) {
        this.brand = brand;
        this.countryOfOrigin = countryOfOrigin;
        this.basePrice = basePrice;
    }
    
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Base price: " + basePrice);
    }
    
    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}

class Car extends Vehicle {
    public String model;
    public int speed;
    public double marketPrice;
    
    public void read(String brand, String countryOfOrigin, double basePrice, String model, int speed) {
        input(brand, countryOfOrigin, basePrice);
        this.model = model;
        this.speed = speed;
        calculateMarketPrice();
    }
    
    public void show() {
        display();
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed);
        System.out.println("Market price: " + marketPrice);
    }
    
    private void calculateMarketPrice() {
        double basePrice = getBasePrice();
        if (speed > 80) {
            marketPrice = basePrice * 1.15;
        } else {
            marketPrice = basePrice * 0.95;
        }
    }
    
}

public class Q1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.read("Honda", "Japan", 20000, "Civic", 100);
        car.show();
    }
}