package org.example.demorestapi2.controller;

import lombok.AllArgsConstructor;
import org.example.demorestapi2.model.entity.User;
import org.example.demorestapi2.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {
    public final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable("id") Integer userId){
        return ResponseEntity.ok(userService.getUserById(userId));
    }
}
