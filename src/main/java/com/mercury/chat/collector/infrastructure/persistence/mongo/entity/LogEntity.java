package com.mercury.chat.collector.infrastructure.persistence.mongo.entity;

import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@ToString
public class LogEntity implements Serializable {
    private String id;

    private String message;

    private LocalDateTime created;

    private LocalDateTime dateCreated;

    private LocalDateTime lastModified;
}
