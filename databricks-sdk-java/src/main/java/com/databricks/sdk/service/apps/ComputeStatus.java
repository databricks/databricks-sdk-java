// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

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
@JsonSerialize(using = ComputeStatus.ComputeStatusSerializer.class)
@JsonDeserialize(using = ComputeStatus.ComputeStatusDeserializer.class)
public class ComputeStatus {
  /** Compute status message */
  private String message;

  /** State of the app compute. */
  private ComputeState state;

  public ComputeStatus setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public ComputeStatus setState(ComputeState state) {
    this.state = state;
    return this;
  }

  public ComputeState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ComputeStatus that = (ComputeStatus) o;
    return Objects.equals(message, that.message) && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, state);
  }

  @Override
  public String toString() {
    return new ToStringer(ComputeStatus.class)
        .add("message", message)
        .add("state", state)
        .toString();
  }

  ComputeStatusPb toPb() {
    ComputeStatusPb pb = new ComputeStatusPb();
    pb.setMessage(message);
    pb.setState(state);

    return pb;
  }

  static ComputeStatus fromPb(ComputeStatusPb pb) {
    ComputeStatus model = new ComputeStatus();
    model.setMessage(pb.getMessage());
    model.setState(pb.getState());

    return model;
  }

  public static class ComputeStatusSerializer extends JsonSerializer<ComputeStatus> {
    @Override
    public void serialize(ComputeStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ComputeStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ComputeStatusDeserializer extends JsonDeserializer<ComputeStatus> {
    @Override
    public ComputeStatus deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ComputeStatusPb pb = mapper.readValue(p, ComputeStatusPb.class);
      return ComputeStatus.fromPb(pb);
    }
  }
}
