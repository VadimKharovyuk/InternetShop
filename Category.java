package Test.InternetShop;
//Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
public   class Category  {
    private String name ;
    private Tovar []  tovars;

    public Category(String name, Tovar[] tovars) {
        this.name = name;
        this.tovars = tovars;
    }

    public String getName() {
        return name;
    }

    public Tovar[] getTovars() {
        return tovars;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}

