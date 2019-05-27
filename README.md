# 微信小程序后台API文档

- 所有API的路径均为这种模式:`服务器地址/根目录/控制器名/函数名`
- 所有API的返回均为这种格式 例如：wxflag.cn/api/User/updateUuser
- 变量名函数名 驼峰法
  ```json
    {
    "status":bool,		//表示请求成功与否
    "errCode":int,			//错误代码
    "errMsg":string,		//错误信息
    "data":string			//可能有，表示返回的数据
    }
  ```
- 状态码和信息对应表

|    状态码    |        信息        |                 说明                 |
| :-----------: | :--------------------: | :----------------------------------: |
|      0       |      成功                |   成功   |
|      11       |     非法的参数传递     |     请求方法时携带了错误的参数值     |
|      12       |     未通过身份认证     |     代表该微信账户未通过身份认证     |
|      101      |     已通过身份认证     |     代表该微信账户已通过身份认证     |
|      102      |        操作成功        |       执行对应操作获得正确结果       |
|      103      |       未知错误         |      测试中可能遇到

## 用户模块（User）

### User控制器  功能：对个人信息的增删改等

- ### isAuth

  - 功能：用于获取当前用户的微信认证情况

  - HTTP METHOD:POST

  - Request:

    ```json
    {
        "openid":string//每个微信账号的唯一标识
    }
    ```

  - Return:

    ```json
    {
        "status":bool,//true代表已经通过身份认证,false代表没有
        "errCode":int,
        "errMsg":string
    }
    ```

- ### getUserInfo

  - 功能：用于获取用户个人信息

  - HTTP METHOD:POST

  - Request:

    ```json
    {
        "openid":string,	//微信号唯一标识
        "isAuth":bool			//是否通过认证
    }
    ```

  - Return:

    ```json
    {
        "status": true,
        "errCode": 201,
        "errMsg": "身份认证成功",
        "data": {
            "userID": char, //用户名
            "introduce": char,//用户简介
            "head": char, //头像图片所存URL
            "flagNumber": int,//完成FLAG数量
            "gold": int, //金币
            "signCard": int,//签到卡
            "changeCard": int,//改名卡
            "chatCard": int,//聊天卡

        }
    }
    ```
- ### updateUser

  - 功能：更新个人信息,默认显示原信息，输入更改

  - HTTP METHOD:POST

  - Request:

    ```json
    {
        "userID": char, //用户名
        "introduce": char,//用户简介
        "head": char, //头像图片URL
    }
    ```

  - Return:

    ```json
    {
        "errCode":int, //状态码
        "errMsg":string，//信息
    }
    ```



- ### queryUserById

  - 功能：根据完成flag数 顺序列出User 排行榜

  - HTTP METHOD:POST

  - Request:

    ```json
    {}
    ```

  - Return:

    ```json
    {   "status":bool
        "errcode":0
        "data":{
            "UserID" :char, //显示昵称
             "head" :char, // 头像
            "flagNumber" :int, //完成数量
        },
        "data":{
            "UserID" :char,
             "head" :char,
            "flagNumber" :int,
        },
        "data":{
            "UserID" :char,
             "head" :char,
            "flagNumber" :int,
        },
 }```

# TODO


## flag(flag)
### flag控制器	

功能：实现flag的增删改查功能

- ### getFlagInfo

  - 功能：获取flag信息

  - HTTP METHOD:POST

  - Request：

    ```json
    {
       "flagID": int,					//flag的ID
    }
    ```

  - Return:

    ```json
    {
        "status": true,
        "errCode": 202,
        "errMsg": "操作成功",
        "data": { "joinNum":int
                  "niceNum" :int
                  "reportNum" :int
                  "UserID"

            
                }
            
        }
    }
    ```




