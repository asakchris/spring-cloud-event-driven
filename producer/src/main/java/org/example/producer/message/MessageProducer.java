package org.example.producer.message;

import java.time.LocalDateTime;
import java.util.function.Supplier;
import lombok.extern.slf4j.Slf4j;
import org.example.common.dto.Message;
import org.springframework.stereotype.Component;

@Component("producer")
@Slf4j
public class MessageProducer implements Supplier<Message> {

  @Override
  public Message get() {
    log.info("Sending new message");
    return new Message("New message generated at " + LocalDateTime.now());
  }
}
