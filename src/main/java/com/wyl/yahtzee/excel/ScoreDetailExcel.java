package com.wyl.yahtzee.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 
 *
 * @author GaleForceWYL 1205443857@qq.com
 * @since 1.0.0 2023-01-14
 */
@Data
public class ScoreDetailExcel {
    @Excel(name = "")
    private Integer id;
    @Excel(name = "")
    private Integer scoreId;
    @Excel(name = "")
    private Integer sum1;
    @Excel(name = "")
    private Integer sum2;
    @Excel(name = "")
    private Integer sum3;
    @Excel(name = "")
    private Integer sum4;
    @Excel(name = "")
    private Integer sum5;
    @Excel(name = "")
    private Integer sum6;
    @Excel(name = "")
    private Integer bonus;
    @Excel(name = "")
    private Integer sumAll;
    @Excel(name = "")
    private Integer fullhouse;
    @Excel(name = "")
    private Integer fourKind;
    @Excel(name = "")
    private Integer smallStraight;
    @Excel(name = "")
    private Integer bigStraight;
    @Excel(name = "")
    private Integer yahtzee;

}