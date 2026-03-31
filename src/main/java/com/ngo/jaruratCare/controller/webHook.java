package com.ngo.jaruratCare.controller;

import com.ngo.jaruratCare.dto.messageRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class webHook {
    @PostMapping("/webhook")
    public String receiveMessage(@RequestBody messageRequest request){
        String msg = request.getMessage();
        System.out.println("Received message:" + msg);

        //chatbox logic

        if(msg.equalsIgnoreCase("Hi")){
            return "Hello";
        }
        else if(msg.equalsIgnoreCase("Bye")){
            return "Goodbye";
        }
        else{
            return "Sorry, I did not understant that";
        }
    }
}
