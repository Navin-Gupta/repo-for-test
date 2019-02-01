package com.training.unit_test_app;

public interface ProductService {
	String getProductDescription(int productId);
	Product getProduct(int productId);
	Product createProduct(Product product);
}
