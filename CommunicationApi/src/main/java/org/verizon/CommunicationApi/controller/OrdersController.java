package org.verizon.CommunicationApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.CommunicationApi.model.Orders;
import org.verizon.CommunicationApi.service.OrdersService;

@RestController
@RequestMapping("/api/Orders")
public class OrdersController {
private OrdersService Oservice;
	
	@Autowired
	public OrdersController(OrdersService oService) {
		this.Oservice=oService;
	}
	@RequestMapping("/allorders")
	public List<Orders> getAllOrders()
	{
		return Oservice.getAllOrders();
	}
	
	@PostMapping("/insert-order")
	public Orders createOrders(@RequestBody Orders cust) {
		return Oservice.createOrder(cust);
	}
}