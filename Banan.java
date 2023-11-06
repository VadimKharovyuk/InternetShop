package Test.InternetShop;

public class Banan extends Tovar{

    public Banan(String name, int price, double rating) {
        super(name, price, rating);
    }

    @Override
    public String toString() {
        return "Banan";
    }
}
