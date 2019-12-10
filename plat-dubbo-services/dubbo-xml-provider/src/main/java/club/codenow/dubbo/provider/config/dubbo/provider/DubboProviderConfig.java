package club.codenow.dubbo.provider.config.dubbo.provider;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/12/10 0010 下午 7:55
 * @Version:
 * @Description:
 */
@Configuration
@ImportResource(locations = {"classpath:spring-dubbo-provider.xml"})
public class DubboProviderConfig {
   /* ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-provider.xml");*/
}
