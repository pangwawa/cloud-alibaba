package club.codenow.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Jack Wu
 * @Email: wj@dofun.cc
 * @Date: 2019/11/9 0009 下午 2:15
 * @Version:
 * @Description:
 */
@Configuration
public class GateWayConfiguration {
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/usertest")
                        .filters(f -> f.addRequestHeader("Hello", "World"))
                        .uri("http://localhost:18081"))
                .build();
    }
}
