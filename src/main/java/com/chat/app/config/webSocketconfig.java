package com.chat.app.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketTransportRegistration;

import java.net.http.WebSocket;

@Configuration
@EnableWebSocketMessageBroker
public class webSocketconfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
       registry.addEndpoint("/chat")//this is the endpoint where we handle the chat
               .setAllowedOrigins("http://localhost:8081")//kind of security not third party allowed
               .withSockJS();//allowed clients who dont have websockets

    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic");//whoever have access for this  can  get the message
        registry.setApplicationDestinationPrefixes("/app");
    }
}
