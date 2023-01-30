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
public class ScoreExcel {
    @Excel(name = "")
    private Integer id;
    @Excel(name = "")
    private String name;
    @Excel(name = "")
    private Integer score;
    @Excel(name = "")
    private Date time;

}