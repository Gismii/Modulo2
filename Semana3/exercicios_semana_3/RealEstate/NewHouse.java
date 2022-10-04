package RealEstate;

public class NewHouse extends House {


    public NewHouse(String address, double price) {
        super(address, price);
    }

    double addPrice;
    double discount;


    public NewHouse(String address, double price, double addPrice) {
        super(address, price);
        this.addPrice = addPrice;
    }

    public double getAddPrice() {
        return addPrice;
    }

    public void setAddPrice(double addPrice) {
        this.addPrice = addPrice;
    }

    public void enterSalesValue(){

        if (getAddPrice()>0){
            setPrice(getAddPrice());
        }

    }


}
