package club.codenow.l;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Service;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2020/5/20 0020 下午 3:47
 * @Version:
 * @Description:
 */
@Service
public class OrderEvenPublisher implements ApplicationContextAware {
    private  ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }
    public void publishOrderEvent(ApplicationEvent event){
        System.out.println("event published");
        applicationContext.publishEvent(event);
    }
}
