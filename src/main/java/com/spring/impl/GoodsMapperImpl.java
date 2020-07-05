package com.spring.impl;

import com.spring.dao.GoodsMapper;
import com.spring.pojo.Goods;
import com.spring.pojo.GoodsExample;
import org.springframework.core.io.Resource;

import java.io.InputStream;
import java.util.List;

public class GoodsMapperImpl implements GoodsMapper {
    public long countByExample(GoodsExample example) {
        return 0;
    }

    public int deleteeByExample(GoodsExample example) {
        return 0;
    }

    public int insert(Goods record) {

        InputStream inputStream=Resource.getInputStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession=sqlSessionFactory.openSession();
        sqlSession.insert(record);

        sqlSession.commit();
        sqlSession.close();


        return 0;
    }

    public int insertSelective(Goods record) {
        return 0;
    }

    public List<Goods> selectByExample(GoodsExample example) {
        return null;
    }

    public int updateByExampleSelective(Goods record, GoodsExample example) {
        return 0;
    }

    public int updateByExample(Goods record, GoodsExample example) {
        return 0;
    }
}
