package com.training.unit_test_app;

public class Product {
	private int productId;
	private String productName;
	private String prodDesc;
	
	public Product() {
		
	}
	
	public Product(int productId, String productName, String prodDesc) {
		
		this.productId = productId;
		this.productName = productName;
		this.prodDesc = prodDesc;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	
	
}
