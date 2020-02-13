package mxqq.mybatis.demo.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import mxqq.mybatis.demo.api.UserApi;
import mxqq.mybatis.demo.entities.enums.EnmUserStates;
import mxqq.mybatis.demo.repo.UserRepo;
import mxqq.mybatis.demo.repo.entities.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
public class UserServices implements UserApi {


    @Autowired
    UserRepo userRepo;
    private String name = new Date().toString();

    public String getUser() throws JsonProcessingException {

        UserPO userPO = new UserPO();
        userPO.setId(UUID.randomUUID().toString());
        userPO.setName(name);
        userPO.setState(EnmUserStates.Disable);

        this.userRepo.addUser(userPO);

        String count = this.userRepo.getUserCount();
        UserPO userPO1 = this.userRepo.getUserById(userPO.getId());

        ObjectMapper objectMapper = new ObjectMapper();
        String newUser = objectMapper.writeValueAsString(userPO1);

        return String.format("[%s] %s", count, newUser);
    }


    @Override
    public String addUserList() {

        List<UserPO> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserPO userPO = new UserPO();
            userPO.setName(String.valueOf(i));
            userPO.setId(UUID.randomUUID().toString());
            userPO.setState(EnmUserStates.None);

            list.add(userPO);
        }

         this.userRepo.addUserList(list);
        return "CG";
    }

}
