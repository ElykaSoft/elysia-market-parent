package com.elysia.market.user.service.impl;

import com.elysia.common.pojo.common.Result;
import com.elysia.common.pojo.dao.ElysiaUser;
import com.elysia.common.pojo.dao.ElysiaUserInfo;
import com.elysia.market.api.user.IUserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.market.api.order.impl
 * @Author: ElysiaKafka
 * @CreateTime: 2023-11-29  22:25:38
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements IUserService {
    @Override
    public Result<ElysiaUser> register(ElysiaUser elysiaUser) {
        return null;
    }

    @Override
    public Result<ElysiaUser> resetPassword(String username, String password) {
        return null;
    }

    @Override
    public Result deleteAccount(ElysiaUser elysiaUser) {
        return null;
    }

    @Override
    public Result<ElysiaUserInfo> queryUserInfo(String username, String password) {
        return null;
    }

    @Override
    public Result<ElysiaUserInfo> updateUserInfo(ElysiaUserInfo elysiaUserInfo) {
        return null;
    }

    @Override
    public Result<ElysiaUserInfo> addUserInfo(ElysiaUserInfo elysiaUserInfo) {
        return null;
    }
}
