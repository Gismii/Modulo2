package Hierarchyy;

public class Manager extends Employee {

    @Override
    public double getPayment() {
        double addValue = super.getPayment() * 0.8;
        return (super.getPayment() + addValue) * 4;
    }

}
