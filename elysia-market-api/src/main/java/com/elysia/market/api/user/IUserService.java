package com.elysia.market.api.user;

import com.elysia.common.pojo.common.Result;
import com.elysia.common.pojo.dao.ElysiaUser;
import com.elysia.common.pojo.dao.ElysiaUserInfo;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.service.user
 * @Author: ElysiaKafka
 * @CreateTime: 2023-11-17  22:10:40
 * @Description: TODO
 * @Version: 1.0
 */
public interface IUserService {
    /**
     * @description: 用户注册
     * @author: ElysiaKafka
     * @date: 2024/1/25 23:11
     * @param: username
     * @param: password
     * @return: com.elysia.common.pojo.common.Result<com.elysia.common.pojo.dao.ElysiaUser>
     **/
    Result<ElysiaUser> register(String username, String password);

    /**
     * @description: 查询用户信息
     * @author: ElysiaKafka
     * @date: 2024/1/25 23:12
     * @param: username
     * @param: password
     * @return: com.elysia.common.pojo.common.Result<com.elysia.common.pojo.dao.ElysiaUserInfo>
     **/
    Result<ElysiaUserInfo> queryUserInfo(String username, String password);

    /**
     * @description: 修改密码
     * @author: ElysiaKafka
     * @date: 2024/1/25 23:12
     * @param: username
     * @param: password
     * @return: com.elysia.common.pojo.common.Result<com.elysia.common.pojo.dao.ElysiaUser>
     **/
    Result<ElysiaUser> updatePassword(String username, String password);

    /**
     * @description: 修改用户信息
     * @author: ElysiaKafka
     * @date: 2024/1/25 23:12
     * @param: elysiaUserInfo
     * @return: com.elysia.common.pojo.common.Result<com.elysia.common.pojo.dao.ElysiaUserInfo>
     **/
    Result<ElysiaUserInfo> updateUserInfo(ElysiaUserInfo elysiaUserInfo);

    /**
     * @description: 用户注销
     * @author: ElysiaKafka
     * @date: 2024/1/25 23:12
     * @param: elysiaUser
     * @return: com.elysia.common.pojo.common.Result
     **/
    Result deleteAccount(ElysiaUser elysiaUser);

}
