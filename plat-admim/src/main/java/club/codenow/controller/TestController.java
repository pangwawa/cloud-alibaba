package club.codenow.controller;

import club.codenow.config.SystemStaticConfig;
import club.codenow.l.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/12/7 0007 下午 2:38
 * @Version:
 * @Description:
 */
@RestController
public class TestController {
    @Autowired
    OrderService orderService;
    @GetMapping(value = "/test/getStaticConfig")
    public Object testGetStaticConfig(){
        return null;
        //return "systemAdmin:"+ SystemStaticConfig.systemAdmin+"systemPassword:"+SystemStaticConfig.systemPassword;
    }
    @GetMapping(value = "/test/event")
    public Object testEvent(){
        orderService.submitOrder();
        return "ok";
    }
}
