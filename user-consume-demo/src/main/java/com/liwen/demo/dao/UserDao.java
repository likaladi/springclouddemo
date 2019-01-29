/*
package com.liwen.demo.dao;

import com.liwen.demo.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Slf4j
@Component
public class UserDao {

    @Autowired
    private RestTemplate restTemplate;

    */
/*public User queryUserById(Long id){
        String url = "http://localhost:8081/user/" + id;

        return this.restTemplate.getForObject(url, User.class);
    }*//*


    //@HystrixCommand(fallbackMethod="queryUserByIdFallback")`：声明一个失败回滚处理函数queryUserByIdFallback，
    // 当queryUserById执行超时（默认是1000毫秒），就会执行fallback函数，返回错误提示。
    @HystrixCommand(fallbackMethod = "queryUserByIdFallback")
    public User queryUserById(Integer id){
        long begin = System.currentTimeMillis();
        String url = "http://user-service/user/" + id;
        User user = this.restTemplate.getForObject(url, User.class);
        long end = System.currentTimeMillis();
        // 记录访问用时：
        log.info("访问用时：{}", end - begin);
        return user;
    }

    public User queryUserByIdFallback(Integer id){
        User user = new User();
        user.setId(id);
        user.setName("用户信息查询出现异常！");
        return user;
    }

}
*/
