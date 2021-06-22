package com.example.restful.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Transactional(readOnly=true)
    public List<User> findAll(){
        return userRepository.findAll();
    }
}
