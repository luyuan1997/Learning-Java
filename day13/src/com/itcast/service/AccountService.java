package com.itcast.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.itcast.dao.AccountDao;
import com.itcast.utils.JdbcUtils;

public class AccountService {
	/**
	 *转账操作
	 * @param fromUser 转出方
	 * @param toUser 转入方
	 * @param moneyr 金额
	 * @throws Exception 
	 * @throws Exception
	 */
	public void account(String fromUser, String toUser, String money) throws Exception{
		AccountDao dao = new AccountDao();
		
		Connection conn=null;
		try {
			//开启事务
			conn = JdbcUtils.getConnection();
			conn.setAutoCommit(false);
			//转出,注意参数中增加conn是为了传参
			dao.accountOut(conn,fromUser,money);
			
			//异常出现
			int i = 1/0;
			
			//转入 
			dao.accountIn(conn,toUser,money);
			//事务提交
			conn.commit();
			//释放连接
			JdbcUtils.closeConn(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//事务回滚
			conn.rollback();
			//释放连接
			JdbcUtils.closeConn(conn);
			
			throw e;
		}
		
	}

}
