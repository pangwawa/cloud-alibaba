package club.codenow.dubbo.provider.service.impl;

import club.codenow.dubbo.api.xmlprovider.XmlProviderApi;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/11/18 0018 下午 7:26
 * @Version:
 * @Description:
 */
@Service
public class XmlProviderApiImpl implements XmlProviderApi {

    @Override
    public String querySomeData() {
        System.out.println("XmlProviderApi querySomeData call");
        return "XmlProviderApi querySomeData call ";
    }
}
