package com.elysia.market.user.service.impl;

import com.elysia.common.pojo.common.Result;
import com.elysia.common.pojo.dao.ElysiaUser;
import com.elysia.common.pojo.dao.ElysiaUserInfo;
import com.elysia.market.api.user.IUserService;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.market.api.order.impl
 * @Author: ElysiaKafka
 * @CreateTime: 2023-11-29  22:25:38
 * @Description: TODO
 * @Version: 1.0
 */
@Component
//@Service
public class UserServiceImpl implements IUserService {
    @Override
    public Result<ElysiaUser> register(String username, String password) {
        return null;
    }

    @Override
    public Result<ElysiaUserInfo> queryUserInfo(String username, String password) {
        return null;
    }

    @Override
    public Result<ElysiaUser> updatePassword(String username, String password) {
        return null;
    }

    @Override
    public Result<ElysiaUserInfo> updateUserInfo(ElysiaUserInfo elysiaUserInfo) {
        return null;
    }

    @Override
    public Result deleteAccount(ElysiaUser elysiaUser) {
        return null;
    }
}
