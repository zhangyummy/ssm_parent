package com.zyu.dao;

import com.zyu.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

/**
 * 帐户dao接口
 */
public interface AccountDao {

    // 查询所有账户
    @Select("select * from account")
    List<Account> findAll();

    // 保存帐户信息
    //@SelectKey(keyProperty = "id", before = true, resultType = Integer.class, statement = "select s_account.nextval from dual")
    //@Insert("insert into account (id,name,money) values (#{id}, #{name}, #{money})")
    @Insert("insert into account (name,money) values (#{name}, #{money})")
    void saveAccount(Account account);


}
