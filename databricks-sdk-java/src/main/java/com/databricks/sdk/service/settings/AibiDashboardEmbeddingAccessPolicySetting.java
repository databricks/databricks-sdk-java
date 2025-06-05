// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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
    using =
        AibiDashboardEmbeddingAccessPolicySetting
            .AibiDashboardEmbeddingAccessPolicySettingSerializer.class)
@JsonDeserialize(
    using =
        AibiDashboardEmbeddingAccessPolicySetting
            .AibiDashboardEmbeddingAccessPolicySettingDeserializer.class)
public class AibiDashboardEmbeddingAccessPolicySetting {
  /** */
  private AibiDashboardEmbeddingAccessPolicy aibiDashboardEmbeddingAccessPolicy;

  /**
   * etag used for versioning. The response is at least as fresh as the eTag provided. This is used
   * for optimistic concurrency control as a way to help prevent simultaneous writes of a setting
   * overwriting each other. It is strongly suggested that systems make use of the etag in the read
   * -> update pattern to perform setting updates in order to avoid race conditions. That is, get an
   * etag from a GET request, and pass it with the PATCH request to identify the setting version you
   * are updating.
   */
  private String etag;

  /**
   * Name of the corresponding setting. This field is populated in the response, but it will not be
   * respected even if it's set in the request body. The setting name in the path parameter will be
   * respected instead. Setting name is required to be 'default' if the setting only has one
   * instance per workspace.
   */
  private String settingName;

  public AibiDashboardEmbeddingAccessPolicySetting setAibiDashboardEmbeddingAccessPolicy(
      AibiDashboardEmbeddingAccessPolicy aibiDashboardEmbeddingAccessPolicy) {
    this.aibiDashboardEmbeddingAccessPolicy = aibiDashboardEmbeddingAccessPolicy;
    return this;
  }

  public AibiDashboardEmbeddingAccessPolicy getAibiDashboardEmbeddingAccessPolicy() {
    return aibiDashboardEmbeddingAccessPolicy;
  }

  public AibiDashboardEmbeddingAccessPolicySetting setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public AibiDashboardEmbeddingAccessPolicySetting setSettingName(String settingName) {
    this.settingName = settingName;
    return this;
  }

  public String getSettingName() {
    return settingName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AibiDashboardEmbeddingAccessPolicySetting that = (AibiDashboardEmbeddingAccessPolicySetting) o;
    return Objects.equals(
            aibiDashboardEmbeddingAccessPolicy, that.aibiDashboardEmbeddingAccessPolicy)
        && Objects.equals(etag, that.etag)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aibiDashboardEmbeddingAccessPolicy, etag, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(AibiDashboardEmbeddingAccessPolicySetting.class)
        .add("aibiDashboardEmbeddingAccessPolicy", aibiDashboardEmbeddingAccessPolicy)
        .add("etag", etag)
        .add("settingName", settingName)
        .toString();
  }

  AibiDashboardEmbeddingAccessPolicySettingPb toPb() {
    AibiDashboardEmbeddingAccessPolicySettingPb pb =
        new AibiDashboardEmbeddingAccessPolicySettingPb();
    pb.setAibiDashboardEmbeddingAccessPolicy(aibiDashboardEmbeddingAccessPolicy);
    pb.setEtag(etag);
    pb.setSettingName(settingName);

    return pb;
  }

  static AibiDashboardEmbeddingAccessPolicySetting fromPb(
      AibiDashboardEmbeddingAccessPolicySettingPb pb) {
    AibiDashboardEmbeddingAccessPolicySetting model =
        new AibiDashboardEmbeddingAccessPolicySetting();
    model.setAibiDashboardEmbeddingAccessPolicy(pb.getAibiDashboardEmbeddingAccessPolicy());
    model.setEtag(pb.getEtag());
    model.setSettingName(pb.getSettingName());

    return model;
  }

  public static class AibiDashboardEmbeddingAccessPolicySettingSerializer
      extends JsonSerializer<AibiDashboardEmbeddingAccessPolicySetting> {
    @Override
    public void serialize(
        AibiDashboardEmbeddingAccessPolicySetting value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      AibiDashboardEmbeddingAccessPolicySettingPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AibiDashboardEmbeddingAccessPolicySettingDeserializer
      extends JsonDeserializer<AibiDashboardEmbeddingAccessPolicySetting> {
    @Override
    public AibiDashboardEmbeddingAccessPolicySetting deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AibiDashboardEmbeddingAccessPolicySettingPb pb =
          mapper.readValue(p, AibiDashboardEmbeddingAccessPolicySettingPb.class);
      return AibiDashboardEmbeddingAccessPolicySetting.fromPb(pb);
    }
  }
}
