package org.example.common.dto.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;
import org.example.common.dto.Message;

public class MessageDeserializer implements Deserializer<Message> {
  private final ObjectMapper mapper = new ObjectMapper();

  @Override
  public Message deserialize(String topic, byte[] data) {
    try {
      return mapper.readValue(new String(data), Message.class);
    } catch (JsonProcessingException e) {
      throw new SerializationException(e);
    }
  }
}
