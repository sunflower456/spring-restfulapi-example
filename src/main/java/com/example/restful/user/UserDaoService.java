package com.example.restful.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private int usersCount = 3;
    static {
        users.add(new User(1, "sunflower1", new Date()));
        users.add(new User(2, "sunflower2", new Date()));
        users.add(new User(3, "sunflower3", new Date()));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(int id){
        for(User user:users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public User save(User user) {
        if(user.getId() == null){
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User deleteById(int id){
        Iterator<User> iterator = users.iterator();
        while(iterator.hasNext()){
            User user = iterator.next();
            if(user.getId() == id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }

    public User updateById(int id, User user){
        for(User user1:users){
            if(user1.getId() == id){
                user1.setName(user.getName());
                user1.setJoinDate(user.getJoinDate());
                return user1;
            }
        }
        return null;
    }
}
