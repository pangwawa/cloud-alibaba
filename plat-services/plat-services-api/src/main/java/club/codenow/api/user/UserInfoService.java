package club.codenow.api.user;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/11/7 0007 下午 5:03
 * @Version:
 * @Description:
 */
@FeignClient(name = "plat-services-user")
public interface UserInfoService {
    @RequestMapping(value = "/usertest")
    String getUserInfo();
}
