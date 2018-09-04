package com.itcast.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.itcast.domain.Product;
import com.itcast.service.ProductService;
import com.itcast.utils.UUIDUtils;

/**
 * 增加商品
 */
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码,因为接受请求中含有中文
		request.setCharacterEncoding("utf-8");
		
		//令牌机制
		//获取session中令牌和提交过来的令牌
		String r_token = request.getParameter("r_token");
		String s_token = (String) request.getSession().getAttribute("s_token");
		//移除session中的令牌
		request.getSession().removeAttribute("s_token");
		//比较两个令牌
		if(s_token == null || !s_token.equals(r_token)) {
			//已经提交过了生成错误提示信息放入到request域中，传给msg.jsp
			request.setAttribute("msg", "商品已经保存");
			request.getRequestDispatcher("/msg.jsp").forward(request, response);
			return;
		}
		
		//1.封装数据
		Product p = new Product();
		try {
			BeanUtils.populate(p, request.getParameterMap());
			//1.1 设置pid
			p.setPid(UUIDUtils.getId());
			//1.2设置时间
			p.setPdate(new Date());
			//2.调用service完成添加
			new ProductService().addProduct(p);
			//3.页面跳转
			//请求转发
			request.getRequestDispatcher("/findAll").forward(request, response);
		}catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", "添加商品失败");
			request.getRequestDispatcher("/msg.jsp").forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
