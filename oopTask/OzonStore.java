package oopTask;

public class OzonStore extends Store{
    public OzonStore(int id, String address, String ipOwnerName) {
        super(id, address, ipOwnerName);
        Product[] product = new Product[100];
    }

    @Override
    public void showMinProducts() {
        for (Product productToShow: getProduct()
        ) {
            if (productToShow!= null){
                if(productToShow.getCount() < 10){
                    System.out.println(productToShow.getName());
                }
            }
        }
    }
}
