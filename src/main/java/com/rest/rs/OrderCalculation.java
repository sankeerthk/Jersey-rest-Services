package com.rest.rs;

import java.util.ArrayList;
import java.util.List;

public class OrderCalculation {
	public List<OrderCalculationResults> calculateOrder(Order order){	
		List<OrderCalculationResults> listResults=new ArrayList<OrderCalculationResults>();
		try{
		if(order!=null){	
			List<Integer> orderID=order.getOrderID();
			if(orderID!=null && orderID.size()>0){
			for(Integer orderVal:orderID){
				OrderCalculationResults results=new  OrderCalculationResults();
				double totalAmount=1,finalPrice=1;
				int promotionCount=1;
				if(order.getDiscountEndDate().equals("8-jan-2018")){
					totalAmount=order.getBasePrice()*order.getDiscount();
				}
				
				if(order.getPromotionEndDate().equals("8-jan-2018")){
					for(int j=0;j<order.getPromotion().size();j++){
						finalPrice=finalPrice+order.getPromotion().get(j);
						promotionCount++;
					}
					
				}
				
				results.setOrderID(orderVal);
				results.setTotalPrice(totalAmount);
				results.setFinalItemPrise(finalPrice);
				results.setPromotion(order.getPromotion());
				listResults.add(results);
			}
			
			}
		}	
		}
		catch(Exception e){
			System.out.println("Exception in OrderCalculation"+e.getMessage());
		}
		return listResults;
	}
}
