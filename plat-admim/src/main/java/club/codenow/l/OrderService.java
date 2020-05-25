package club.codenow.l;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2020/5/20 0020 下午 3:56
 * @Version:
 * @Description:
 */
@Service
public class OrderService {
    @Autowired
    OrderEvenPublisher orderEvenPublisher;
    public void submitOrder(){
        OrderInfo orderInfo=new OrderInfo();
        orderInfo.setOrderId(51456652L);
        orderInfo.setProductName("card");
        OrderEvent orderEvent=new OrderEvent(orderInfo);
        orderEvenPublisher.publishOrderEvent(orderEvent);
    }
}
