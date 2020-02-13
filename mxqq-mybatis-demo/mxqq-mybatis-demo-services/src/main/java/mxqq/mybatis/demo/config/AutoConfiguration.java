package mxqq.mybatis.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"mxqq.mybatis.demo.**"})
@MapperScan("mxqq.mybatis.demo.repo")
public class AutoConfiguration {
}
