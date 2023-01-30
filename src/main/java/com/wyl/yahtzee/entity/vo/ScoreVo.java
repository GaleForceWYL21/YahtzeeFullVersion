package com.wyl.yahtzee.entity.vo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Alias("ScoreVo")
@Data
@ApiModel("骰子传惨实体")
public class ScoreVo {
    private int score;
    private String name;
    private int sum1;
    private int sum2;
    private int sum3;
    private int sum4;
    private int sum5;
    private int sum6;
    private int bonus;
    private int sumAll;
    private int fullHouse;
    private int fourKind;
    private int smallStraight;
    private int bigStraight;
    private int yahtzee;
}
