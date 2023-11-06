package Test.InternetShop;

public class Milk extends Tovar{

    private DeliveriType deliveriType ;

    public Milk(String name, int price, double rating, DeliveriType deliveriType) {
        super(name, price, rating);
        this.deliveriType = deliveriType;
    }
    @Override
    public String toString() {
        return "Milk{" +
                "deliveriType=" + deliveriType +
                '}';
    }
}



