package com.elysia.market.user.mapper;

import com.elysia.common.pojo.dao.ElysiaUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.mapper
 * @Author: ElysiaKafka
 * @CreateTime: 2023-11-17  22:37:45
 * @Description: TODO
 * @Version: 1.0
 */
@Mapper
public interface ElysiaMarketUserMapper {

    int createUser(ElysiaUser elysiaUser);

    int modifyPassword(String userId, String password);

    int deleteUser(String userId);

    ElysiaUser queryUserById(String userId);

    List<ElysiaUser> queryUserList(Map<String, Object> queryParams);
}
