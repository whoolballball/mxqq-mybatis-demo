package mxqq.mybatis.demo.repo;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepo {
    void addUser();

    String getUser();
}
