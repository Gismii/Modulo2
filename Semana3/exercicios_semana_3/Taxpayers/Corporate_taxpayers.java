package Taxpayers;

public class Corporate_taxpayers extends TaxReport{



    private double numberEmployees;


    double pad;

    public Corporate_taxpayers() {

    }

    public double getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(double numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    public Corporate_taxpayers(String name, double rendaAnual) {
        super(name, rendaAnual);
    }

    @Override
    public String toString() {
        return "Corporate_taxpayers{" +
                "numberEmployees=" + numberEmployees +
                ", pad=" + pad +
                "} " + super.toString();
    }

    public void calculoCt(){
        if(getRendaAnual()>0 && getNumberEmployees()<10){
            pad = 16.0/100;
            tax = getRendaAnual() + (pad * getRendaAnual());
        } else if (getRendaAnual()>0 && getNumberEmployees()>10) {
            pad = 14.0/100;
            tax = getRendaAnual() + (pad * getRendaAnual());

        }
    }
}
