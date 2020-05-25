package club.codenow.services.user.service.impl;

import club.codenow.services.user.service.TestInterefaceDefault;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/12/13 0013 下午 3:27
 * @Version:
 * @Description:
 */
public class TestInterefaceDefaultImpl implements TestInterefaceDefault {
    @Override
    public int getAdd(int i, int j) {
       return   TestInterefaceDefault.super.getAdd(i,j);
    }
}
