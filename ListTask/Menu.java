package Task1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Menu {
    private final String [] options = new String []{"1.Добавить товар","2.Удалить товар","3.Просмотреть список товаров","4.Выйти из программы"};
    Scanner sc = new Scanner(System.in);
    ProductList plist = new ProductList();

    public void start(){
        String input = "";
        while (!input.equals("4")){
            System.out.println("Выбери номер опции:");
            for(String str:options){
                System.out.println(str);
            }
            input = sc.nextLine();
            if(input.equals("1")){
                addProduct();
            }
            else if(input.equals("2")){
                deleteProduct();
            }
            else if(input.equals("3")){
                plist.showProductList();
            }
            else if(!input.equals("4")){
                System.out.println("Нужно выбрать 1, 2, 3 или 4");
            }
        }
    }
    public void addProduct(){
        System.out.println("Введи название товара:");
        String product = sc.nextLine();
        plist.addNewProduct(new Product(product));
    }
    public void deleteProduct(){
        System.out.println("Какой продукт удалить?");
        String product = sc.nextLine();
        boolean result = plist.deleteProductList(new Product(product));
        if (result){
            System.out.println("Удалили успешно");
        }
        else {
            System.out.println("Не нашли продукта "+product+" в списке");
        }

    }
}
