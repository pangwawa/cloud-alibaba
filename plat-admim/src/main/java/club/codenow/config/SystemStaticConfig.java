package club.codenow.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/12/7 0007 下午 2:35
 * @Version:
 * @Description:
 */
@Component
public class SystemStaticConfig {
    public static String  systemAdmin;
    public static String systemPassword;
    @Value("${config.system.admin}")
    public void setSystemAdmin(String systemAdmin){
        SystemStaticConfig.systemAdmin=systemAdmin;
    }
    @Value("${config.system.password}")
    public void setSystemPassword(String systemPassword){
        SystemStaticConfig.systemPassword=systemPassword;
    }
}
