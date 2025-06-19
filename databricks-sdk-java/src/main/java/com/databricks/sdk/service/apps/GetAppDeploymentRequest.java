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

/** Get an app deployment */
@Generated
@JsonSerialize(using = GetAppDeploymentRequest.GetAppDeploymentRequestSerializer.class)
@JsonDeserialize(using = GetAppDeploymentRequest.GetAppDeploymentRequestDeserializer.class)
public class GetAppDeploymentRequest {
  /** The name of the app. */
  private String appName;

  /** The unique id of the deployment. */
  private String deploymentId;

  public GetAppDeploymentRequest setAppName(String appName) {
    this.appName = appName;
    return this;
  }

  public String getAppName() {
    return appName;
  }

  public GetAppDeploymentRequest setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  public String getDeploymentId() {
    return deploymentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAppDeploymentRequest that = (GetAppDeploymentRequest) o;
    return Objects.equals(appName, that.appName) && Objects.equals(deploymentId, that.deploymentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, deploymentId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAppDeploymentRequest.class)
        .add("appName", appName)
        .add("deploymentId", deploymentId)
        .toString();
  }

  GetAppDeploymentRequestPb toPb() {
    GetAppDeploymentRequestPb pb = new GetAppDeploymentRequestPb();
    pb.setAppName(appName);
    pb.setDeploymentId(deploymentId);

    return pb;
  }

  static GetAppDeploymentRequest fromPb(GetAppDeploymentRequestPb pb) {
    GetAppDeploymentRequest model = new GetAppDeploymentRequest();
    model.setAppName(pb.getAppName());
    model.setDeploymentId(pb.getDeploymentId());

    return model;
  }

  public static class GetAppDeploymentRequestSerializer
      extends JsonSerializer<GetAppDeploymentRequest> {
    @Override
    public void serialize(
        GetAppDeploymentRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetAppDeploymentRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetAppDeploymentRequestDeserializer
      extends JsonDeserializer<GetAppDeploymentRequest> {
    @Override
    public GetAppDeploymentRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetAppDeploymentRequestPb pb = mapper.readValue(p, GetAppDeploymentRequestPb.class);
      return GetAppDeploymentRequest.fromPb(pb);
    }
  }
}
