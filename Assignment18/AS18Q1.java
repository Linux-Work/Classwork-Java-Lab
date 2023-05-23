abstract class Shape {
    protected double length;
    protected double breadth;
    protected double height;
    
    public Shape(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    
    public abstract double volume();
    
    public abstract double surfaceArea();
}

class Cube extends Shape {
    public Cube(double sideLength) {
        super(sideLength, sideLength, sideLength);
    }
    
    public double volume() {
        return length * length * length;
    }
    
    public double surfaceArea() {
        return 6 * length * length;
    }
}

class Cylinder extends Shape {
    public Cylinder(double radius, double height) {
        super(radius, radius, height);
    }
    
    public double volume() {
        return Math.PI * length * length * height;
    }
    
    public double surfaceArea() {
        return 2 * Math.PI * length * height + 2 * Math.PI * length * length;
    }
}

class Cuboid extends Shape {
    public Cuboid(double length, double breadth, double height) {
        super(length, breadth, height);
    }
    
    public double volume() {
        return length * breadth * height;
    }
    
    public double surfaceArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }
}
public class AS18Q1 {
    public static void main(String[] args) {
        Cube cube = new Cube(5);
        System.out.println("Cube volume: " + cube.volume());
        System.out.println("Cube surface area: " + cube.surfaceArea());

        Cylinder cylinder = new Cylinder(2, 10);
        System.out.println("Cylinder volume: " + cylinder.volume());
        System.out.println("Cylinder surface area: " + cylinder.surfaceArea());

        Cuboid cuboid = new Cuboid(3, 4, 5);
        System.out.println("Cuboid volume: " + cuboid.volume());
        System.out.println("Cuboid surface area: " + cuboid.surfaceArea());
    }
}
