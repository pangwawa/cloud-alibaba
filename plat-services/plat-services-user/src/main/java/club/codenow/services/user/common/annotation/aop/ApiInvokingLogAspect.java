package club.codenow.services.user.common.annotation.aop;

import club.codenow.services.user.common.annotation.ApiInvokingLog;
//import com.google.gson.Gson;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.NamedThreadLocal;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Method;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/11/23 0023 下午 3:09
 * @Version:
 * @Description:
 */
@Aspect
@Component
public class ApiInvokingLogAspect {
    private NamedThreadLocal<Long> startTimeThreadLocal = new NamedThreadLocal<Long>("Request-StartTime");
    @Pointcut("@annotation(club.codenow.services.user.common.annotation.ApiInvokingLog)")
    public void pointCut(){
    }
    @Before("pointCut()")
    public void doBefore(JoinPoint joinPoint){
        MethodSignature methodSignature =  (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        ApiInvokingLog annotation = method.getAnnotation(ApiInvokingLog.class);
        String api=annotation.api();
        RequestMethod requestMethod=annotation.requestMethod();
        System.out.println("do before: api，"+api+",requestMethod,"+requestMethod);
        //System.out.println("参数："+new Gson().toJson(joinPoint.getArgs()));
        long startTime=System.currentTimeMillis();
        startTimeThreadLocal.set(startTime);
    }

    // 环绕 一定要写完整
    @Around("pointCut()")
    public Object doAround(JoinPoint joinPoint) throws Throwable {
        ProceedingJoinPoint tempJoinPoint= (ProceedingJoinPoint) joinPoint;
        Object object=tempJoinPoint.proceed();
        System.out.println("doAround");
        return object;
    }
    @AfterReturning(returning = "ret",pointcut = "pointCut()")
    public void afterReturning(Object ret){
        System.out.println("返回值："+ret);
    }
    @After("pointCut()")
    public void doAfter(JoinPoint joinPoint){
        System.out.println("doAfter");
        long consumeTime = System.currentTimeMillis() - startTimeThreadLocal.get();
        System.out.println("接口请求耗时："+consumeTime + "(ms)");
    }
}
