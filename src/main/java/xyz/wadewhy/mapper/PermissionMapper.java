package xyz.wadewhy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import xyz.wadewhy.domain.Permission;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer perid);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer perid);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    /**
     * @param userId
     * @return
     */
    List<Permission> queryPermissionByUserId(Integer userId);
}