package com.chat.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class chatMessage {
    private long id;

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    private String sender;
    private String content;
}
