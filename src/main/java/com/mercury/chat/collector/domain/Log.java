package com.mercury.chat.collector.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
@Builder
public class Log {
    private final String id;
    private final String message;
    private final LocalDateTime created;
}
