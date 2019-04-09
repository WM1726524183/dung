package com.wuchangmao.fxmall.goods.dao;

import com.wuchangmao.fxmall.goods.bean.WxbGood;

import java.util.List;

public interface IGoodsDAO {
    List<WxbGood> selectGoodsByPage(Integer page) throws Exception;
}
