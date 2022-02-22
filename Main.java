
public class Main {
    public static void main(String[] args) {

        ProductCollection list = new ProductCollection();
        Product p1 = new Product(11, "glasses");
        Product p2 = new Product(12, "pants");
        Product p3 = new Product(13, "sword");
        Product p4 = new Product(14, "book");

        list.addProduct(p1);
        list.addProduct(p2);
        list.addProduct(p3);
        list.addProduct(p4);

        Iterator iter = list.getIterator();
        while (iter.hasNext())
            System.out.println("next product is: "+ iter.next());
    }
}
