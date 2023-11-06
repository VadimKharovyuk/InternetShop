package Test.InternetShop;
// Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.

public class User {
    private  String login ;
    private  String pass ;
    private  Basket basket ;

    public User(String login, String pass, Basket basket) {
        this.login = login;
        this.pass = pass;
        this.basket = basket;
    }

    public Basket getBasket() {
        return basket;
    }
}
