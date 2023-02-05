package com.wyl.yahtzee.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@ApiModel("注册实体")
@Alias("UserEntity")
@Data
@TableName("user")
public class UserEntity implements Serializable {
    @TableId
    private int id;
    private String name;
    private String password;
    private String token;
    private String vip;
    private String hidden;
    private String invite;
}
