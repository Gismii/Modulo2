package RealEstate;

// NÃO FOI SOLICITADO CRIAR A CLASSE MAIN!!

public class House {
    private String address;
    private double price;

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", price=" + price +
                '}';
    }

    public House(String address, double price) {
        this.address = address;
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

