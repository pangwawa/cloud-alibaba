package club.codenow.dubbo.customer.controller;


import club.codenow.dubbo.api.provider.ProviderService;
import club.codenow.dubbo.api.xmlprovider.XmlProviderApi;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/11/19 0019 下午 3:49
 * @Version:
 * @Description:  club.codenow.dubbo.provider.service.ProviderService
 */
@RestController
public class TestController {
    @Reference(version="1.0.0")
    private ProviderService providerService;
    @Reference
    private XmlProviderApi xmlProviderApi;
    @GetMapping(value = "/test")
    public Object getTest(){
        System.out.println(xmlProviderApi.querySomeData());
        return providerService.getTestString();
    }
}
