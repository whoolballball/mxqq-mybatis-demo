package mxqq.mybatis.demo.services;

import mxqq.mybatis.demo.api.UserApi;
import mxqq.mybatis.demo.repo.TTTTTT;
import mxqq.mybatis.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServices implements UserApi {

    @Autowired
    TTTTTT tttttt;

    @Autowired
    UserRepo userRepo;

    public String getUser() {
        this.userRepo.addUser();
        String clssName = this.getClass().getName();
        return this.userRepo.getUser()+ "#" + clssName+"#";
    }

    @Override
    public String ttt() {
        String clssName = this.getClass().getName();
        return this.tttttt.getName()+"#" + clssName;
    }


}
