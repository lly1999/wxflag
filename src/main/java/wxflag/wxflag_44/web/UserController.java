package wxflag.wxflag_44.web;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wxflag.wxflag_44.entity.User;
import wxflag.wxflag_44.service.UserService;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 获取所有的用户信息
     *
     * @return
     */
    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    private Map<String, Object> getUserInfo() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<wxflag.wxflag_44.entity.User> list = new ArrayList<User>();
        // 获取用户列表
        list = userService.getUserList();
        modelMap.put("userList", list);
        return modelMap;
    }

    /**
     * 登录接口
     * @param encryptedData
     * @param iv
     * @param code
     * @return
     */

    /**
     * 通过用户Id获取用户信息
     *
     * @return
     */
    @RequestMapping(value = "/getUserById", method = RequestMethod.GET)
    private Map<String, Object> getUserbyId(Character userId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 获取用户信息
         wxflag.wxflag_44.entity.User user = userService.getUserById(userId);
        modelMap.put("user", user);
        return modelMap;
    }

    /**
     * 添加用户信息
     *
     * @param UserStr
     * @param request
     * @return
     * @throws IOException
     * @throws JsonMappingException
     * @throws JsonParseException
     */
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    private Map<String, Object> addUser(@RequestBody wxflag.wxflag_44.entity.User user)
            throws JsonParseException, JsonMappingException, IOException {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 添加用户信息
        modelMap.put("success", userService.addUser(user));
        return modelMap;
    }

    /**
     * 修改用户信息，主要修改名字、头像、简介
     *
     * @param UserStr
     * @param request
     * @return
     * @throws IOException
     * @throws JsonMappingException
     * @throws JsonParseException
     */
    @RequestMapping(value = "/updateUser", method = RequestMethod.PUT)
    private Map<String, Object> updateUser(@RequestBody wxflag.wxflag_44.entity.User user)
            throws JsonParseException, JsonMappingException, IOException {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 修改用户信息
        modelMap.put("success", userService.updateUser(user));
        return modelMap;
    }


}
