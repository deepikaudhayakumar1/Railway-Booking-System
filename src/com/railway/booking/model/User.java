package com.railway.booking.model;

public class User {
    private int userId;
    private String username;
    private String email;
    private String password;


    public User(int userId, String username,
                String email, String password){

        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
    }


    public void displayUser(){

        System.out.println("User ID: " + userId);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }


    public int getUserId(){
        return userId;
    }
}
