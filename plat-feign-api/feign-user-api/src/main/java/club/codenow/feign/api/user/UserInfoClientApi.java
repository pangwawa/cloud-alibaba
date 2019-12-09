package club.codenow.feign.api.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/12/6 0006 下午 5:38
 * @Version:
 * @Description:
 */
@FeignClient(name = "plat-services-user")
public interface UserInfoClientApi {
    @GetMapping(value = "/usertest")
    String getUserInfo(String username);
}
