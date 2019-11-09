package club.codenow.gateway.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/11/5 0005 下午 7:25
 * @Version:
 * @Description:
 */
@RestController
public class TestController {
    @GetMapping(value = "/test")
    public Object toTest(){
        return "confirm page";
    }
    @PostMapping(value = "/testPost")
    public Object toPostTest(){
        return "confirm page post";
    }
}
