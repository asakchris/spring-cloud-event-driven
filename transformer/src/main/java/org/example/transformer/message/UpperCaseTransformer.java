package org.example.transformer.message;

import java.util.function.Function;
import lombok.extern.slf4j.Slf4j;
import org.example.common.dto.Message;
import org.springframework.stereotype.Component;

@Component("transformer")
@Slf4j
public class UpperCaseTransformer implements Function<Message, Message> {

  @Override
  public Message apply(Message message) {
    log.info("Received message: {}", message);
    return new Message(message.message().toUpperCase());
  }
}
