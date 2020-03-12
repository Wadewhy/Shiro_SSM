package xyz.wadewhy.mapper;

        import java.util.List;

        import org.apache.ibatis.annotations.Param;

        import xyz.wadewhy.domain.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer roleid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer roleid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    /**
     * @param userId
     * @return
     */
    List<Role> queryRolesByUserId(Integer userId);
}