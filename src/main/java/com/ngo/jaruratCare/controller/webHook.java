package com.ngo.jaruratCare.controller;

import com.ngo.jaruratCare.dto.messageRequest;
import com.ngo.jaruratCare.service.chatService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class webHook {


    private final chatService chatservice;
    public webHook(chatService chatservice){
        this.chatservice = chatservice;
    }

    @PostMapping("/webhook")
    public String receiveMessage(@RequestBody messageRequest request){
        String msg = request.getMessage();
        System.out.println("Received message:" + msg); //logging

        return chatservice.getReply(msg);
    }
}
