package com.mercury.chat.collector.application.port.incoming;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

public interface CreateLogUseCase {
    void insertCreateLog(CreateLogQuery query);

    @NoArgsConstructor
    @EqualsAndHashCode(callSuper = false)
    @Getter
    @ToString
    class CreateLogQuery {
        private String log;

        public CreateLogQuery(String log) {
            this.log = log;
        }
    }
}
