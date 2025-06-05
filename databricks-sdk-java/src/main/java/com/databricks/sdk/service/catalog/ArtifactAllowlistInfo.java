// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = ArtifactAllowlistInfo.ArtifactAllowlistInfoSerializer.class)
@JsonDeserialize(using = ArtifactAllowlistInfo.ArtifactAllowlistInfoDeserializer.class)
public class ArtifactAllowlistInfo {
  /** A list of allowed artifact match patterns. */
  private Collection<ArtifactMatcher> artifactMatchers;

  /** Time at which this artifact allowlist was set, in epoch milliseconds. */
  private Long createdAt;

  /** Username of the user who set the artifact allowlist. */
  private String createdBy;

  /** Unique identifier of parent metastore. */
  private String metastoreId;

  public ArtifactAllowlistInfo setArtifactMatchers(Collection<ArtifactMatcher> artifactMatchers) {
    this.artifactMatchers = artifactMatchers;
    return this;
  }

  public Collection<ArtifactMatcher> getArtifactMatchers() {
    return artifactMatchers;
  }

  public ArtifactAllowlistInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public ArtifactAllowlistInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public ArtifactAllowlistInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ArtifactAllowlistInfo that = (ArtifactAllowlistInfo) o;
    return Objects.equals(artifactMatchers, that.artifactMatchers)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(metastoreId, that.metastoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactMatchers, createdAt, createdBy, metastoreId);
  }

  @Override
  public String toString() {
    return new ToStringer(ArtifactAllowlistInfo.class)
        .add("artifactMatchers", artifactMatchers)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("metastoreId", metastoreId)
        .toString();
  }

  ArtifactAllowlistInfoPb toPb() {
    ArtifactAllowlistInfoPb pb = new ArtifactAllowlistInfoPb();
    pb.setArtifactMatchers(artifactMatchers);
    pb.setCreatedAt(createdAt);
    pb.setCreatedBy(createdBy);
    pb.setMetastoreId(metastoreId);

    return pb;
  }

  static ArtifactAllowlistInfo fromPb(ArtifactAllowlistInfoPb pb) {
    ArtifactAllowlistInfo model = new ArtifactAllowlistInfo();
    model.setArtifactMatchers(pb.getArtifactMatchers());
    model.setCreatedAt(pb.getCreatedAt());
    model.setCreatedBy(pb.getCreatedBy());
    model.setMetastoreId(pb.getMetastoreId());

    return model;
  }

  public static class ArtifactAllowlistInfoSerializer
      extends JsonSerializer<ArtifactAllowlistInfo> {
    @Override
    public void serialize(
        ArtifactAllowlistInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ArtifactAllowlistInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ArtifactAllowlistInfoDeserializer
      extends JsonDeserializer<ArtifactAllowlistInfo> {
    @Override
    public ArtifactAllowlistInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ArtifactAllowlistInfoPb pb = mapper.readValue(p, ArtifactAllowlistInfoPb.class);
      return ArtifactAllowlistInfo.fromPb(pb);
    }
  }
}
