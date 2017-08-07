package com.rest.rs;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/orders")
public class OrderRestService {

	
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Order fetchAll(Order order) {
    	
        	Order order1=new Order();
        	order1.setBasePrice(100);
        	List<Integer> orderIdList=new ArrayList<Integer>();
        	orderIdList.add(1);
        	orderIdList.add(2);
        	orderIdList.add(3);
        	orderIdList.add(4);
        	orderIdList.add(5);
        	order1.setOrderID(orderIdList);
        	order1.setDiscount(10);
        	order1.setDiscountEndDate("8-jan-2018");
        	order1.setPromotionEndDate("8-jan-2018");
        	
        	List<Integer> promotionList=new ArrayList<Integer>();
        	promotionList.add(10);
        	promotionList.add(20);

        	order1.setPromotion(promotionList);

  

        List<Order> orders = new ArrayList<Order>();
        OrderCalculation cal=new OrderCalculation();
        List<OrderCalculationResults> list=cal.calculateOrder(order1);
        orders.add(order1);
        order1.setResults(list);
        return order1;
    }
    
        

}
