package com.wyl.yahtzee.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wyl.yahtzee.dao.ScoreDao;
import com.wyl.yahtzee.dao.ScoreDetailDao;
import com.wyl.yahtzee.dao.UserDao;
import com.wyl.yahtzee.entity.ScoreDetailEntity;
import com.wyl.yahtzee.entity.ScoreEntity;
import com.wyl.yahtzee.entity.UserEntity;
import com.wyl.yahtzee.entity.vo.ScoreVo;
import com.wyl.yahtzee.entity.vo.registerVo;
import com.wyl.yahtzee.service.YahtzeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 *
 * @author GaleForceWYL 1205443857@qq.com
 * @since 1.0.0 2023-01-14
 */

@Service
public class YahtzeeServiceImpl  implements YahtzeeService {

    @Autowired
    private ScoreDetailDao detailDao;

    @Autowired
    private ScoreDao scoreaDao;

    @Autowired
    private UserDao userDao;

    @Override
    public void store(ScoreVo score) {
        ScoreDetailEntity detail = new ScoreDetailEntity();
        ScoreEntity entity = new ScoreEntity();
        //插入基本信息
        Date dateTime = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = format.format(dateTime);
        entity.setName(score.getName());
        entity.setTime(date);
        entity.setScore(score.getScore());
        //获取id，便于与detail表关联
        scoreaDao.insert(entity);

        entity = scoreaDao.selectOne(
                new LambdaQueryWrapper<ScoreEntity>()
                        .eq(ScoreEntity::getName, score.getName())
                        .eq(ScoreEntity::getScore,score.getScore())
                        .eq(ScoreEntity::getTime, date)
        );

        detail.setBonus(score.getBonus());
        detail.setBigStraight(score.getBigStraight());
        detail.setFourKind(score.getFourKind());
        detail.setFullhouse(score.getFullHouse());
        detail.setYahtzee(score.getYahtzee());
        detail.setScoreId(entity.getId());
        detail.setSmallStraight(score.getSmallStraight());
        detail.setSum1(score.getSum1());
        detail.setSum2(score.getSum2());
        detail.setSum3(score.getSum3());
        detail.setSum4(score.getSum4());
        detail.setSum5(score.getSum5());
        detail.setSum6(score.getSum6());
        detail.setSumAll(score.getSumAll());
        detailDao.insert(detail);
    }

    /**
     * 注册功能
     */
    @Override
    public int register(registerVo vo) {
        //判断是否已有重复用户名
        if(userDao.exists(new LambdaQueryWrapper<UserEntity>().eq(UserEntity::getName, vo.getUsername()))){
            return -1;}
        if(vo.getPassword().length()<6){
            return -2;
        }
        UserEntity entity = new UserEntity();
        entity.setHidden("no");
        entity.setInvite("neice");
        entity.setVip("no");
        entity.setName(vo.getUsername());
        entity.setPassword(vo.getPassword());
        userDao.insert(entity);
        return 1;
    }


}