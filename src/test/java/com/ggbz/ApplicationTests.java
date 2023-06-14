package com.ggbz;

import com.ggbz.sys.entity.User;
import com.ggbz.sys.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class ApplicationTests {
    @Resource
    private UserMapper userMapper;
    @Test
    public void contextLoads(){
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
}
