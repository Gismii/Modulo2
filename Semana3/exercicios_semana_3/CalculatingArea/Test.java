package CalculatingArea;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(20.0,25.0);
        Square square = new Square(15.0);
        Diamond diamond = new Diamond(25.0,30.0);
        Circle circle = new Circle( 25);
        System.out.println("TRIANGLE: "+triangle.CalculatinArea(triangle.getBase(), triangle.getHeight()));
        System.out.println("SQUARE: "+square.CalculatinArea(square.getSide()));
        System.out.println("DIAMOND: "+diamond.CalculatinArea(diamond.getBiggerDiagonal(), diamond.getMiniDiagonal()));
        System.out.println("CIRCLE: "+circle.CalculatinArea(circle.getRaio()));
    }
}
