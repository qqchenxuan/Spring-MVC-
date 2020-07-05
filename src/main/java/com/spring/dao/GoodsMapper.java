package com.spring.dao;

import com.spring.pojo.Goods;
import com.spring.pojo.GoodsExample;

import java.util.List;

public interface GoodsMapper {
    long countByExample(GoodsExample example);

    int deleteeByExample(GoodsExample example);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);

    int updateByExampleSelective(@Param("record") Goods record,@Param("example") GoodsExample example);

    int updateByExample(@Param("recerd") Goods record,@Param("example") GoodsExample example);
}
