package org.example.demorestapi2.service;

import org.example.demorestapi2.model.dto.UserDTO;
import org.example.demorestapi2.model.entity.User;

public interface UserService {

    UserDTO getUserById(Integer userId);
}
