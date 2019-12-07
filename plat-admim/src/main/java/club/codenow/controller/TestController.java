package club.codenow.controller;

import club.codenow.config.SystemStaticConfig;
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
    @GetMapping(value = "/test/getStaticConfig")
    public Object testGetStaticConfig(){
        return "systemAdmin:"+ SystemStaticConfig.systemAdmin+"systemPassword:"+SystemStaticConfig.systemPassword;
    }
}
