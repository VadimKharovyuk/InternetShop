package Test.InternetShop;

public class Phone extends Tovar{
    public Phone(String name, int price, double rating) {
        super(name, price, rating);
    }

    @Override
    public String toString() {
        return "Phone{}" + super.toString();
    }
}
