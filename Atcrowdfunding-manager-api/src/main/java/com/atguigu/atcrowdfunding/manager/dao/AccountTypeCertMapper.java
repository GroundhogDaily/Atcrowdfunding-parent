package com.atguigu.atcrowdfunding.manager.dao;

import com.atguigu.atcrowdfunding.bean.AccountTypeCert;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountTypeCertMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AccountTypeCert record);

    AccountTypeCert selectByPrimaryKey(Integer id);

    List<AccountTypeCert> selectAll();

    int updateByPrimaryKey(AccountTypeCert record);
}