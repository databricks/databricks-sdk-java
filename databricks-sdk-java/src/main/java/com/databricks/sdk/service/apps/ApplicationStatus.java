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
@JsonSerialize(using = ApplicationStatus.ApplicationStatusSerializer.class)
@JsonDeserialize(using = ApplicationStatus.ApplicationStatusDeserializer.class)
public class ApplicationStatus {
  /** Application status message */
  private String message;

  /** State of the application. */
  private ApplicationState state;

  public ApplicationStatus setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public ApplicationStatus setState(ApplicationState state) {
    this.state = state;
    return this;
  }

  public ApplicationState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ApplicationStatus that = (ApplicationStatus) o;
    return Objects.equals(message, that.message) && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, state);
  }

  @Override
  public String toString() {
    return new ToStringer(ApplicationStatus.class)
        .add("message", message)
        .add("state", state)
        .toString();
  }

  ApplicationStatusPb toPb() {
    ApplicationStatusPb pb = new ApplicationStatusPb();
    pb.setMessage(message);
    pb.setState(state);

    return pb;
  }

  static ApplicationStatus fromPb(ApplicationStatusPb pb) {
    ApplicationStatus model = new ApplicationStatus();
    model.setMessage(pb.getMessage());
    model.setState(pb.getState());

    return model;
  }

  public static class ApplicationStatusSerializer extends JsonSerializer<ApplicationStatus> {
    @Override
    public void serialize(ApplicationStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ApplicationStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ApplicationStatusDeserializer extends JsonDeserializer<ApplicationStatus> {
    @Override
    public ApplicationStatus deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ApplicationStatusPb pb = mapper.readValue(p, ApplicationStatusPb.class);
      return ApplicationStatus.fromPb(pb);
    }
  }
}
