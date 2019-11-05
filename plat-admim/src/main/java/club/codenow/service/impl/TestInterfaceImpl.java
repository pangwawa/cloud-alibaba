package club.codenow.service.impl;

import club.codenow.exception.ExceptionUtil;
import club.codenow.service.TestInterface;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/10/29 0029 上午 11:35
 * @Version:
 * @Description:
 */
@Service
public class TestInterfaceImpl implements TestInterface {
    @SentinelResource(value = "resource",blockHandler = "handleException", blockHandlerClass = {ExceptionUtil.class})
    @Override
    public String getTestString() {
        return "TestInterfaceImpl";
    }
}
