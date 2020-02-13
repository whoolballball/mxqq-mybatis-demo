package mxqq.mybatis.demo.repo;


import mxqq.mybatis.demo.repo.entities.UserPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRepo {
    void addUser(UserPO userPO);

    String getUserCount();

    UserPO getUserById(String id);

    void addUserList(List<UserPO> list);
}
