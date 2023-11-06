package Test.InternetShop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Создать класс Basket, содержащий массив купленных товаров.
public class Basket {
    private  Tovar[]  bayTovars ;

    public Basket(Tovar[] bayTovars) {
        this.bayTovars = bayTovars;
    }
    @Override
    public String toString() {
        return "Basket{" +
                "bayTovars=" + Arrays.toString(bayTovars) +
                '}';
    }
}


