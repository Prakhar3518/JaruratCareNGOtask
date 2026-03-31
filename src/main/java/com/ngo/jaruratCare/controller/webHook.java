package com.ngo.jaruratCare.controller;

import com.ngo.jaruratCare.dto.messageRequest;
import com.ngo.jaruratCare.service.chatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class webHook {

    private static final Logger logger = LoggerFactory.getLogger(webHook.class);


    private final chatService chatservice;
    public webHook(chatService chatservice){
        this.chatservice = chatservice;
    }

    @PostMapping("/webhook")
    public String receiveMessage(@RequestBody messageRequest request){
        String msg = request.getMessage();

        // Log incoming message
        logger.info("Received message: {}", msg);

        String reply = chatservice.getReply(msg);

        // Log outgoing response
        logger.info("Sending reply: {}", reply);

        return reply;

    }
}
