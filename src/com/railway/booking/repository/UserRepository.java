package com.railway.booking.repository;


import com.railway.booking.model.User;

import java.util.ArrayList;
import java.util.List;


public class UserRepository {


    private List<User> users;


    public UserRepository(){

        users = new ArrayList<>();

    }



    public void save(User user){

        users.add(user);

    }



    public User findByUserId(int userId){


        for(User user : users){

            if(user.getUserId() == userId){

                return user;

            }

        }

        return null;

    }



    public List<User> findAll(){

        return users;

    }

}