package cn.itcast.service;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.dao.OrdersDao;

@Transactional
public class OrdersService {

	private OrdersDao ordersDao;

	public void setOrdersDao(OrdersDao ordersDao) {
		this.ordersDao = ordersDao;
	}
	
	public void accountMoney() {
		ordersDao.lessMoney();
		
		ordersDao.moreMoney();
	}
}
