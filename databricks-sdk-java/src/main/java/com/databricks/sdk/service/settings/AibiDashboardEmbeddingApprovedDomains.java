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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(
    using =
        AibiDashboardEmbeddingApprovedDomains.AibiDashboardEmbeddingApprovedDomainsSerializer.class)
@JsonDeserialize(
    using =
        AibiDashboardEmbeddingApprovedDomains.AibiDashboardEmbeddingApprovedDomainsDeserializer
            .class)
public class AibiDashboardEmbeddingApprovedDomains {
  /** */
  private Collection<String> approvedDomains;

  public AibiDashboardEmbeddingApprovedDomains setApprovedDomains(
      Collection<String> approvedDomains) {
    this.approvedDomains = approvedDomains;
    return this;
  }

  public Collection<String> getApprovedDomains() {
    return approvedDomains;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AibiDashboardEmbeddingApprovedDomains that = (AibiDashboardEmbeddingApprovedDomains) o;
    return Objects.equals(approvedDomains, that.approvedDomains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvedDomains);
  }

  @Override
  public String toString() {
    return new ToStringer(AibiDashboardEmbeddingApprovedDomains.class)
        .add("approvedDomains", approvedDomains)
        .toString();
  }

  AibiDashboardEmbeddingApprovedDomainsPb toPb() {
    AibiDashboardEmbeddingApprovedDomainsPb pb = new AibiDashboardEmbeddingApprovedDomainsPb();
    pb.setApprovedDomains(approvedDomains);

    return pb;
  }

  static AibiDashboardEmbeddingApprovedDomains fromPb(AibiDashboardEmbeddingApprovedDomainsPb pb) {
    AibiDashboardEmbeddingApprovedDomains model = new AibiDashboardEmbeddingApprovedDomains();
    model.setApprovedDomains(pb.getApprovedDomains());

    return model;
  }

  public static class AibiDashboardEmbeddingApprovedDomainsSerializer
      extends JsonSerializer<AibiDashboardEmbeddingApprovedDomains> {
    @Override
    public void serialize(
        AibiDashboardEmbeddingApprovedDomains value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AibiDashboardEmbeddingApprovedDomainsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AibiDashboardEmbeddingApprovedDomainsDeserializer
      extends JsonDeserializer<AibiDashboardEmbeddingApprovedDomains> {
    @Override
    public AibiDashboardEmbeddingApprovedDomains deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AibiDashboardEmbeddingApprovedDomainsPb pb =
          mapper.readValue(p, AibiDashboardEmbeddingApprovedDomainsPb.class);
      return AibiDashboardEmbeddingApprovedDomains.fromPb(pb);
    }
  }
}
