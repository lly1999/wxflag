package wxflag.wxflag_44.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class User implements Serializable {

    /**
     *
     */
    @NotEmpty(message = "姓名不能为空！")
    @Size(min=1,max=25,message = "姓名长度必须大于2且小于25！")
    private String userID;
    private Integer gold;
    private Integer signCard;
    private Integer changeCard;
    private Integer chatCard;
    private Integer flagID;
    @Id
    @GeneratedValue
    private String openID;

    /**
     *
     */
    @Size (min=1,max=30,message = "介绍长度必须大于2且小于25！")
    private Character Introduce;
    private Character head;
    private String SessionKey;


    public String getUserID() {
        return openID;
    }

    public void setUserID(String userID) {
        this.openID = userID;
    }

    public String getUserName() {
        return userID;
    }

    public void setUserName(String user_name) {
        this.userID = user_name;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getSignCard() {
        return signCard;
    }

    public void setSignCard(Integer signCard) {
        this.signCard = signCard;
    }

    public Integer getChangeCard() {
        return changeCard;
    }

    public void setChangeCard(Integer changeCard) {
        this.changeCard = changeCard;
    }

    public Integer getChatCard() {
        return chatCard;
    }

    public void setChatCard(Integer chatCard) {
        this.chatCard = chatCard;
    }

    public Integer getFlagID() {
        return flagID;
    }

    public void setFlagID(Integer flagID) {
        this.flagID = flagID;
    }

    public Character getIntroduce() {
        return Introduce;
    }

    public void setIntroduce(Character introduce) {
        this.Introduce = introduce;
    }

    public Character getHead() {
        return head;
    }

    public void setHead(Character head) {
        this.head = head;
    }

    public String getOpenID() {
        return openID;
    }

    public void setOpenID(String openID) {
        this.openID = openID;
    }

    public String getSessionKey() {
        return SessionKey;
    }

    public void setSessionKey(String sessionKey) {
        SessionKey = sessionKey;
    }
}
