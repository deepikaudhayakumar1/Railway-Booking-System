package com.railway.booking.service;


import com.railway.booking.model.User;
import com.railway.booking.repository.UserRepository;

import java.util.List;


public class UserService {


    private UserRepository userRepository;



    public UserService(){

        userRepository = new UserRepository();

    }



    // Register User

    public void registerUser(User user){

        userRepository.save(user);

        System.out.println("User Registered Successfully");

    }



    // Display Users

    public void displayUsers(){


        List<User> users = userRepository.findAll();


        for(User user : users){

            System.out.println("----------------");
            user.displayUser();

        }

    }



    // Find User

    public User getUserById(int userId){

        return userRepository.findByUserId(userId);

    }

}