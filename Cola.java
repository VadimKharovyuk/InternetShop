package Test.InternetShop;

public class Cola extends Tovar{

    private DeliveriType deliveriType ;

    public Cola(String name, int price, double rating, DeliveriType deliveriType) {
        super(name, price, rating);
        this.deliveriType = deliveriType;
    }

    @Override
    public String toString() {
        return "Cola{" +
                "deliveriType=" + deliveriType +
                '}';
    }
}
