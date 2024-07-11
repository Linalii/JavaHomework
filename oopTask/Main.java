package oopTask;

public class Main {
    public static void main(String[] args) {
        OzonStore ozon = new OzonStore(1,"Москва","ИП Озон");
        YandexStore yandex = new YandexStore(2, "Белая Калитва", "ООО Яндекс");

        Product smartphone = new Product(123,"Xiaomi", 400000,2);
        Product watch = new Product(333,"SuperSmart",3000,1);
        Product keyboard = new Product(1232, "tututu", 4500, 20);
        Product keyboard2 = new Product(1234, "test", 4500, 2);
        Product [] product = new Product[]{watch,smartphone};
        Product [] product2 = new Product[]{keyboard};
        Product [] product3 = new Product[]{keyboard2};

        ozon.addProduct(product3); // добавили test
        ozon.addProduct(product2);// добавили tututu
        System.out.println("до");
        ozon.showProducts();
        System.out.println("Продукты к кол-вом до 10-ти");
        ozon.showMinProducts();
        ozon.deleteProductById(1234); //удалили test
        System.out.println("после");
        ozon.showProducts();

        for(int i = 0; i < 10; i++){
            yandex.addProduct(product); // добавляем SuperSmart и Xiaomi
        }
        System.out.println("Продукты яндекса");
        yandex.showProducts(); //показываем без Xiaomi - ок

        yandex.addProduct(product3);// добавили test
        System.out.println("до");
        yandex.showProducts();
        yandex.deleteProductById(1234);//удалили test
        System.out.println("после");

        


    }
}
