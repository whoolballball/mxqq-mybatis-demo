package mxqq.mybatis.demo.services;

import mxqq.mybatis.demo.api.UserApi;
import mxqq.mybatis.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServices implements UserApi {

    @Autowired
    UserRepo userRepo;

    public String getUser() {
        String clssName = this.getClass().getName();
        return "#" + clssName;
    }

}
