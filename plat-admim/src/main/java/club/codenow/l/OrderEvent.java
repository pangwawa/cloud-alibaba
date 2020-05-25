package club.codenow.l;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2020/5/20 0020 下午 3:46
 * @Version:
 * @Description:
 */
public class OrderEvent extends ApplicationEvent {
    public OrderEvent(OrderInfo source) {
        super(source);
    }
}
