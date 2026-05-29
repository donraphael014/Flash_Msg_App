package io.github.donraphael014.FlashMsg.controller;


import io.github.donraphael014.FlashMsg.entites.Message;
import io.github.donraphael014.FlashMsg.service.MessageService;
import io.github.donraphael014.FlashMsg.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import java.util.Objects;

@Controller
@RequiredArgsConstructor
public class ChatController {

    private final UserService userService;
    private final MessageService messageService;

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public Message sendMessage(Message message) {
        var sender = userService.createOrGetUser(message.getSender().getUsername());
        message.setSender(sender);
        return messageService.saveMessage(message);
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public Message addUser(@Payload Message message, SimpMessageHeaderAccessor headerAccessor) {
        var username = message.getSender().getUsername();
        var user = userService.findByUsername(username);
        message.setSender(user);

        Objects.requireNonNull(headerAccessor.getSessionAttributes()).put("username", username);
        return message;
    }

    @MessageMapping("/chat.typing")
    @SendTo("/topic/public")
    public Message typing(@Payload Message message) {
        return message;
    }
}