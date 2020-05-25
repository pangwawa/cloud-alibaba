package club.codenow.l;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2020/5/20 0020 下午 4:05
 * @Version:
 * @Description:
 */
@Component
public class OrderLister implements ApplicationListener<OrderEvent> {
    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
        OrderInfo orderInfo= (OrderInfo) orderEvent.getSource();
        System.out.println("lister called:"+orderInfo.toString());
    }
}
