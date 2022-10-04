package RealEstate;

// NÃO FOI SOLICITADO CRIAR A CLASSE MAIN!!
public class OldHouse extends House{
    public OldHouse(String address, double preco) {
        super(address, preco);
    }
    double discountValue;
    double finalyValue= getPrice()-getDiscountValue();

    public OldHouse(String address, double price, double discountValue, double finalyValue) {
        super(address, price);
        this.discountValue = discountValue;
        this.finalyValue = finalyValue;
    }

    @Override
    public String toString() {
        return "OldHouse{" +
                "discountValue=" + discountValue +
                ", finalyValue=" + finalyValue +
                "} " + super.toString();
    }

    public double getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(double discountValue) {
        this.discountValue = discountValue;
    }

    public double getFinalyValue() {
        return finalyValue;
    }

    public void setFinalyValue(double finalyValue) {
        this.finalyValue = finalyValue;
    }


}

   // NÃO FOI SOLICITADO CRIAR A CLASSE MAIN!!