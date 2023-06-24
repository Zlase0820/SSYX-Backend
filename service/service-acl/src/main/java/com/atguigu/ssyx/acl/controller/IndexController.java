package com.atguigu.ssyx.acl.controller;

import com.atguigu.ssyx.common.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Api(tags = "登录接口") // 在Swagger的页面中增加
@RestController
@RequestMapping("/admin/acl/index")
@CrossOrigin   //跨域
public class IndexController {

    //  http://localhost:8201/admin/acl/index/login
    @ApiOperation("登录")
    @PostMapping("login")
    public Result login() {
        //返回token值
        Map<String, String> map = new HashMap<>();
        map.put("token", "token-admin");
        return Result.ok(map);
    }

    //  http://localhost:8201/admin/acl/index/info
    @ApiOperation("获取信息")
    @GetMapping("info")
    public Result info() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "admin");
        map.put("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return Result.ok(map);
    }

    //  url: '/admin/acl/index/logout'
    @ApiOperation("退出")
    @PostMapping("logout")
    public Result logout() {
        return Result.ok(null);
    }
}
