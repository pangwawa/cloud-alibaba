package club.codenow.services.rocketmq.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static club.codenow.services.rocketmq.mq.publish.callback.MyCallback.payMsgCallBack;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/11/11 0011 下午 5:30
 * @Version:
 * @Description:
 */
@RestController
@Slf4j
public class Test {
    @Autowired
    RocketMQTemplate rocketMQTemplate;
    @GetMapping(value = "/sendRocket")
    public String SendMsg(){
        //String namesrvAddr,String topic,String tag,String messageContent
        try {
            /*publisher.publish(NAMESRV_ADDR,TAG_OF_PAY_SERVICE,TAG_OF_PAY_SERVICE,"this is my msg!01");*/
           /* rocketMQTemplate.asyncSend();
            rocketMQTemplate.syncSend();
            rocketMQTemplate.asyncSendOrderly();
            rocketMQTemplate.syncSendOrderly();
            rocketMQTemplate.sendMessageInTransaction();
            rocketMQTemplate.sendOneWay();
            rocketMQTemplate.sendOneWayOrderly();*/
           String topic="mytopic1112";
           String msgContext="this  is msg content";
           String tag="tag-of-mytopic1112";
           long timeout=300;
            Message message=new Message(topic,msgContext.getBytes());
            for (int i=0;i<10000;i++){
                rocketMQTemplate.asyncSend(tag,message,payMsgCallBack(),timeout);
            }
        } catch (Exception e) {
            log.error("消息发布失败");
            e.printStackTrace();
        }
        return "ok";
    }
}
