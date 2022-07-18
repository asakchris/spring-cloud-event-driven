package org.example.consumer.message;

import java.util.function.Consumer;
import lombok.extern.slf4j.Slf4j;
import org.example.common.dto.Message;
import org.springframework.stereotype.Component;

@Component("consumer")
@Slf4j
public class MessageConsumer implements Consumer<Message> {

  @Override
  public void accept(Message message) {
    log.info("Received new message: {}", message);
  }
}
