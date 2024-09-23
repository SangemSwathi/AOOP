package com.ecommerce;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    public List<Product> filterByCategory(List<Product> products, String category) {
        return products.stream()
                .filter(product -> product.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public List<Product> filterByPriceRange(List<Product> products, double minPrice, double maxPrice) {
        return products.stream()
                .filter(product -> product.getPrice() >= minPrice && product.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public List<Product> filterByRatingAbove(List<Product> products, double minRating) {
        return products.stream()
                .filter(product -> product.getRating() >= minRating)
                .collect(Collectors.toList());
    }
}