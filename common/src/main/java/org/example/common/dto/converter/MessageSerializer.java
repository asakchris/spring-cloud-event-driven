package org.example.common.dto.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Serializer;
import org.example.common.dto.Message;

public class MessageSerializer implements Serializer<Message> {

  private final ObjectMapper mapper = new ObjectMapper();

  @Override
  public byte[] serialize(String topic, Message message) {
    try {
      return mapper.writeValueAsBytes(message);
    } catch (JsonProcessingException e) {
      throw new SerializationException(e);
    }
  }
}
