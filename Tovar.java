package Test.InternetShop;
////Создать класс Товар, имеющий переменные имя, цена, рейтинг.

public class Tovar {
    private  String name;
    private int  price;
    private  double rating ;

    public Tovar(String name, int price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
