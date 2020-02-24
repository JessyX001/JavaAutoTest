package com.jessy.httpclient.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.DefaultClientConnection;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by jiangsuyao on 2020/2/21.
 */
public class MyHttpClient {

    @Test
    public void test1() throws IOException{

        //用来存放结果
        String result;
        HttpGet get = new HttpGet("http://www.baidu.com");
        //用来执行get方法的
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        //用来获取结果
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);

    }


}
