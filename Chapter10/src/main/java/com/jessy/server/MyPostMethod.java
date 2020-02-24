package com.jessy.server;

import com.jessy.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by jiangsuyao on 2020/2/22.
 */


@RestController
@Api(value="/",description="全部的post请求")
@RequestMapping("/v1")
public class MyPostMethod {

    //这个变量是用来装cookies信息的
    private static Cookie cookie;

    //用户登陆成功获取到cookies，然后再访问其他接口获取接口列表

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "登陆接口，成功后获取cookies信息",httpMethod = "POST")
    public String login(HttpServletResponse response,
                        @RequestParam(value = "userName",required = true) String userName,
                        @RequestParam(value = "passWord",required = true) String passWord){

        if(userName.equals("jessy") && passWord.equals("123456")){
            cookie = new Cookie("login","true");
            response.addCookie(cookie);
            return "恭喜登陆成功！！！";
        }
        return "用户名或密码错误！";

    }

    @RequestMapping(value = "/getUserList",method = RequestMethod.POST)
    @ApiOperation(value = "获取用例列表",httpMethod = "POST")
    public String getUserList(HttpServletRequest request,
                            @RequestBody User u){
        User user;

        //获取cookies
        Cookie[] cookies = request.getCookies();
        //验证cookies是否合法
        for(Cookie c:cookies){
            if(c.getName().equals("login")
                    && c.getValue().equals("true")
                    && u.getUserName().equals("jessy")
                    && u.getPassWord().equals("123456")){

                user = new User();
                user.setName("lisi");
                user.setAge("13");
                user.setSex("man");

                return user.toString();
            }
        }
        return "参数不合法";

    }


}
