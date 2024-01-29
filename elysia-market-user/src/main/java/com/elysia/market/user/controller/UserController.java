package com.elysia.market.user.controller;

import com.elysia.common.exception.ServiceFailException;
import com.elysia.common.exception.ServiceUnknownException;
import com.elysia.common.pojo.common.Result;
import com.elysia.common.pojo.dao.ElysiaUser;
import com.elysia.common.pojo.dao.ElysiaUserInfo;
import com.elysia.common.util.IdGeneratorUtil;
import com.elysia.common.util.MD5Util;
import com.elysia.market.api.user.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
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
@RequestMapping("/user")
@RefreshScope// 支持Nacos的动态刷新功能
@Slf4j
public class UserController {
    @Autowired
    private IUserService iUserService;
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/register")
    @Transactional
    public Result register(String username, String password, String email) {
        try {
            String id = IdGeneratorUtil.getId();
            ElysiaUser elysiaUser = new ElysiaUser().builder()
                    .id(id)
                    .username(username)
                    .password(password)
                    .build();
            ElysiaUserInfo elysiaUserInfo = new ElysiaUserInfo().builder()
                    .id(id)
                    .email(email)
                    .build();

            Result<ElysiaUser> registerResult = iUserService.register(elysiaUser);
            if (registerResult.getResultCode().intValue() == Result.FAIL.intValue()) {
                throw new ServiceFailException(registerResult.getErrorCode(), registerResult.getErrorInfo());
            }
            if (registerResult.getResultCode().intValue() == Result.UNKNOWN.intValue()) {
                throw new ServiceUnknownException(registerResult.getErrorCode(), registerResult.getErrorInfo());
            }

            Result<ElysiaUserInfo> addUserInfoResult = iUserService.addUserInfo(elysiaUserInfo);
            if (addUserInfoResult.getResultCode().intValue() == Result.FAIL.intValue()) {
                throw new ServiceFailException(registerResult.getErrorCode(), registerResult.getErrorInfo());
            }
            if (addUserInfoResult.getResultCode().intValue() == Result.UNKNOWN.intValue()) {
                throw new ServiceUnknownException(registerResult.getErrorCode(), registerResult.getErrorInfo());
            }

            return registerResult;
        } catch (ServiceFailException e) {
            return Result.returnFail(e.getErrorCode(), e.getErrorInfo());
        } catch (ServiceUnknownException e) {
            return Result.returnUnknown(e.getErrorCode(), e.getErrorInfo());
        } catch (Exception e) {
            return Result.returnUnknown("99999999", ExceptionUtils.getStackTrace(e));
        }
    }
}
