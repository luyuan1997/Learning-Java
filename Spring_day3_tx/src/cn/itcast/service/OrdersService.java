package cn.itcast.service;

import cn.itcast.dao.OrdersDao;

public class OrdersService {

	private OrdersDao ordersDao;

	public void setOrdersDao(OrdersDao ordersDao) {
		this.ordersDao = ordersDao;
	}
}
