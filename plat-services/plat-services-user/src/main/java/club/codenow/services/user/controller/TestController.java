package club.codenow.services.user.controller;

import club.codenow.services.user.common.annotation.ApiInvokingLog;
import club.codenow.services.user.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/11/7 0007 下午 5:04
 * @Version:
 * @Description:
 */
@RestController
@Slf4j
public class TestController {
    @Autowired
    UserInfoService userInfoService;
    @GetMapping(value = "/usertest")
    @ApiInvokingLog(api = "/usertest",requestMethod = RequestMethod.GET )
    public  Object getUserInfo(String username){
        log.info("user 服务的 usertest方法调用");
        return userInfoService.getUserInfo(username);
    }

    @GetMapping(value = "")
    public Object test(){
        return null;
    }

}
