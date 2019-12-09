package club.codenow.dubbo.provider.service.impl;

import club.codenow.dubbo.provider.service.ProviderService;
import org.apache.dubbo.config.annotation.Service;


/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/11/18 0018 下午 7:26
 * @Version:
 * @Description:
 */
@Service(version = "1.0.0")
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String getTestString() {
        System.out.println("dubbo provider 的getTestString()方法调用了 ");
        return "dubbo provider service  Get Test String ";
    }
}
