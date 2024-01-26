package com.elysia.market.user.controller;

import com.elysia.market.api.user.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.market.order.controller
 * @Author: ElysiaKafka
 * @CreateTime: 2023-11-25  22:57:19
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
@RequestMapping("/order")
@RefreshScope// 支持Nacos的动态刷新功能
@Slf4j
public class UserController {
    @Autowired
    private IUserService iUserService;

    @Autowired
    private RestTemplate restTemplate;


}
