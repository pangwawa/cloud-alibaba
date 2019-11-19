package club.codenow.dubbo.customer.controller;


import club.codenow.dubbo.provider.service.ProviderService;
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
    @GetMapping(value = "/test")
    public Object getTest(){
        return providerService.getTestString();
    }
}
