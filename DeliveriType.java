package Test.InternetShop;

public enum DeliveriType  {
    POST ("Доствка товара  новой  почтой 150 грн"),AUTO ("Доствка  курьером   на авто 300 грн") ;

    private String value ;

    DeliveriType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "DeliveriType{" +
                "value='" + value + '\'' +
                '}';
    }
}

