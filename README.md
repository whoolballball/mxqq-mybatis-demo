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
    @MapperScan("mxqq.mybatis.demo.repo")
    public class AutoConfiguration {
    }
    
    引导项目被加载
