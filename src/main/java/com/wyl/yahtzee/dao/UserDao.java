
package com.wyl.yahtzee.dao;

        import com.baomidou.mybatisplus.core.mapper.BaseMapper;
        import com.wyl.yahtzee.entity.ScoreDetailEntity;
        import com.wyl.yahtzee.entity.ScoreEntity;
        import com.wyl.yahtzee.entity.UserEntity;
        import org.apache.ibatis.annotations.Mapper;
        import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao extends BaseMapper<UserEntity> {

}

