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
    using = AibiDashboardEmbeddingAccessPolicy.AibiDashboardEmbeddingAccessPolicySerializer.class)
@JsonDeserialize(
    using = AibiDashboardEmbeddingAccessPolicy.AibiDashboardEmbeddingAccessPolicyDeserializer.class)
public class AibiDashboardEmbeddingAccessPolicy {
  /** */
  private AibiDashboardEmbeddingAccessPolicyAccessPolicyType accessPolicyType;

  public AibiDashboardEmbeddingAccessPolicy setAccessPolicyType(
      AibiDashboardEmbeddingAccessPolicyAccessPolicyType accessPolicyType) {
    this.accessPolicyType = accessPolicyType;
    return this;
  }

  public AibiDashboardEmbeddingAccessPolicyAccessPolicyType getAccessPolicyType() {
    return accessPolicyType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AibiDashboardEmbeddingAccessPolicy that = (AibiDashboardEmbeddingAccessPolicy) o;
    return Objects.equals(accessPolicyType, that.accessPolicyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessPolicyType);
  }

  @Override
  public String toString() {
    return new ToStringer(AibiDashboardEmbeddingAccessPolicy.class)
        .add("accessPolicyType", accessPolicyType)
        .toString();
  }

  AibiDashboardEmbeddingAccessPolicyPb toPb() {
    AibiDashboardEmbeddingAccessPolicyPb pb = new AibiDashboardEmbeddingAccessPolicyPb();
    pb.setAccessPolicyType(accessPolicyType);

    return pb;
  }

  static AibiDashboardEmbeddingAccessPolicy fromPb(AibiDashboardEmbeddingAccessPolicyPb pb) {
    AibiDashboardEmbeddingAccessPolicy model = new AibiDashboardEmbeddingAccessPolicy();
    model.setAccessPolicyType(pb.getAccessPolicyType());

    return model;
  }

  public static class AibiDashboardEmbeddingAccessPolicySerializer
      extends JsonSerializer<AibiDashboardEmbeddingAccessPolicy> {
    @Override
    public void serialize(
        AibiDashboardEmbeddingAccessPolicy value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AibiDashboardEmbeddingAccessPolicyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AibiDashboardEmbeddingAccessPolicyDeserializer
      extends JsonDeserializer<AibiDashboardEmbeddingAccessPolicy> {
    @Override
    public AibiDashboardEmbeddingAccessPolicy deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AibiDashboardEmbeddingAccessPolicyPb pb =
          mapper.readValue(p, AibiDashboardEmbeddingAccessPolicyPb.class);
      return AibiDashboardEmbeddingAccessPolicy.fromPb(pb);
    }
  }
}
