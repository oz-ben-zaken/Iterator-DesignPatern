import java.util.ArrayList;

public class ProductCollection implements Container {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        this.products.add(product);
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator();
    }

    private class ProductIterator implements Iterator<Product> {

        private int index;

        @Override
        public boolean hasNext() {
            return index < products.size();
        }

        @Override
        public Product next() {
            if (this.hasNext() == true)
                return products.get(index++);
            return null;
        }
    }

}
