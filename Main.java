package Test.InternetShop;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
//Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//        Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
//        Создать класс Basket, содержащий массив купленных товаров.
//        Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
//        Вывести на консоль каталог продуктов.
//        Вывести на консоль покупки посетителей магазина.
         // создать нескольких юзеров
         // вывести на экран спикок покупок юзера
//        Создать доствку  продуктов
public class Main {

    public static void main(String[] args) {
        Phone ihone = new Phone("Ihone 14",3333,4.6);
        Nout mac = new Nout("mac",33,5.0);
        Banan banan = new Banan("banan",33,4);
        Milk milk = new Milk("milka",55,0.1,DeliveriType.AUTO);

        Tovar[] buyTovars = new Tovar[]{milk, ihone};
        Basket basket = new Basket(buyTovars);


        User user = new User("vadim","222", basket);
        Basket userBasket = user.getBasket();
        System.out.println("User buy: " + userBasket);

        Tovar [] tovarlist = {ihone,mac};
        Category elektronic = new Category("Elektronic",tovarlist);
        Category food = new Category("food", new Tovar[]{banan, milk});

        System.out.println("Category food: " +  Arrays.toString(food.getTovars()));
        System.out.println("Категория електроника "+Arrays.toString(tovarlist));

    }
}
