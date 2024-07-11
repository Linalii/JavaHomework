package oopTask;

abstract public class Store {
    private int id;
    private String address;
    private String ipOwnerName;
    private Product [] product;


    public Product[] getProduct() {
        return product;
    }

    public Store(int id, String address, String ipOwnerName) {
        this.id = id;
        this.address = address;
        this.ipOwnerName = ipOwnerName;
        this.product = new Product[100];
    }
    public void addProduct(Product [] product){
        int index;
        if(canAdd(this.product)){
            index = findFirstNullIndex(this.product);
            for(int i = 0; i < product.length; i++){
                this.product[index] = product[i];
                index++;
            }
        }else{
            expandArray(product.length);
            index = findFirstNullIndex(this.product);
            for(int i = 0; i < product.length; i++){
                this.product[index] = product[i];
                index++;
            }

        }
    }
    public void showProducts(){
        for (Product productToShow: this.product
             ) {
            if (productToShow!= null){
                System.out.println(productToShow.getName());
            }
        }
    }
    public void showMinProducts(){
        for (Product productToShow: this.product
        ) {
            if (productToShow!= null){
                if(productToShow.getCount() < 3){
                    System.out.println(productToShow.getName());
                }
            }
        }
    }
    public void deleteProductById( int id){
        int indexToDelete;
        indexToDelete = findIndexById(id);
        //Удаляет элемент по индексу и отправляет null в конец
        if(indexToDelete > -1){
            for(int i = 0; i < this.product.length; i++){
                if(i == indexToDelete){
                    this.product[i] = null;
                    if( i < this.product.length-1){
                        for (int j = i; j < this.product.length-1; j++){
                            this.product[j] = this.product[j+1];
                            this.product[j+1] = null;
                        }
                    }
                }


            }
        } else {
            System.out.println("Такой id не найден");
        }


    }
    public int findFirstNullIndex(Product [] product){ //возвращает -1 когда нет null
        int nullIndex = -1;
        Product [] temp;
        int j = 0;
        while (j < this.product.length){
            if(this.product[j] == null){    //проверяем есть ли в массиве null
                nullIndex = j;// находит где начинаются null
                j = this.product.length;
            }
            j++;
        }
        return nullIndex;

    }

    //добавляем в массив пустые элементы равные длине нового массива
    public void expandArray(int numberAdd){
        Product [] temp;
        temp = this.product;
        this.product = new Product[temp.length + numberAdd];
        for (int i = 0; i < temp.length; i++){ //добавляем элементы старого массива
            this.product[i] = temp[i];
        }
    }
    public boolean canAdd(Product [] product){
        int firstNullIndex = findFirstNullIndex(this.product);
        // возвращаем true если достаточно места, чтобы добавить новый массив
        return firstNullIndex != -1 && this.product.length - firstNullIndex >= product.length;

    }
    public int findIndexById(int id){
        int indexToDelete = -1;
        for (int i = 0; i < this.product.length; i++){
            if(this.product[i] != null){
                if(this.product[i].getId() == id){
                    indexToDelete = i;
                }
            }
        }
        return indexToDelete;
    }
}
