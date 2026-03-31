package com.ngo.jaruratCare.service;

import org.springframework.stereotype.Service;

@Service
public class chatService {
    public String getReply(String message){
        if(message == null){
            return "Invalid message";
        }

        if(message.equalsIgnoreCase("Hi")){
            return "Hello";
        }
        else if(message.equalsIgnoreCase("Bye")){
            return "Goodbye";
        }
        else{
            return "Sorry, I did not understand that";
        }
    }
}
