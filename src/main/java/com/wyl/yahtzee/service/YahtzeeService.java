package com.wyl.yahtzee.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wyl.yahtzee.entity.ScoreDetailEntity;
import com.wyl.yahtzee.entity.vo.ScoreVo;

/**
 * 
 *
 * @author GaleForceWYL 1205443857@qq.com
 * @since 1.0.0 2023-01-14
 */
public interface YahtzeeService {

    void store(ScoreVo score);


}