# mxqq-mybatis-demo
mybatis demo

整个项目来自mvn模板创建，根据功能拆分模块设计。
发布后的jar，按照约定部署在THOST目录下，并启动run.sh。

##### 注意项：

    在顶层依赖项目中，要添加META-INF/factories.xml文件，并配置启动配置：
    org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
      mxqq.mybatis.demo.config.AutoConfiguration
   
    并且在AutoConfiguration上添加注解：
    @ComponentScan(basePackages = {"mxqq.mybatis.demo.**"})
    @MapperScan("mxqq.mybatis.demo.repo") //指定mapper的package，必须，保证可以扫描到@Mapper注解
    public class AutoConfiguration {
    }

    引导项目被加载
--- 
yml配置文件在启动项中指定，配置文件中添加mapper文件路径：<br/>

        mybatis: mapper-locations: classpath:mappers/*Mapper.xml

---
在mapper.xml文件中，<mapper namespace="这里必须指定repo接口的package名，mybatis会根据该package和<sql>的id反射实现类"/>

        <mapper namespace="mxqq.mybatis.demo.repo.UserRepo">
        
       
