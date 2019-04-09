package com.wuchangmao.fxmall.goods.mapper;

import com.wuchangmao.fxmall.goods.bean.WxbGood;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    List<WxbGood> selectGoodsByPage(@Param("index") Integer index,@Param("size") Integer size );
}
