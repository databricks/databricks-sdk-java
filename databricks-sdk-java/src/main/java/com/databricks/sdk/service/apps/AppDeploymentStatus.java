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
@JsonSerialize(using = AppDeploymentStatus.AppDeploymentStatusSerializer.class)
@JsonDeserialize(using = AppDeploymentStatus.AppDeploymentStatusDeserializer.class)
public class AppDeploymentStatus {
  /** Message corresponding with the deployment state. */
  private String message;

  /** State of the deployment. */
  private AppDeploymentState state;

  public AppDeploymentStatus setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public AppDeploymentStatus setState(AppDeploymentState state) {
    this.state = state;
    return this;
  }

  public AppDeploymentState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppDeploymentStatus that = (AppDeploymentStatus) o;
    return Objects.equals(message, that.message) && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, state);
  }

  @Override
  public String toString() {
    return new ToStringer(AppDeploymentStatus.class)
        .add("message", message)
        .add("state", state)
        .toString();
  }

  AppDeploymentStatusPb toPb() {
    AppDeploymentStatusPb pb = new AppDeploymentStatusPb();
    pb.setMessage(message);
    pb.setState(state);

    return pb;
  }

  static AppDeploymentStatus fromPb(AppDeploymentStatusPb pb) {
    AppDeploymentStatus model = new AppDeploymentStatus();
    model.setMessage(pb.getMessage());
    model.setState(pb.getState());

    return model;
  }

  public static class AppDeploymentStatusSerializer extends JsonSerializer<AppDeploymentStatus> {
    @Override
    public void serialize(AppDeploymentStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AppDeploymentStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AppDeploymentStatusDeserializer
      extends JsonDeserializer<AppDeploymentStatus> {
    @Override
    public AppDeploymentStatus deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AppDeploymentStatusPb pb = mapper.readValue(p, AppDeploymentStatusPb.class);
      return AppDeploymentStatus.fromPb(pb);
    }
  }
}
