package p20190131;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;

public class Server {
	public static void main(String[] args) {
		//用于处理服务器端接收客户端连接
		EventLoopGroup pGroup = new NioEventLoopGroup();
		//进行网络通信（读写）
		EventLoopGroup cGroup = new NioEventLoopGroup();
		//辅助工具类，用于服务器通道的一系列配置
		try {
			ServerBootstrap bootstrap = new ServerBootstrap();
			//绑定两个线程组
			bootstrap.group(pGroup, cGroup)
				.channel(NioServerSocketChannel.class)//指定NIO的模式,注册服务端channel
				.handler(new LoggingHandler(LogLevel.INFO))
				.childHandler(new ChannelInitializer<SocketChannel>() {//配置具体的数据处理方式
					@Override
					protected void initChannel(SocketChannel socketChannel) throws Exception {
						//marshaliing的编解码操作,要传输对象，必须编解码
						socketChannel.pipeline().addLast(MarshallingCodeCFactory.buildMarshallingDecoder());
						socketChannel.pipeline().addLast(MarshallingCodeCFactory.buildMarshallingEncoder());
						//5s没有交互，就会关闭channel
						socketChannel.pipeline().addLast(new ReadTimeoutHandler(5));
						//服务端业务处理类
						socketChannel.pipeline().addLast(new ServerHandler());
					}
				})
				.option(ChannelOption.SO_BACKLOG, 1024);//设置TCP缓冲区
			ChannelFuture future = bootstrap.bind(8765).sync();
			future.channel().closeFuture().sync();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			cGroup.shutdownGracefully();
			pGroup.shutdownGracefully();
		}
	}
}
