package com.wyl.yahtzee.controller;

import com.wyl.yahtzee.entity.vo.ScoreVo;
import com.wyl.yahtzee.Utils.R;
import com.wyl.yahtzee.entity.vo.registerVo;
import com.wyl.yahtzee.service.YahtzeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.scanner.Constant;

@Api(value = "骰子接口")
@RestController
@RequestMapping("/Yahtzee")
public class YahtzeeController {

    @Autowired
    private YahtzeeService yahtzeeService;

    @ApiOperation("存储信息")
    @ApiResponses({
            @ApiResponse(code = 0, message = "操作成功", response = String.class),
            @ApiResponse(code = 500, message = "操作失败", response = String.class)
    })
    @CrossOrigin//配置跨域
    @PostMapping("/store")
    public R store(@RequestBody ScoreVo score){
        try{
            yahtzeeService.store(score);
        }catch (Exception e) {
            return R.error(e);
        }
        return R.ok("success");
    }

    @ApiOperation("登录")
    @ApiResponses({
            @ApiResponse(code = 0, message = "操作成功", response = String.class),
            @ApiResponse(code = 500, message = "操作失败", response = String.class)
    })
    @GetMapping("/login")
    public R login(@RequestParam("name")String name){
        return R.ok(name+"success");
    }

    @ApiOperation("注册")
    @ApiResponses({
            @ApiResponse(code = 0, message = "操作成功", response = String.class),
            @ApiResponse(code = 500, message = "操作失败", response = String.class)
    })
    @CrossOrigin//配置跨域
    @PostMapping("/register")
    public R register(@RequestBody registerVo vo){
        int status = 0;
        try{
             status = yahtzeeService.register(vo);
            if(status == -1)return R.ok(400, "用户名重复");
            if(status == -2)return R.ok(400, "密码长度必须大于6个字符");
            if(status == 1)return R.ok(200, "注册成功");
        }catch (Exception e) {
            return R.error(e);
        }
        return R.ok(status, "注册失败");
    }




}