package wxflag.wxflag_44.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.mybatis.spring.annotation.MapperScan;
import wxflag.wxflag_44.entity.User;

import javax.annotation.Resource;
import java.util.List;

public interface UserDao {
    /**
     * 列出用户列表
     *
     * @return userList
     */

    List<User> queryUser() ;

    /**
     * 根据Id列出具体区域
     *
     * @return user
     */

    wxflag.wxflag_44.entity.User queryUserById(int userId);

    /**
     * 插入区域信息
     *
     * @param user
     * @return
     */

    int insertUser(wxflag.wxflag_44.entity.User user);

    /**
     * 更新区域信息
     *
     * @param user
     * @return
     */

    int updateUser(User user);

    /**
     * 删除区域信息
     *
     * @param userId
     * @return
     */
    int deleteUser(int userId);
    int listUserByFlag(int flagID);
}
