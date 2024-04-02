package org.example.demorestapi2.config;

import org.example.demorestapi2.mapper.UserMapper;
import org.example.demorestapi2.mapper.UserMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserBeanConfig {
    @Bean
    public UserMapper userMapper(){
        return new UserMapperImpl();
    }
}
