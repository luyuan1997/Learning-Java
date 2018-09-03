package com.itcast.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.itcast.dao.AccountDao;
import com.itcast.dao.AccountDao4DB;
import com.itcast.dao.AccountDao4tl;
import com.itcast.utils.DataSourceUtils;
import com.itcast.utils.JdbcUtils;

public class AccountService4DB {
	/**
	 *转账操作
	 * @param fromUser 转出方
	 * @param toUser 转入方
	 * @param moneyr 金额
	 * @throws Exception 
	 * @throws Exception
	 */
	public void account(String fromUser, String toUser, String money) throws Exception{
		AccountDao4DB dao = new AccountDao4DB();
		
		try {
			//开启事务
			DataSourceUtils.startTransaction();
			
			//转出,注意参数中增加conn是为了传参
			dao.accountOut(fromUser,money);
			
			//异常出现
			//int i = 1/0;
			
			//转入 
			dao.accountIn(toUser,money);
			//事务提交
			DataSourceUtils.commitAndClose();
			
		} catch (SQLException e) {
			e.printStackTrace();
			//事务回滚
			DataSourceUtils.rollbackAndClose();
			throw e;
		}
		
	}

}
