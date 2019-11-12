package club.codenow.controller;

import club.codenow.service.TestInterface;
import club.codenow.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/10/29 0029 上午 11:33
 * @Version:
 * @Description:
 */
@RestController
public class TestController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    TestInterface testInterface;
    @GetMapping(value = "test")
    public Object testController(){
        return testInterface.getTestString();
    }
    @Autowired
    UserInfoService userInfoService;
    @GetMapping(value = "/calluserinfoservice")
    public Object getFeginService(){
        return userInfoService.getUserInfo();
    }
}
