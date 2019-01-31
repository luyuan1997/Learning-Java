package p20190131;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.ReferenceCountUtil;

public class ClientHandler extends ChannelHandlerAdapter {
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        try {
            Response response = (Response) msg;
            System.out.println("Client : " + response.getId() + ", " + response.getName() + ", " + response.getResponseMessage());
        } finally {
            ReferenceCountUtil.release(msg);
        }
    }
 
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}
