package org.example.demorestapi2.mapper;

import org.example.demorestapi2.model.dto.UserDTO;
import org.example.demorestapi2.model.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserDTO USER_DTO(User user);
}
