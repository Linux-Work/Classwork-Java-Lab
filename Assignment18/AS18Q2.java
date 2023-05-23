abstract class Fruit {
    protected String colour;
    protected String taste;

    public Fruit(String colour, String taste) {
        this.colour = colour;
        this.taste = taste;
    }

    public abstract void display();
}

class Apple extends Fruit {
    public Apple(String colour, String taste) {
        super(colour, taste);
    }

    @Override
    public void display() {
        System.out.println("Name: Apple\tColour: " + colour + "\tTaste: " + taste);
    }
}

class Banana extends Fruit {
    public Banana(String colour, String taste) {
        super(colour, taste);
    }

    @Override
    public void display() {
        System.out.println("Name: Banana\tColour: " + colour + "\tTaste: " + taste);
    }
}

class Orange extends Fruit {
    public Orange(String colour, String taste) {
        super(colour, taste);
    }

    @Override
    public void display() {
        System.out.println("Name: Orange\tColour: " + colour + "\tTaste: " + taste);
    }
}

class Strawberry extends Fruit {
    public Strawberry(String colour, String taste) {
        super(colour, taste);
    }

    @Override
    public void display() {
        System.out.println("Name: Strawberry\tColour: " + colour + "\tTaste: " + taste);
    }
}

public class AS18Q2 {
    public static void main(String[] args) {
        Fruit apple = new Apple("Red", "Sweet");
        Fruit banana = new Banana("Yellow", "Sweet");
        Fruit orange = new Orange("Orange", "Tangy");
        Fruit strawberry = new Strawberry("Red", "Tangy");

        apple.display();
        banana.display();
        orange.display();
        strawberry.display();
    }
}
