package com.wyl.yahtzee.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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
@ApiModel("骰子分数详情实体类")
@Alias("ScoreDetailEntity")
@Data
@TableName("score_detail")
public class ScoreDetailEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
	private Integer id;
    /**
     * 
     */
	private Integer scoreId;
    /**
     * 
     */
    @TableField(value = "sum_1")
	private Integer sum1;
    /**
     * 
     */
    @TableField(value = "sum_2")
	private Integer sum2;
    /**
     * 
     */
    @TableField(value = "sum_3")
	private Integer sum3;
    /**
     * 
     */
    @TableField(value = "sum_4")
	private Integer sum4;
    /**
     * 
     */
    @TableField(value = "sum_5")
	private Integer sum5;
    /**
     * 
     */
    @TableField(value = "sum_6")
	private Integer sum6;
    /**
     * 
     */
	private Integer bonus;
    /**
     * 
     */
	private Integer sumAll;
    /**
     * 
     */
	private Integer fullhouse;
    /**
     * 
     */
	private Integer fourKind;
    /**
     * 
     */
	private Integer smallStraight;
    /**
     * 
     */
	private Integer bigStraight;
    /**
     * 
     */
	private Integer yahtzee;
}