package xyz.wadewhy.mapper;

import org.apache.ibatis.annotations.Param;

import xyz.wadewhy.domain.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * @param username
     * @return
     */
    User queryUserByUserName(@Param("username") String username);
}