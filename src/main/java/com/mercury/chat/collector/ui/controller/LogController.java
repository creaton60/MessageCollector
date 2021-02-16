package com.mercury.chat.collector.ui.controller;

import com.mercury.chat.collector.application.port.incoming.CreateLogUseCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/logs")
public class LogController {
    private final CreateLogUseCase createLogUseCase;

    @Autowired
    public LogController(CreateLogUseCase createLogUseCase) {
        this.createLogUseCase = createLogUseCase;
    }

    @PostMapping("")
    public ResponseEntity<Void> createLog() {
        var query = new CreateLogUseCase.CreateLogQuery("");

        createLogUseCase.insertCreateLog(query);

        return ResponseEntity.ok().build();
    }
}
