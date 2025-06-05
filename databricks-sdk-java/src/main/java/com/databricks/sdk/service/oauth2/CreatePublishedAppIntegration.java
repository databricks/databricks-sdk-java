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
@JsonSerialize(using = CreatePublishedAppIntegration.CreatePublishedAppIntegrationSerializer.class)
@JsonDeserialize(
    using = CreatePublishedAppIntegration.CreatePublishedAppIntegrationDeserializer.class)
public class CreatePublishedAppIntegration {
  /** App id of the OAuth published app integration. For example power-bi, tableau-deskop */
  private String appId;

  /** Token access policy */
  private TokenAccessPolicy tokenAccessPolicy;

  public CreatePublishedAppIntegration setAppId(String appId) {
    this.appId = appId;
    return this;
  }

  public String getAppId() {
    return appId;
  }

  public CreatePublishedAppIntegration setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
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
    CreatePublishedAppIntegration that = (CreatePublishedAppIntegration) o;
    return Objects.equals(appId, that.appId)
        && Objects.equals(tokenAccessPolicy, that.tokenAccessPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, tokenAccessPolicy);
  }

  @Override
  public String toString() {
    return new ToStringer(CreatePublishedAppIntegration.class)
        .add("appId", appId)
        .add("tokenAccessPolicy", tokenAccessPolicy)
        .toString();
  }

  CreatePublishedAppIntegrationPb toPb() {
    CreatePublishedAppIntegrationPb pb = new CreatePublishedAppIntegrationPb();
    pb.setAppId(appId);
    pb.setTokenAccessPolicy(tokenAccessPolicy);

    return pb;
  }

  static CreatePublishedAppIntegration fromPb(CreatePublishedAppIntegrationPb pb) {
    CreatePublishedAppIntegration model = new CreatePublishedAppIntegration();
    model.setAppId(pb.getAppId());
    model.setTokenAccessPolicy(pb.getTokenAccessPolicy());

    return model;
  }

  public static class CreatePublishedAppIntegrationSerializer
      extends JsonSerializer<CreatePublishedAppIntegration> {
    @Override
    public void serialize(
        CreatePublishedAppIntegration value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreatePublishedAppIntegrationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreatePublishedAppIntegrationDeserializer
      extends JsonDeserializer<CreatePublishedAppIntegration> {
    @Override
    public CreatePublishedAppIntegration deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreatePublishedAppIntegrationPb pb =
          mapper.readValue(p, CreatePublishedAppIntegrationPb.class);
      return CreatePublishedAppIntegration.fromPb(pb);
    }
  }
}
