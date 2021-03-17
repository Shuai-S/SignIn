package com.shuai.project.domain;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@Slf4j
public class XSpeed {

    private static final String XSPEED_URL_LOGIN = "https://blay.club/auth/login";
    private static final String XSPEED_URL_SIGNIN = "https://blay.club/auth/login";


    /**
     * 登录
     *
     * @return
     */
    public HttpResponse login() {

        log.info("----------开始登录----------");

        HashMap<String, Object> body = new HashMap<>();
        body.put("email", "1354176174@qq.com");
//        body.put("passwd", "-T-mMn3AMX3dzxN");
        body.put("passwd", "qazwsx11");
//        body.put("code", "");
        String json = "...";
        HttpResponse result = HttpRequest.post(XSPEED_URL_LOGIN)
                .body(new JSONObject(body).toJSONString())
                .execute();

        System.out.println(JSONObject.parseObject(result.body()));

        return result;
    }

    /**
     * 签到
     *
     * @return
     */
    public String signIn() {
        HttpResponse login = login();
        return null;
    }


}
