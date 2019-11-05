package club.codenow.exception;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/10/29 0029 下午 4:31
 * @Version:
 * @Description:
 */
public final class ExceptionUtil {
    public static void handleException(Exception ex) {
        System.out.println("Oops: " + ex.getClass().getCanonicalName());
    }
}
