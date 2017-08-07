package com.rs.test;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.junit.Test;

import com.rest.rs.Order;
import com.rest.rs.OrderRestService;

public class OrderRestServiceTest extends JerseyTest {

    @Override
    public Application configure() {
        enable(TestProperties.LOG_TRAFFIC);
        enable(TestProperties.DUMP_ENTITY);
        return new ResourceConfig(OrderRestService.class);
    }

    @Test
    public void testFetchAll() {	
    	Order order=new Order();
    	order.setBasePrice(100);
    	List<Integer> orderIdList=new ArrayList<Integer>();
    	orderIdList.add(1);
    	orderIdList.add(2);
    	orderIdList.add(3);
    	orderIdList.add(4);
    	orderIdList.add(5);
    	order.setOrderID(orderIdList);
    	order.setDiscount(10);
    	order.setDiscountEndDate("8-jan-2018");
    	order.setPromotionEndDate("8-jan-2018");
    	
    	List<Integer> promotionList=new ArrayList<Integer>();
    	orderIdList.add(10);
    	orderIdList.add(20);

    	order.setPromotion(orderIdList);
    	
        Response output = target("/orders")
                .request()
                .post(Entity.entity(order, MediaType.APPLICATION_JSON));

    /*    Order order1=output.readEntity(Order.class);
        System.out.println("Base Price :"+order1.getBasePrice());
        
        */
        

    }

    
    
}
