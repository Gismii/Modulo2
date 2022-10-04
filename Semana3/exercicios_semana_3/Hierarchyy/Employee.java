package Hierarchyy;

public class Employee extends Person{
    @Override
    public String toString() {
        return "Employee{" +
                "payment=" + payment +
                "} " + super.toString();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getId() {
        return super.getId();
    }

    private double payment =2000;
    public Double calcularPayment(){
        return null;
    }
    public double getPayment() {
        return payment;
    }
    public void setPayment(double payment) {
        this.payment = payment;
    }
}
