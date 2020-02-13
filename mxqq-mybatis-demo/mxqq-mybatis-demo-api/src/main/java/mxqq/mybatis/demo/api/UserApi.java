package mxqq.mybatis.demo.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.GetMapping;

public interface UserApi {
    @GetMapping("/user")
    String getUser() throws JsonProcessingException;

    @GetMapping("/asa")
    String addUserList();
}
