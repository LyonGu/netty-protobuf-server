package com.game.qs.protocol.initializer;

import com.game.qs.protocol.decoder.MessageProtoBufDecoder;
import com.game.qs.protocol.encoder.MessageProtoBufEncoder;
import com.game.qs.protocol.hanlder.ServerHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import io.netty.handler.timeout.IdleStateHandler;

/**
 * Created by zun.wei on 2019/6/21.
 */
public class ServerChannelInitializer extends ChannelInitializer<SocketChannel> {

    /*
    1）readerIdleTime：为读超时时间（即多长时间没有接受到客户端发送数据）
    2）writerIdleTime：为写超时时间（即多长时间没有向客户端发送数据）
    3）allIdleTime：所有类型的超时时间
     */

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline p = ch.pipeline();
        //5 秒 没有收到客户端发送消息就发送心跳包
        p.addLast(new IdleStateHandler(5, 0, 0));
        p.addLast(new ProtobufVarint32FrameDecoder());
        ch.pipeline().addLast(new MessageProtoBufDecoder());
        p.addLast(new ProtobufVarint32LengthFieldPrepender());
        ch.pipeline().addLast(new MessageProtoBufEncoder());
        p.addLast(new ServerHandler());
    }


}
