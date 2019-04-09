package com.wuchangmao.fxmall.goods.service;

import com.wuchangmao.fxmall.goods.bean.WxbGood;

import java.util.List;

public interface IGoodsService {
    List<WxbGood> selectGoodsByPage(Integer page)throws Exception;
}
