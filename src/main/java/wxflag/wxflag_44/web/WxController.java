package wxflag.wxflag_44.web;

import com.google.gson.Gson;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import wxflag.wxflag_44.entity.User;
import wxflag.wxflag_44.service.UserService;

@RestController
@RequestMapping("/Wx")
public class WxController {
    @Autowired
    private UserService userService;
    public static String APPID =  "wx2f1b63de29dcc35a";
    public static String SECRET = "394da984bcbf0e9b2248057dbaf4b69a";
    /**
     * 调用wx接口
     *获取openid
     *微信登陆授权
     */
    @RequestMapping(value = "/wxlogin",method = RequestMethod.GET)
    private String wxlogin (String code)
    {   //微信的接口

        String url = "https://api.weixin.qq.com/sns/jscode2session?appid="+APPID+

                "&secret="+SECRET+"&js_code="+ code +"&grant_type=authorization_code";

        RestTemplate restTemplate = new RestTemplate();

//进行网络请求,访问url接口

        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, String.class);

//根据返回值进行后续操作

        if(responseEntity != null && responseEntity.getStatusCode() == HttpStatus.OK)

        {

            String sessionData = responseEntity.getBody();

            Gson gson = new Gson();

//解析从微信服务器获得的openid和session_key;

            UserService userService = gson.fromJson(sessionData, UserService.class);

//获取用户的唯一标识

            String openid = userService.getOpenID();

//获取会话秘钥

            String sessionKey = userService.getSessionKey();


//最后要返回一个自定义的登录态,用来做后续数据传输的验证

        }


        return null;

    }
}
