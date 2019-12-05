package club.codenow.services.user.task.xxljob;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Component;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/12/5 0005 下午 1:51
 * @Version:
 * @Description: xxl分布式任务调度 demo
 */
@JobHandler(value = "demoXxlJob")
@Component
public class DemoXXLJob  extends IJobHandler {
    @Override
    public ReturnT<String> execute(String s) throws Exception {
        System.out.println("demoXxlJob,"+System.currentTimeMillis());
        XxlJobLogger.log("demoXxlJob,"+System.currentTimeMillis());
        return SUCCESS;
    }
}
