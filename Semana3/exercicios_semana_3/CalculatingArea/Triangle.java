package CalculatingArea;

public class Triangle extends CalculatingArea {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;

    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public Double CalculatinArea(double base,double height) {
        return base * (height/2);
    }

    @Override
    public Double CalculatinArea(double side) {
        return null;
    }
}
