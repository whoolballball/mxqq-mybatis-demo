package mxqq.mybatis.demo.repo;


import mxqq.mybatis.demo.repo.entities.UserPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepo {
    void addUser(UserPO userPO);

    String getUser();
}
