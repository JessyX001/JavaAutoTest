package com.jessy.server;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by jiangsuyao on 2020/2/22.
 */


@RestController
@Api(value = "/",description = "全部的get方法")
public class MyGetMethod {

    @RequestMapping(value = "/getCookies",method = RequestMethod.GET)
    @ApiOperation(value = "通过这个方法可以获取到cookies",httpMethod = "GET")
    public String getCookies(HttpServletResponse response){
        //HttpServletRequest 装请求信息的类
        //HttpServletResponse 装响应信息的类

        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);

        return "springboot开发：恭喜获得cookies信息!!!";
    }


    /**
     * 要求客户端携带cookies访问
     * 这是需要携带cookies信息才能访问的get请求
     */
    @RequestMapping(value="/getwithcookies",method = RequestMethod.GET)
    @ApiOperation(value = "这是需要携带cookies信息才能访问的get请求",httpMethod = "GET")
    public String getWithCookies(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();

        if(Objects.isNull(cookies)){
            return "必须携带cookies信息来！！！";
        }
        for(Cookie cookie:cookies){
            if(cookie.getName().equals("login") && cookie.getValue().equals("true")){
                return "携带cookies,访问成功啦！！！";
            }
            else{
                return "携带cookies信息有误哦！！！";
            }
        }

        return "必须携带cookies信息来！！！";
    }

    /**
     * 开发一个需要携带参数才能访问的get请求
     * 第一种方式 url：key=value&key=value
     * 模拟获取商品列表
     */

    @RequestMapping(value = "/get/with/param",method = RequestMethod.GET)
    @ApiOperation(value = "开发一个需要携带参数才能访问的get请求方式1",httpMethod = "GET")
    public Map<String,Integer> getList(@RequestParam Integer start, @RequestParam Integer end){
        Map<String ,Integer> myList = new HashMap<>();

        myList.put("鞋",400);
        myList.put("干脆面",1);
        myList.put("衬衫",300);

        return myList;

    }

    /**
     * 第二种需要携带参数访问的get请求
     * url:ip:port/get/with/param/10/20
     */

    @RequestMapping(value = "/get/with/param/{start}/{end}")
    @ApiOperation(value = "开发一个需要携带参数才能访问的get请求方式2",httpMethod = "GET")
    public Map myGetList(@PathVariable Integer start,@PathVariable Integer end){
        Map<String ,Integer> myList = new HashMap<>();

        myList.put("鞋",400);
        myList.put("干脆面",1);
        myList.put("衬衫",300);

        return myList;
    }




}
