package oopTask;

public class YandexStore extends Store{
    public YandexStore(int id, String address, String ipOwnerName) {
        super(id, address, ipOwnerName);
    }

    @Override
    public void addProduct(Product[] product) {
        product = filterByPrice( 200000, product);
        super.addProduct(product);
    }
    public Product [] filterByPrice(int price, Product [] inputProduct){
        Product [] result = new Product[inputProduct.length];
        int index = 0;
        for(int i = 0; i < inputProduct.length; i++){
            if(inputProduct[i].getPrice() <= price){
                result[index] = inputProduct[i];
                index++;
            }
        }
        return result;
    }
}
