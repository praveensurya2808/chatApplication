package com.chat.app.controller;

import com.chat.app.model.chatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class chatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public chatMessage sendMessage(chatMessage message){
        return message;
    }

    @GetMapping("chat")
    public String getMessage(){
        return "chat";
    }
}
