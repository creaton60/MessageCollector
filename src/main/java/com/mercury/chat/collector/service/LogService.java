package com.mercury.chat.collector.service;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@XRayEnabled
public class LogService {

    public void insertGatewayRequestLog(String request) {
        log.info("Request Info : {}", request);
    }
}
