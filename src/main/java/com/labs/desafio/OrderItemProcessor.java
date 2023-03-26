package com.labs.desafio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class OrderItemProcessor implements ItemProcessor<Order, Order>{

	private static final Logger log = LoggerFactory.getLogger(OrderItemProcessor.class);
	
	@Override
	public Order process(final Order order)  throws Exception{ 
		
		final String userId = String.format("%010d", Integer.parseInt(order.getUserId()));
		final String name = order.getName().substring(0, 10);
		final String orderId = String.format("%010d", Integer.parseInt(order.getOrderId()));
		final String productId = String.format("%010d", Integer.parseInt(order.getProductId()));
		final double productPrice = order.getProductPrice();
		final int purchaseDate = order.getPurchaseDate();
		
		final Order transformedOrder = new Order(userId, name, orderId, productId, productPrice, purchaseDate);
		
		log.info("The order: " + order + " was normalized." );
		
		return transformedOrder;
	}
	
}
