package p20190130;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpResponseDecoder;

public class HttpServer {
	private int port;
	public HttpServer(int port) {
		this.port = port;
	}
	private void start() throws InterruptedException {
		ServerBootstrap b = new ServerBootstrap();
		NioEventLoopGroup group = new NioEventLoopGroup();
		b.group(group).channel(NioServerSocketChannel.class)
		.childHandler(new ChannelInitializer<SocketChannel>() {
			@Override
			protected void initChannel(SocketChannel ch) throws Exception {
				System.out.println("initChannel ch:" + ch);
				ch.pipeline()
				.addLast("decoder", new HttpRequestDecoder())
				.addLast("encoder", new HttpResponseDecoder())
				.addLast("aggregator", new HttpObjectAggregator(512 * 1024))
				.addLast("handler", new HttpHandler());
			}
		}).option(ChannelOption.SO_BACKLOG, 128)
		.childOption(ChannelOption.SO_KEEPALIVE, Boolean.TRUE);
		
		b.bind(port).sync();
	}
}
