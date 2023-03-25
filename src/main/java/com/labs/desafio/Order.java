package com.labs.desafio;

public class Order {
	private String userId;
	private String name;
	private String orderId;
	private String productId;
	private double productPrice;
	private int purchaseDate;
	
	public Order() {
		super();
	}

	public Order(String userId, String name, String orderId, String productId, double productPrice, int purchaseDate) {
		super();
		this.userId = userId;
		this.name = name;
		this.orderId = orderId;
		this.productId = productId;
		this.productPrice = productPrice;
		this.purchaseDate = purchaseDate;
	}

	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getOrderId() {
		return orderId;
	}
	
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public double getProductPrice() {
		return productPrice;
	}
	
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public int getPurchaseDate() {
		return purchaseDate;
	}
	
	public void setPurchaseDate(int purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Override
	public String toString() {
		return "Order [userId=" + userId + ", name=" + name + ", orderId=" + orderId + ", productId=" + productId
				+ ", productPrice=" + productPrice + ", purchaseDate=" + purchaseDate + "]";
	}
		
}
