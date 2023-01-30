package com.wyl.yahtzee.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 *
 * @author GaleForceWYL 1205443857@qq.com
 * @since 1.0.0 2023-01-14
 */
@ApiModel("骰子分数概述实体类")
@Alias("ScoreEntity")
@Data
@TableName("score")
public class ScoreEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 
     */
    @TableId(type = IdType.AUTO)

    private Integer id;
    /**
     * 
     */
	private String name;
    /**
     * 
     */
	private Integer score;
    /**
     * 
     */
	private String time;
}