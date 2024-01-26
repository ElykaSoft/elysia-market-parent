package com.elysia.market.user.mapper;

import com.elysia.common.pojo.dao.ElysiaUserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: elysia-market-parent
 * @BelongsPackage: com.elysia.market.user.mapper
 * @Author: ElysiaKafka
 * @CreateTime: 2024-01-26  23:11:05
 * @Description: TODO
 * @Version: 1.0
 */
@Mapper
public interface ElysiaMarketUserInfoMapper {
    int createUserInfo(ElysiaUserInfo elysiaUserInfo);

    int modifyUserInfo(ElysiaUserInfo elysiaUserInfo);

    int deleteUserInfo(String userId);

    ElysiaUserInfo queryUserInfo(String userId);

    List<ElysiaUserInfo> queryAllUserInfo();

    List<ElysiaUserInfo> queryUserInfoList(Map<String, Object> queryParams);
}
