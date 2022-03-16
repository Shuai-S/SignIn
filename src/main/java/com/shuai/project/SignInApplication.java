package com.shuai.project;

import com.shuai.project.domain.XSpeed;
import com.shuai.project.domain.baidu.BaiDuTieBa;


public class SignInApplication {

    public static void main(String[] args) {
//        System.out.println(new XSpeed().login());
        // 贴吧签到
        new BaiDuTieBa().run(args);

    }
}