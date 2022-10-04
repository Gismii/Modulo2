package Taxpayers;

public class TaxReport {
     private String name;

     private double rendaAnual;

      double tax;

    public TaxReport(String name, double rendaAnual) {
        this.name = name;
        this.rendaAnual = rendaAnual;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "TaxReport{" +
                "name='" + name + '\'' +
                ", rendaAnual=" + rendaAnual +
                ", tax=" + tax +
                '}';
    }

    public TaxReport() {
        super();
    }
}

