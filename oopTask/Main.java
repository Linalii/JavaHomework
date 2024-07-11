package oopTask;

public class Main {
    public static void main(String[] args) {
        OzonStore ozon = new OzonStore(1,"Москва","ИП Озон");
        YandexStore yandex = new YandexStore(2, "Белая Калитва", "ООО Яндекс");

        Product smartphone = new Product(123,"Xiaomi", 400,20);
        Product watch = new Product(333,"SuperSmart",3000,50);
        Product keyboard = new Product(1234, "tututu", 4500, 20);
        Product keyboard2 = new Product(1234, "test", 4500, 2);
        Product [] product = new Product[]{watch,smartphone};
        Product [] product2 = new Product[]{keyboard};
        Product [] product3 = new Product[]{keyboard2};
        yandex.addProduct(product);

        /*yandex.addProduct(product3);
        yandex.showProducts();
        ozon.addProduct(product);*/
        System.out.println("до");
        ozon.addProduct(product3); // test
        ozon.addProduct(product2);// tututu
        ozon.showProducts();
        ozon.deleteProductById(1234);
        System.out.println("после");
        ozon.showProducts();

        


    }
}
