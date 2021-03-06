package com.example.provider.controller.Http;/**
 * @Description:
 * @Author: zhanghua
 * @Date: 2020/9/4 10:58
 */

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@Api(tags = "案例PostHttp")
@RestController
public class PostHttpController {

    @ApiOperation(value = "1.postHttp")
    @PostMapping("/postHttp")
    public String getHttp(){
        return "post无参调用成功";
    }

    @ApiOperation(value = "2.postHttpParam")
    @PostMapping("/postHttpParam")
    public String getHttpParam(@RequestBody String param, HttpServletRequest request){
        String key = request.getHeader("appkey");
        System.out.println(request);
        System.out.println(key);
        return "post有参调用成功，参数为:"+param;
    }

}
