package com.mercury.chat.collector.ui.controller;

import com.mercury.chat.collector.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logs")
public class LogController {

    private final LogService logService;

    @Autowired
    public LogController(LogService logService) {
        this.logService = logService;
    }

    @PostMapping("")
    public ResponseEntity<Void> createLog() {
        logService.insertGatewayRequestLog("Request");

        return ResponseEntity.ok().build();
    }
}
