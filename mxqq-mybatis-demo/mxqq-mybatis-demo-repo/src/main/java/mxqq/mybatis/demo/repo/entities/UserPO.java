package mxqq.mybatis.demo.repo.entities;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("userPO2")
public class UserPO {
    public String id;
    public String name;
}
