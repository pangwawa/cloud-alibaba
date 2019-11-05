package club.codenow.controller;

import club.codenow.service.TestInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
    TestInterface testInterface;
    @GetMapping(value = "test")
    public Object testController(){
        return testInterface.getTestString();
    }
}
