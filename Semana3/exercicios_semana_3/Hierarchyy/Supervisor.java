package Hierarchyy;

public class Supervisor extends Employee{

    public void inspect(){
    }
    public void authenticate(String password){
    }

    @Override
    public double getPayment() {
        return super.getPayment() * 1.5;
    }
}
