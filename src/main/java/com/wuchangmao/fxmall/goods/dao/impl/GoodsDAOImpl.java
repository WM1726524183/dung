package com.wuchangmao.fxmall.goods.dao.impl;
import com.wuchangmao.fxmall.goods.bean.WxbGood;
import com.wuchangmao.fxmall.goods.dao.IGoodsDAO;
import com.wuchangmao.fxmall.goods.mapper.GoodsMapper;
import com.wuchangmao.fxmall.info.ShiTi;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GoodsDAOImpl implements IGoodsDAO {
    @Autowired
    private SqlSession session;

    @Override
    public List<WxbGood> selectGoodsByPage(Integer page) throws Exception {
        //GoodsMapper mapper = MyBatisSessionFactoryUtils.getSession().getMapper(GoodsMapper.class);
        List<WxbGood> goods = session.getMapper(GoodsMapper.class).selectGoodsByPage(page, ShiTi.Page.PAGE_SIZE);
        return goods;
    }


}