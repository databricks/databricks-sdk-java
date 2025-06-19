// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(using = MessageError.MessageErrorSerializer.class)
@JsonDeserialize(using = MessageError.MessageErrorDeserializer.class)
public class MessageError {
  /** */
  private String error;

  /** */
  private MessageErrorType typeValue;

  public MessageError setError(String error) {
    this.error = error;
    return this;
  }

  public String getError() {
    return error;
  }

  public MessageError setType(MessageErrorType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public MessageErrorType getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MessageError that = (MessageError) o;
    return Objects.equals(error, that.error) && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(MessageError.class)
        .add("error", error)
        .add("typeValue", typeValue)
        .toString();
  }

  MessageErrorPb toPb() {
    MessageErrorPb pb = new MessageErrorPb();
    pb.setError(error);
    pb.setType(typeValue);

    return pb;
  }

  static MessageError fromPb(MessageErrorPb pb) {
    MessageError model = new MessageError();
    model.setError(pb.getError());
    model.setType(pb.getType());

    return model;
  }

  public static class MessageErrorSerializer extends JsonSerializer<MessageError> {
    @Override
    public void serialize(MessageError value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MessageErrorPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MessageErrorDeserializer extends JsonDeserializer<MessageError> {
    @Override
    public MessageError deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MessageErrorPb pb = mapper.readValue(p, MessageErrorPb.class);
      return MessageError.fromPb(pb);
    }
  }
}
