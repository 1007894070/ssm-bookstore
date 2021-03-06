package bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import bookstore.mapper.OrdersMapperCustom;
import bookstore.po.OrderCustom;
import bookstore.po.Orderitem;
import bookstore.po.Orders;

public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrdersMapperCustom orderMapperCustom;
	public List<Orders> findByUid(String uid) throws Exception {
		
		return orderMapperCustom.findByUid(uid);
	}
	public List<Orderitem> findOrderItemByOid(String oid) throws Exception {
		
		return orderMapperCustom.findOrderItemByOid(oid);
	}
	public List<OrderCustom> findOrderCustom(String oid) throws Exception {
		
		return orderMapperCustom.findOrderCustom(oid);
	}
	
}
