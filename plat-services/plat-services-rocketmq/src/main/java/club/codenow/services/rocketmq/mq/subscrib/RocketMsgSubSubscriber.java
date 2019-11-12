package club.codenow.services.rocketmq.mq.subscrib;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;


/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/11/9 0009 下午 5:05
 * @Version:
 * @Description: RocketMQ消息订阅，通过 @StreamListener 注解实现 也可通过
 *      消息消费者，可与生产者分离
 *  *   这里定义的messageMode是集群消费，如果是同一消费组则会组内消费者均衡消费；
 *  *   如果是不同消费组，则会起到广播消费的效果
 */
@Service
@Slf4j
@RocketMQMessageListener(topic = "mytopic1112", consumerGroup = "dofun-pay")
public class RocketMsgSubSubscriber implements RocketMQListener<MessageExt> {

    @Override
    public void onMessage(MessageExt s) {
        System.out.println("消费的消息内容:"+s );
    }
}
