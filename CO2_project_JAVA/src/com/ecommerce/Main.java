package com.ecommerce;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ProductService productService = new ProductService();

        // Sample product list
        List<Product> productList = Arrays.asList(
                new Product(1, "Laptop", "Electronics", 1200.00, 4.5),
                new Product(2, "Headphones", "Electronics", 100.00, 4.0),
                new Product(3, "Coffee Maker", "Home Appliances", 75.50, 3.8),
                new Product(4, "Blender", "Home Appliances", 50.00, 4.1),
                new Product(5, "Smartphone", "Electronics", 800.00, 4.7)
        );

        // Filter products by category
        System.out.println("Electronics Products:");
        productService.filterByCategory(productList, "Electronics").forEach(System.out::println);

        // Filter products by price range
        System.out.println("\nProducts between $50 and $800:");
        productService.filterByPriceRange(productList, 50, 800).forEach(System.out::println);

        // Filter products with rating above 4.0
        System.out.println("\nProducts with rating above 4.0:");
        productService.filterByRatingAbove(productList, 4.0).forEach(System.out::println);
    }
}