package club.codenow.services.rocketmq.mq.publish.callback;

import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/11/12 0012 下午 4:38
 * @Version:
 * @Description:
 */
public class MyCallback {
    public static SendCallback  payMsgCallBack(){
        return new SendCallback() {
            @Override
            public void onSuccess(SendResult sendResult) {
                System.out.println("消息发送成功");
            }

            @Override
            public void onException(Throwable throwable) {
                System.out.println("消息发送失败");
            }
        };
    }
}
