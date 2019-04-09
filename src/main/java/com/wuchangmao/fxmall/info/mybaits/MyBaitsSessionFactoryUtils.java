package com.wuchangmao.fxmall.info.mybaits;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBaitsSessionFactoryUtils {
    /**
     * 饿汉单例
     */
    public static SqlSessionFactory sqlSessionFactory;
    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<>();
    static {
        initSessionFactory();
    }
    private static void initSessionFactory(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis.cfg.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSessionFactory getSqlSessionFactory(){
        if (sqlSessionFactory == null){
            initSessionFactory();
        }
        return sqlSessionFactory;
    }
    public static SqlSession getSession(){
        System.out.println(Thread.currentThread().getName());
        SqlSession sqlSession = threadLocal.get();
        if (sqlSession == null){
            sqlSession = sqlSessionFactory.openSession();
            threadLocal.set(sqlSession);
        }
        return sqlSession;
    }
}

