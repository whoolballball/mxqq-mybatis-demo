package mxqq.mybatis.demo.services;

import mxqq.mybatis.demo.api.UserApi;
import mxqq.mybatis.demo.repo.TTTTTT;
import mxqq.mybatis.demo.repo.UserRepo;
import mxqq.mybatis.demo.repo.entities.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Date;
import java.util.UUID;

@RestController
public class UserServices implements UserApi {

    @Autowired
    TTTTTT tttttt;

    @Autowired
    UserRepo userRepo;
    private String name = new Date().toString();

    public String getUser() {

        UserPO userPO = new UserPO();
        userPO.setId(UUID.randomUUID().toString());
        userPO.setName(name);

        this.userRepo.addUser(userPO);
        String clssName = this.getClass().getName();
        return this.userRepo.getUser() + "#" + clssName + "#";
    }

    @Override
    public String ttt() {
        String clssName = this.getClass().getName();
        return this.tttttt.getName() + "#" + clssName;
    }


}
