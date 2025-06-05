// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

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

/** Status information of an endpoint */
@Generated
@JsonSerialize(using = EndpointStatus.EndpointStatusSerializer.class)
@JsonDeserialize(using = EndpointStatus.EndpointStatusDeserializer.class)
public class EndpointStatus {
  /** Additional status message */
  private String message;

  /** Current state of the endpoint */
  private EndpointStatusState state;

  public EndpointStatus setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public EndpointStatus setState(EndpointStatusState state) {
    this.state = state;
    return this;
  }

  public EndpointStatusState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointStatus that = (EndpointStatus) o;
    return Objects.equals(message, that.message) && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, state);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointStatus.class)
        .add("message", message)
        .add("state", state)
        .toString();
  }

  EndpointStatusPb toPb() {
    EndpointStatusPb pb = new EndpointStatusPb();
    pb.setMessage(message);
    pb.setState(state);

    return pb;
  }

  static EndpointStatus fromPb(EndpointStatusPb pb) {
    EndpointStatus model = new EndpointStatus();
    model.setMessage(pb.getMessage());
    model.setState(pb.getState());

    return model;
  }

  public static class EndpointStatusSerializer extends JsonSerializer<EndpointStatus> {
    @Override
    public void serialize(EndpointStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EndpointStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EndpointStatusDeserializer extends JsonDeserializer<EndpointStatus> {
    @Override
    public EndpointStatus deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EndpointStatusPb pb = mapper.readValue(p, EndpointStatusPb.class);
      return EndpointStatus.fromPb(pb);
    }
  }
}
