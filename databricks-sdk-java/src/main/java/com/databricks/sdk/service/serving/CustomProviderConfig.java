// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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

/** Configs needed to create a custom provider model route. */
@Generated
@JsonSerialize(using = CustomProviderConfig.CustomProviderConfigSerializer.class)
@JsonDeserialize(using = CustomProviderConfig.CustomProviderConfigDeserializer.class)
public class CustomProviderConfig {
  /**
   * This is a field to provide API key authentication for the custom provider API. You can only
   * specify one authentication method.
   */
  private ApiKeyAuth apiKeyAuth;

  /**
   * This is a field to provide bearer token authentication for the custom provider API. You can
   * only specify one authentication method.
   */
  private BearerTokenAuth bearerTokenAuth;

  /** This is a field to provide the URL of the custom provider API. */
  private String customProviderUrl;

  public CustomProviderConfig setApiKeyAuth(ApiKeyAuth apiKeyAuth) {
    this.apiKeyAuth = apiKeyAuth;
    return this;
  }

  public ApiKeyAuth getApiKeyAuth() {
    return apiKeyAuth;
  }

  public CustomProviderConfig setBearerTokenAuth(BearerTokenAuth bearerTokenAuth) {
    this.bearerTokenAuth = bearerTokenAuth;
    return this;
  }

  public BearerTokenAuth getBearerTokenAuth() {
    return bearerTokenAuth;
  }

  public CustomProviderConfig setCustomProviderUrl(String customProviderUrl) {
    this.customProviderUrl = customProviderUrl;
    return this;
  }

  public String getCustomProviderUrl() {
    return customProviderUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomProviderConfig that = (CustomProviderConfig) o;
    return Objects.equals(apiKeyAuth, that.apiKeyAuth)
        && Objects.equals(bearerTokenAuth, that.bearerTokenAuth)
        && Objects.equals(customProviderUrl, that.customProviderUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKeyAuth, bearerTokenAuth, customProviderUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomProviderConfig.class)
        .add("apiKeyAuth", apiKeyAuth)
        .add("bearerTokenAuth", bearerTokenAuth)
        .add("customProviderUrl", customProviderUrl)
        .toString();
  }

  CustomProviderConfigPb toPb() {
    CustomProviderConfigPb pb = new CustomProviderConfigPb();
    pb.setApiKeyAuth(apiKeyAuth);
    pb.setBearerTokenAuth(bearerTokenAuth);
    pb.setCustomProviderUrl(customProviderUrl);

    return pb;
  }

  static CustomProviderConfig fromPb(CustomProviderConfigPb pb) {
    CustomProviderConfig model = new CustomProviderConfig();
    model.setApiKeyAuth(pb.getApiKeyAuth());
    model.setBearerTokenAuth(pb.getBearerTokenAuth());
    model.setCustomProviderUrl(pb.getCustomProviderUrl());

    return model;
  }

  public static class CustomProviderConfigSerializer extends JsonSerializer<CustomProviderConfig> {
    @Override
    public void serialize(
        CustomProviderConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CustomProviderConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CustomProviderConfigDeserializer
      extends JsonDeserializer<CustomProviderConfig> {
    @Override
    public CustomProviderConfig deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CustomProviderConfigPb pb = mapper.readValue(p, CustomProviderConfigPb.class);
      return CustomProviderConfig.fromPb(pb);
    }
  }
}
