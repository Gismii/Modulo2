package CalculatingArea;

public class Square extends CalculatingArea{
    @Override
    public Double CalculatinArea(double base, double height) {
        return null;
    }
    private double side;
    public Square(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public Double CalculatinArea(double side) {
        return Math.pow(side,2);
    }
}
