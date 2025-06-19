// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = Success.SuccessSerializer.class)
@JsonDeserialize(using = Success.SuccessDeserializer.class)
public class Success {
  /** */
  private SuccessMessage message;

  public Success setMessage(SuccessMessage message) {
    this.message = message;
    return this;
  }

  public SuccessMessage getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Success that = (Success) o;
    return Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    return new ToStringer(Success.class).add("message", message).toString();
  }

  SuccessPb toPb() {
    SuccessPb pb = new SuccessPb();
    pb.setMessage(message);

    return pb;
  }

  static Success fromPb(SuccessPb pb) {
    Success model = new Success();
    model.setMessage(pb.getMessage());

    return model;
  }

  public static class SuccessSerializer extends JsonSerializer<Success> {
    @Override
    public void serialize(Success value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SuccessPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SuccessDeserializer extends JsonDeserializer<Success> {
    @Override
    public Success deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SuccessPb pb = mapper.readValue(p, SuccessPb.class);
      return Success.fromPb(pb);
    }
  }
}
