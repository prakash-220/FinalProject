package org.verizon.CommunicationApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.CommunicationApi.model.Orders;
import org.verizon.CommunicationApi.repo.OrdersRepository;


@Service
public class OrdersService {
	private final OrdersRepository ordersrepo;
	@Autowired
	public OrdersService(OrdersRepository ordersrepo) {
		this.ordersrepo=ordersrepo;
	}
	public List<Orders> getAllOrders()
	{
		return ordersrepo.findAll();
	}
	
	public Orders createOrder(Orders order)
	{
		return ordersrepo.save(order);
	}
}
