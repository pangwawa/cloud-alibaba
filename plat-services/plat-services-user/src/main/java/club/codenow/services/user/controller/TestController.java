package club.codenow.services.user.controller;

import club.codenow.feign.api.user.UserInfoClientApi;
import club.codenow.services.user.common.annotation.ApiInvokingLog;
import club.codenow.services.user.service.TestInterefaceDefault;
import club.codenow.services.user.service.UserInfoService;
import club.codenow.services.user.service.impl.TestInterefaceDefaultImpl;
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
public class TestController implements UserInfoClientApi {
    @Autowired
    UserInfoService userInfoService;
    @Override
    @GetMapping(value = "/usertest")
    @ApiInvokingLog(api = "/usertest",requestMethod = RequestMethod.GET )
    public  String getUserInfo(String username){
        log.info("user 服务的 usertest方法调用");
        return userInfoService.getUserInfo(username);
    }

    @GetMapping(value = "")
    public Object test(){
        return null;
    }


    public static void main(String[] args) {
        /*TestInterefaceDefaultImpl testInterefaceDefault=new TestInterefaceDefaultImpl();
        System.out.println(testInterefaceDefault.getAdd(2,3));*/
        System.out.println(String.format("参数:%s,时间%s",50,2019));
    }

}
