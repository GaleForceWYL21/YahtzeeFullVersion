package com.wyl.yahtzee.entity.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Alias("registerVo")
@Data
@ApiModel("注册信息")
public class registerVo {
    private String username;
    private String password;
    private String inviteCode;
}
