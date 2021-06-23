package com.example.restful.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Transactional(readOnly=true)
    public List<User> findAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(int id){
        Optional<User> user = userRepository.findById(id);
        return user;
    }

    public void deleteById(int id){
        userRepository.deleteById(id);
    }

    public User save(User user){
        return userRepository.save(user);
    }
}
