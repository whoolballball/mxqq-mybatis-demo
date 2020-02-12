package mxqq.mybatis.demo.api;

import org.springframework.web.bind.annotation.GetMapping;

public interface UserApi {
    @GetMapping("/user")
    String getUser();
}
