package club.codenow.services.user.service;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/12/13 0013 下午 3:23
 * @Version:
 * @Description:
 */
public interface TestInterefaceDefault {
    default int getAdd(int i,int j){
        return i+j;
    }
}
