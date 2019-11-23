package club.codenow.services.user.common.annotation;

import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.*;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/11/23 0023 下午 3:08
 * @Version:
 * @Description:
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiInvokingLog {
    String api() default "";
    RequestMethod requestMethod() ;
}
