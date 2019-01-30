package com.gexiao.userservice.service;

import com.gexiao.userservice.dao.UserRepository;
import com.gexiao.userservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author gexiao
 * @date 2019/1/30 11:09
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }

    public User findById(long id) {
        return userRepository.findById(id).orElseGet(null);
    }

    public List<User> list(){
        return userRepository.findAll();
    }
}
