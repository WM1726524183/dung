package com.wuchangmao.fxmall.goods.service.impl;

import com.wuchangmao.fxmall.goods.bean.WxbGood;
import com.wuchangmao.fxmall.goods.dao.IGoodsDAO;
import com.wuchangmao.fxmall.goods.dao.impl.GoodsDAOImpl;
import com.wuchangmao.fxmall.goods.service.IGoodsService;
import com.wuchangmao.fxmall.info.ShiTi;

import java.util.List;

public class GoodsServiceImpl implements IGoodsService {
    private IGoodsDAO dao = new GoodsDAOImpl();
    @Override
    public List<WxbGood> selectGoodsByPage(Integer page) throws Exception {
        if (page < 1){
            throw new IndexOutOfBoundsException("页码不能小于1");
        }
        int index = (page-1) * ShiTi.Page.PAGE_SIZE;
        List<WxbGood> goods = dao.selectGoodsByPage(index);
        return goods;
    }
}
