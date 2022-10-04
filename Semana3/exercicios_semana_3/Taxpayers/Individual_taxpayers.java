package Taxpayers;

public class Individual_taxpayers extends TaxReport {

    double pay;
    public Individual_taxpayers() {
        super();
    }

    private double MedicalExpenses = 0;

    @Override
    public String toString() {
        return "Individual_taxpayers{" +
                "MedicalExpenses=" + MedicalExpenses +
                "} " + super.toString();
    }

    public double getMedicalExpenses() {
        return MedicalExpenses;
    }

    public void setMedicalExpenses(double medicalExpenses) {
        MedicalExpenses = medicalExpenses;
    }

    public void calculoIt() {
        if (getRendaAnual() >= 20.000) {
            pay = 25.0 / 100.00;
            tax = getRendaAnual() + (pay * getRendaAnual()) - getMedicalExpenses() / 2;

        } else if (getRendaAnual() < 20.000) {
            pay = 15.0 / 100.00;
            tax = getRendaAnual() + (pay * getRendaAnual()) - getMedicalExpenses() / 2;

        }


    }


}


