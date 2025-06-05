// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

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
@JsonSerialize(
    using = GetPublishedAppIntegrationOutput.GetPublishedAppIntegrationOutputSerializer.class)
@JsonDeserialize(
    using = GetPublishedAppIntegrationOutput.GetPublishedAppIntegrationOutputDeserializer.class)
public class GetPublishedAppIntegrationOutput {
  /** App-id of the published app integration */
  private String appId;

  /** */
  private String createTime;

  /** */
  private Long createdBy;

  /** Unique integration id for the published OAuth app */
  private String integrationId;

  /** Display name of the published OAuth app */
  private String name;

  /** Token access policy */
  private TokenAccessPolicy tokenAccessPolicy;

  public GetPublishedAppIntegrationOutput setAppId(String appId) {
    this.appId = appId;
    return this;
  }

  public String getAppId() {
    return appId;
  }

  public GetPublishedAppIntegrationOutput setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public GetPublishedAppIntegrationOutput setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public Long getCreatedBy() {
    return createdBy;
  }

  public GetPublishedAppIntegrationOutput setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  public String getIntegrationId() {
    return integrationId;
  }

  public GetPublishedAppIntegrationOutput setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetPublishedAppIntegrationOutput setTokenAccessPolicy(
      TokenAccessPolicy tokenAccessPolicy) {
    this.tokenAccessPolicy = tokenAccessPolicy;
    return this;
  }

  public TokenAccessPolicy getTokenAccessPolicy() {
    return tokenAccessPolicy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPublishedAppIntegrationOutput that = (GetPublishedAppIntegrationOutput) o;
    return Objects.equals(appId, that.appId)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(integrationId, that.integrationId)
        && Objects.equals(name, that.name)
        && Objects.equals(tokenAccessPolicy, that.tokenAccessPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, createTime, createdBy, integrationId, name, tokenAccessPolicy);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPublishedAppIntegrationOutput.class)
        .add("appId", appId)
        .add("createTime", createTime)
        .add("createdBy", createdBy)
        .add("integrationId", integrationId)
        .add("name", name)
        .add("tokenAccessPolicy", tokenAccessPolicy)
        .toString();
  }

  GetPublishedAppIntegrationOutputPb toPb() {
    GetPublishedAppIntegrationOutputPb pb = new GetPublishedAppIntegrationOutputPb();
    pb.setAppId(appId);
    pb.setCreateTime(createTime);
    pb.setCreatedBy(createdBy);
    pb.setIntegrationId(integrationId);
    pb.setName(name);
    pb.setTokenAccessPolicy(tokenAccessPolicy);

    return pb;
  }

  static GetPublishedAppIntegrationOutput fromPb(GetPublishedAppIntegrationOutputPb pb) {
    GetPublishedAppIntegrationOutput model = new GetPublishedAppIntegrationOutput();
    model.setAppId(pb.getAppId());
    model.setCreateTime(pb.getCreateTime());
    model.setCreatedBy(pb.getCreatedBy());
    model.setIntegrationId(pb.getIntegrationId());
    model.setName(pb.getName());
    model.setTokenAccessPolicy(pb.getTokenAccessPolicy());

    return model;
  }

  public static class GetPublishedAppIntegrationOutputSerializer
      extends JsonSerializer<GetPublishedAppIntegrationOutput> {
    @Override
    public void serialize(
        GetPublishedAppIntegrationOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPublishedAppIntegrationOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPublishedAppIntegrationOutputDeserializer
      extends JsonDeserializer<GetPublishedAppIntegrationOutput> {
    @Override
    public GetPublishedAppIntegrationOutput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPublishedAppIntegrationOutputPb pb =
          mapper.readValue(p, GetPublishedAppIntegrationOutputPb.class);
      return GetPublishedAppIntegrationOutput.fromPb(pb);
    }
  }
}
