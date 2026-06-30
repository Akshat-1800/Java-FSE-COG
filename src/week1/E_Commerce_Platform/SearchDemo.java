package week1.E_Commerce_Platform;

class Product {

    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class SearchDemo {

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {

        for (Product product : products) {

            if (product.productId == targetId) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int targetId) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            }

            if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Headphones", "Accessories"),
                new Product(104, "Keyboard", "Accessories"),
                new Product(105, "Mouse", "Accessories")
        };

        int targetId = 104;

        // Linear Search
        System.out.println("Linear Search");

        Product result1 = linearSearch(products, targetId);

        if (result1 != null) {
            System.out.println("Product Found");
            System.out.println("ID: " + result1.productId);
            System.out.println("Name: " + result1.productName);
            System.out.println("Category: " + result1.category);
        } else {
            System.out.println("Product Not Found");
        }

        // Binary Search
        System.out.println("\nBinary Search ");

        Product result2 = binarySearch(products, targetId);

        if (result2 != null) {
            System.out.println("Product Found");
            System.out.println("ID: " + result2.productId);
            System.out.println("Name: " + result2.productName);
            System.out.println("Category: " + result2.category);
        } else {
            System.out.println("Product Not Found");
        }
    }
}
