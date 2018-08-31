package com.itcast.a_response.c_download;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import sun.nio.ch.IOUtil;

/**
 * Servlet implementation class DownloadServlet
 */
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取下载文件的文件名
		String filename = request.getParameter("name");
		ServletContext context = this.getServletContext();
		//设置文件的文件类型
		String mimeType = context.getMimeType(filename);
		response.setContentType(mimeType);
		//设置下载的头信息
		response.setHeader("content-disposition","attachment;filename="+filename);
		//对考流
		//获取输入流
		InputStream is = context.getResourceAsStream("/download/"+filename);
		//获取输出流
		ServletOutputStream os = response.getOutputStream();
		
		/**
		int len=-1;
		byte[] b = new byte[1024];
		while((len=is.read(b))!=-1) {
			os.write(b, 0, len);
		}
		**/
		IOUtils.copy(is, os);
		os.close();
		is.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
