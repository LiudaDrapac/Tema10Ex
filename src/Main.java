import figuri.Circle;
import figuri.Polygon;
import figuri.Square;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Polygon polygon = new Polygon();
        polygon.render();
        System.out.println(".....................................");

        Square square = new Square();
        square.render();
        System.out.println(".....................................");

        Circle circle = new Circle();
        circle.render();
        System.out.println(".....................................");

        Polygon polygon1 = new Square();
        polygon1.render();
        System.out.println(".....................................");

        Polygon polygon2 = new Circle();
        polygon2.render();



    }
}





