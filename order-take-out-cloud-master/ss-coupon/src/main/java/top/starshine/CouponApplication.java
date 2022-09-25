package top.starshine;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import top.starshine.commons.aspect.EnableMyThreadPool;

/**
 * <h3>优惠券微服务</h3>
 *
 * @author: starshine
 * @email: 183101655@qq.com
 * @version: 1.0
 * @since: 2022/7/24  下午 11:58  周日
 * @Description: hello world
 */
@EnableMyThreadPool // 开启自定义异步线程池
@EnableDubbo //开 dubbo 服务
@EnableDiscoveryClient  //开启服务注册功能配置功能
@SpringBootApplication
public class CouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(CouponApplication.class, args);
        System.out.println("|========================| START OK! |========================|");
    }

}
