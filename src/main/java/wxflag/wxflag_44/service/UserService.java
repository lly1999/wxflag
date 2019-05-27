package wxflag.wxflag_44.service;
import wxflag.wxflag_44.entity.User;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
public interface UserService {


    /**
     * 获取列表
     * @return
     */
  List<User> getUserList();

    /**
     * 通过区域Id获取区域信息
     *
     * @param userID
     * @return
     */
   User getUserById(int userID);

    /**
     * 增加区域信息
     *
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     * 修改区域信息
     *
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 删除区域信息
     *
     * @param userID
     * @return
     */
    boolean deleteUser(int userID);

    int insertUser(int userID);

     int getUserID();

   void setUserID(Integer userID);

     String getUserName();

     void setUserName(String user_name);
     Integer getGold();

     void setGold(Integer gold);

     Integer getSignCard();

    void setSignCard(Integer signCard);

   Integer getChangeCard();

    void setChangeCard(Integer changeCard);

     Integer getChatCard();

    void setChatCard(Integer chatCard);

     Integer getFlagID();

    void setFlagID(Integer flagID);

     Character getIntroduce();

    void setIntroduce(Character introduce);

    Character getHead();

     void setHead(Character head);
     void getOpenId(String openId);

    String getOpenID();

    void setOpenID(String openID);
    String getSessionKey();
    void setSessionKey(String SessionKey);

}



