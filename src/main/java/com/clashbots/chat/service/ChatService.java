package com.clashbots.chat.service;

import com.clashbots.chat.entity.Chat;
import com.clashbots.chat.repository.ChatRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ChatService {
    @Autowired
    private ChatRepository chatRepository;

    public Chat saveChat(Chat chat) {
        log.info("inside save chat method of ChatService");
        return chatRepository.save(chat);
    }

    public Chat findChatById(Long chatId) {
        log.info("inside find chat by id method of ChatService");
        return chatRepository.findByChatId(chatId);
    }
}
