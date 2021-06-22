package com.example.restful.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jpa")
public class UserJpaController {

    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return userService.findAll();
    }
//    @GetMapping("/users/{id}")
//    public EntityModel<User> retrieveUser(@PathVariable int id){
//        Optional<User> user = userRepository.findById(id);
//        if(!user.isPresent()){
//            throw new UserNotFoundException(String.format("ID[%s] is not found", id));
//        }
//
//        EntityModel<User> model = new EntityModel(user);
//        WebMvcLinkBuilder linkTo = WebMvcLinkBuilder
//                .linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).retrieveAllUsers());
//        model.add(linkTo.withRel("all-users"));
//        return model;
//    }
//
//    @DeleteMapping("/users/{id}")
//    public void deleteUser(@PathVariable int id){
//        userRepository.deleteById(id);
//    }
}
