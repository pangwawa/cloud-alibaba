package club.codenow.services.user.service.impl;

import club.codenow.services.user.service.UserInfoService;
import org.springframework.stereotype.Service;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/11/7 0007 下午 5:04
 * @Version:
 * @Description:
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Override
    public String getUserInfo(String username) {
        return "username:"+username;
    }
}
