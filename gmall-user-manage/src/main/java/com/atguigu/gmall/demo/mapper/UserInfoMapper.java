package com.atguigu.gmall.demo.mapper;

import com.atguigu.gmall.demo.bean.UserInfo;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author admin
 * @create 2019-12-24 19:57
 */
public interface UserInfoMapper extends Mapper<UserInfo> {

    //查询所有用户信息
   // List<UserInfo> findAll();
}
