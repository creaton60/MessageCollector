package com.mercury.chat.collector.application.port.outgoing;

import com.mercury.chat.collector.domain.Log;

public interface SaveLogPort {
    void saveLog(Log log);
}
