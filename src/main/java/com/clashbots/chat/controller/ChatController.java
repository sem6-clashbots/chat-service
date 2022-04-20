package com.clashbots.chat.controller;

import com.clashbots.chat.entity.Chat;
import com.clashbots.chat.service.ChatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chats")
@Slf4j
public class ChatController {
    @Autowired
    private ChatService chatService;

    @PostMapping("/")
    public Chat saveChat(@RequestBody Chat chat){
        log.info("inside save chat method of ChatController");
        return chatService.saveChat(chat);
    }

    @GetMapping("/{id}")
    public Chat findChatById(@PathVariable("id") Long userId){
        log.info("inside find chat by id method of ChatController");
        return chatService.findChatById(userId);
    }

//    private RabbitmqSender rabbitMqSender;
//    @Autowired
//    public ChatController(RabbitmqSender rabbitMqSender) {
//        this.rabbitMqSender = rabbitMqSender;
//    }
//
//    @GetMapping("/rabbitmq/contract/{id}")
//    public String testRabbitmqContract(@PathVariable("id") Long userId) {
//        log.info("inside find user by id with contract method of UserController");
//        rabbitMqSender.send(userId);
//        return "Message has been sent Successfully: " + userId;
//    }
}
