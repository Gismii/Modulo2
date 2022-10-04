package CalculatingArea;

public class Circle extends CalculatingArea{

    private double raio;

    @Override
    public String toString() {
        return "Circle{" +
                "raio=" + raio +
                "} " + super.toString();
    }

    public Circle(double raio) {
        this.raio = raio*raio;
    }
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }


    @Override
    public Double CalculatinArea(double base, double height) {
        return raio;
    }

    @Override
    public Double CalculatinArea(double side) {
        return raio;
    }
}
