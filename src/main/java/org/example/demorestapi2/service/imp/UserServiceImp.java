package org.example.demorestapi2.service.imp;

import lombok.AllArgsConstructor;
import org.example.demorestapi2.mapper.UserMapper;
import org.example.demorestapi2.model.dto.UserDTO;
import org.example.demorestapi2.model.entity.User;
import org.example.demorestapi2.repository.UserRepository;
import org.example.demorestapi2.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    public final UserRepository userRepository;
    private final UserMapper userMapper;
    UserDTO userDTO =new UserDTO();
    User user = new User();

    public UserServiceImp(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserDTO getUserById(Integer userId) {
        user =  userRepository.findUserById(userId);
        userDTO = userMapper.USER_DTO(user);
        return userDTO;
    }
}
