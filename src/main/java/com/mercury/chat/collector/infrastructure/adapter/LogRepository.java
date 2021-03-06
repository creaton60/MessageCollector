package com.mercury.chat.collector.infrastructure.adapter;

import com.mercury.chat.collector.application.port.outgoing.SaveLogPort;
import com.mercury.chat.collector.domain.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class LogRepository implements SaveLogPort {
    @Override
    public void saveLog(Log log) {

    }
}
