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

/** Create an app deployment */
@Generated
@JsonSerialize(using = CreateAppDeploymentRequest.CreateAppDeploymentRequestSerializer.class)
@JsonDeserialize(using = CreateAppDeploymentRequest.CreateAppDeploymentRequestDeserializer.class)
public class CreateAppDeploymentRequest {
  /** */
  private AppDeployment appDeployment;

  /** The name of the app. */
  private String appName;

  public CreateAppDeploymentRequest setAppDeployment(AppDeployment appDeployment) {
    this.appDeployment = appDeployment;
    return this;
  }

  public AppDeployment getAppDeployment() {
    return appDeployment;
  }

  public CreateAppDeploymentRequest setAppName(String appName) {
    this.appName = appName;
    return this;
  }

  public String getAppName() {
    return appName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateAppDeploymentRequest that = (CreateAppDeploymentRequest) o;
    return Objects.equals(appDeployment, that.appDeployment)
        && Objects.equals(appName, that.appName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDeployment, appName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAppDeploymentRequest.class)
        .add("appDeployment", appDeployment)
        .add("appName", appName)
        .toString();
  }

  CreateAppDeploymentRequestPb toPb() {
    CreateAppDeploymentRequestPb pb = new CreateAppDeploymentRequestPb();
    pb.setAppDeployment(appDeployment);
    pb.setAppName(appName);

    return pb;
  }

  static CreateAppDeploymentRequest fromPb(CreateAppDeploymentRequestPb pb) {
    CreateAppDeploymentRequest model = new CreateAppDeploymentRequest();
    model.setAppDeployment(pb.getAppDeployment());
    model.setAppName(pb.getAppName());

    return model;
  }

  public static class CreateAppDeploymentRequestSerializer
      extends JsonSerializer<CreateAppDeploymentRequest> {
    @Override
    public void serialize(
        CreateAppDeploymentRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateAppDeploymentRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateAppDeploymentRequestDeserializer
      extends JsonDeserializer<CreateAppDeploymentRequest> {
    @Override
    public CreateAppDeploymentRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateAppDeploymentRequestPb pb = mapper.readValue(p, CreateAppDeploymentRequestPb.class);
      return CreateAppDeploymentRequest.fromPb(pb);
    }
  }
}
