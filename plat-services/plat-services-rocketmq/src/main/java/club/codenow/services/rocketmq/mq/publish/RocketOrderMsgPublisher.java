package club.codenow.services.rocketmq.mq.publish;

import club.codenow.services.rocketmq.mq.config.RocketMQConfigParams;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/11/9 0009 下午 5:04
 * @Version:
 * @Description: RocketMQ  顺序消息发布
 *
 *                使用 官方API方式实现（除此也可使用MessageChannel）
 */
@Slf4j
public class RocketOrderMsgPublisher{
    //发送可靠异步消息
    public void publish(String namesrvAddr,String topic,String tag,String messageContent) throws MQClientException {
        //创建带有Group Name的MQ生产者对象
        DefaultMQProducer producer=new DefaultMQProducer(RocketMQConfigParams.ROCKETMQ_GROUP_NAME);
        //设置MQ服务器
        producer.setNamesrvAddr(namesrvAddr);
        //运行实例对象
        producer.start();
        //指定所发送消息的Tag
        Message message=new Message(topic,tag,messageContent.getBytes());
        try {
            producer.send(message, new SendCallback() {
                @Override
                public void onSuccess(SendResult sendResult) {
                    //成功的处理逻辑
                }
                @Override
                public void onException(Throwable e) {
                    log.error("消息发布失败");
                    //失败的处理逻辑

                    //可考虑定时重发，RocketMQ自带定时发消息功能
                    e.printStackTrace();
                }
            });
        } catch (RemotingException e) {
            log.error("RocketMQ服务器连接失败");
            e.printStackTrace();
        } catch (InterruptedException e) {
            log.error("RocketMQ服务器中断连接");
            e.printStackTrace();
        }
    }

}
