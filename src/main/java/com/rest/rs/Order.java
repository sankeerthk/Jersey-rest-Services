package com.rest.rs;

import java.util.Date;
import java.util.List;


public class Order {
private List<Integer> orderID;
private Date asOf;
private double basePrice;
private double discount;
private String discountStartDate;
private String discountEndDate;
private String promotionStartDate;
private String promotionEndDate;
private List<Integer> promotion;

List<OrderCalculationResults> results;

public List<OrderCalculationResults> getResults() {
	return results;
}

public void setResults(List<OrderCalculationResults> results) {
	this.results = results;
}

public Order(){
	
}

public List<Integer> getOrderID() {
	return orderID;
}
public void setOrderID(List<Integer> orderID) {
	this.orderID = orderID;
}
public Date getAsOf() {
	return asOf;
}
public void setAsOf(Date asOf) {
	this.asOf = asOf;
}
public double getBasePrice() {
	return basePrice;
}
public void setBasePrice(double basePrice) {
	this.basePrice = basePrice;
}
public double getDiscount() {
	return discount;
}
public void setDiscount(double discount) {
	this.discount = discount;
}
public List<Integer> getPromotion() {
	return promotion;
}
public void setPromotion(List<Integer> promotion) {
	this.promotion = promotion;
}
public String getDiscountStartDate() {
	return discountStartDate;
}
public void setDiscountStartDate(String discountStartDate) {
	this.discountStartDate = discountStartDate;
}
public String getDiscountEndDate() {
	return discountEndDate;
}
public void setDiscountEndDate(String discountEndDate) {
	this.discountEndDate = discountEndDate;
}
public String getPromotionStartDate() {
	return promotionStartDate;
}
public void setPromotionStartDate(String promotionStartDate) {
	this.promotionStartDate = promotionStartDate;
}
public String getPromotionEndDate() {
	return promotionEndDate;
}
public void setPromotionEndDate(String promotionEndDate) {
	this.promotionEndDate = promotionEndDate;
}


}


