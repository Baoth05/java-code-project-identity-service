package com.devteria.identity_service.controller;

import com.devteria.identity_service.dto.requesst.UserCraetionRequest;
import com.devteria.identity_service.dto.requesst.UserUpdateRequest;
import com.devteria.identity_service.entity.User;
import com.devteria.identity_service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/users")



public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping()
    User createUser(@RequestBody @Valid UserCraetionRequest request) {
        return userService.createUser(request);
    }
    @GetMapping()
    List<User> getUsers(){
      return   userService.getUsers();
    }

    @GetMapping("/{userID}")
    User getUser(@PathVariable("userID") String userID){
        return userService.getUser(userID);

    }
    @PutMapping("/{userID}")
    User updateUser(@PathVariable String userID, @RequestBody UserUpdateRequest request) {
        return userService.updateUser(userID, request);
    }
    @DeleteMapping("/{userID}")
    String deleteUser(@PathVariable("userID") String userID){
        userService.deleteUser(userID);
        return " đã xóa hoàn thành";
    }

}
