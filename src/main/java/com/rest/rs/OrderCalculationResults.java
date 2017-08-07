package com.rest.rs;

import java.util.List;

public class OrderCalculationResults {
private int orderID;
private double finalItemPrise;
private List<Integer> promotion;
private double totalPrice;
public int getOrderID() {
	return orderID;
}
public void setOrderID(int orderID) {
	this.orderID = orderID;
}
public double getFinalItemPrise() {
	return finalItemPrise;
}
public void setFinalItemPrise(double finalItemPrise) {
	this.finalItemPrise = finalItemPrise;
}
public List<Integer> getPromotion() {
	return promotion;
}
public void setPromotion(List<Integer> promotion) {
	this.promotion = promotion;
}
public double getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}
}
