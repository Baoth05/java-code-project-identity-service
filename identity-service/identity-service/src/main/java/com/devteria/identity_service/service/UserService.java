package com.devteria.identity_service.service;

import com.devteria.identity_service.dto.requesst.UserCraetionRequest;
import com.devteria.identity_service.dto.requesst.UserUpdateRequest;
import com.devteria.identity_service.entity.User;
import com.devteria.identity_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(UserCraetionRequest request) {
        User user = new User();

        if (userRepository.existsByUsername(request.getUsername())) {
            throw new RuntimeException("User name hiện tại đã có chủ hehe/ username existed ");
        }
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFistname(request.getFistname());
        user.setLastname(request.getLastname());
        user.setDob(request.getDob());

       return userRepository.save(user);
    }
    public void deleteUser(String userID) {
        userRepository.deleteById(userID);
    }
    public User updateUser(String userID, UserUpdateRequest request) {
        User user = getUser(userID);
        user.setPassword(request.getPassword());
        user.setFistname(request.getFistname());
        user.setLastname(request.getLastname());
        user.setDob(request.getDob());

        return userRepository.save(user);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }
    public User getUser(String id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("sai rồi ụm ơi "));
    }
}
