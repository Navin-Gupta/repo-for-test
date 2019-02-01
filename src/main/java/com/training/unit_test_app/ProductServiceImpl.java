package com.training.unit_test_app;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {

	private List<Product> products;
	
	public ProductServiceImpl() {
		this.products=new ArrayList<Product>() ;
		this.products.add(new Product(1,"First","FDescription"));
		this.products.add(new Product(2,"Second","SDescription"));
		this.products.add(new Product(3,"Third","TDescription"));
		this.products.add(new Product(4,"Fourth","FrDescription"));
	}
	
	public String getProductDescription(int productId) {
		// TODO Auto-generated method stub
		Product product= this.products.get(productId-1);
		if(product==null)
			return null;
		else
			return product.getProdDesc();
	}

	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		Product product= this.products.get(productId-1);
		if(product==null)
			return null;
		else
			return product;
	}

	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		if(product.getProductId() < 1 || product.getProductId() <= this.products.size())
			return null;
		this.products.add(product);
		return product;
	}

}
