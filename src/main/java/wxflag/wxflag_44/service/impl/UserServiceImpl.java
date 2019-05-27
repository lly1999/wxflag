package wxflag.wxflag_44.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wxflag.wxflag_44.dao.UserDao;
import wxflag.wxflag_44.entity.User;
import wxflag.wxflag_44.service.UserService;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
 @Autowired
    private UserDao userDao;


    @Override
    public List<wxflag.wxflag_44.entity.User> getUserList() {
        return userDao.queryUser();
    }

    @Override
    public wxflag.wxflag_44.entity.User getUserById(int userID) {
        return userDao.queryUserById(userID);
    }

    @Override
    public int insertUser(int userID) {
        return 0;
    }

    @Override
    public int getUserID() {
        return 0;
    }

    @Override
    public void setUserID(Integer userID) {

    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public void setUserName(String user_name) {

    }

    @Override
    public Integer getGold() {
        return null;
    }

    @Override
    public void setGold(Integer gold) {

    }

    @Override
    public Integer getSignCard() {
        return null;
    }

    @Override
    public void setSignCard(Integer signCard) {

    }

    @Override
    public Integer getChangeCard() {
        return null;
    }

    @Override
    public void setChangeCard(Integer changeCard) {

    }

    @Override
    public Integer getChatCard() {
        return null;
    }

    @Override
    public void setChatCard(Integer chatCard) {

    }

    @Override
    public Integer getFlagID() {
        return null;
    }

    @Override
    public void setFlagID(Integer flagID) {

    }

    @Override
    public Character getIntroduce() {
        return null;
    }

    @Override
    public void setIntroduce(Character introduce) {

    }

    @Override
    public Character getHead() {
        return null;
    }

    @Override
    public void setHead(Character head) {

    }

    @Override
    public void getOpenId(String openId) {

    }

    @Override
    public int updateUser(wxflag.wxflag_44.entity.User user) {
        if (user.getUserID()!=null  )
        {     user.setUserName(user.getUserName());
            user.setHead(user.getHead());
            user.setIntroduce(user.getIntroduce());

        }
     try {
         int errcode=userDao.insertUser(user);
       return errcode;



     }catch (Exception e){throw new RuntimeException("更新失败！");

     }

    }

    @Transactional
    @Override
    public boolean addUser(User user) {
        if (user.getUserName() != null && !"".equals(user.getUserName())) {
            // 设置默认值
            user.setUserName(user.getUserName());
            if (user.getUserID()!= null)
                user.setUserID(user.getUserID());

            try {
                int effectedNum = userDao.insertUser(user);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("添加用户失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("添加用户失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("用户信息不能为空！");
        }
    }



    @Override
    public boolean deleteUser(int userId) {
        return false;
    }

    @Override
    public String getOpenID() {
        return null;
    }
    @Override
    public void setOpenID(String openID){}

    @Override
    public String getSessionKey() {
        return null;
    }

    @Override
    public void setSessionKey(String SessionKey) {

    }

    ;
}
