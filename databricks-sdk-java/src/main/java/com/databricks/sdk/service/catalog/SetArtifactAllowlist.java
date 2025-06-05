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
@JsonSerialize(using = SetArtifactAllowlist.SetArtifactAllowlistSerializer.class)
@JsonDeserialize(using = SetArtifactAllowlist.SetArtifactAllowlistDeserializer.class)
public class SetArtifactAllowlist {
  /** A list of allowed artifact match patterns. */
  private Collection<ArtifactMatcher> artifactMatchers;

  /** The artifact type of the allowlist. */
  private ArtifactType artifactType;

  /** Time at which this artifact allowlist was set, in epoch milliseconds. */
  private Long createdAt;

  /** Username of the user who set the artifact allowlist. */
  private String createdBy;

  /** Unique identifier of parent metastore. */
  private String metastoreId;

  public SetArtifactAllowlist setArtifactMatchers(Collection<ArtifactMatcher> artifactMatchers) {
    this.artifactMatchers = artifactMatchers;
    return this;
  }

  public Collection<ArtifactMatcher> getArtifactMatchers() {
    return artifactMatchers;
  }

  public SetArtifactAllowlist setArtifactType(ArtifactType artifactType) {
    this.artifactType = artifactType;
    return this;
  }

  public ArtifactType getArtifactType() {
    return artifactType;
  }

  public SetArtifactAllowlist setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public SetArtifactAllowlist setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public SetArtifactAllowlist setMetastoreId(String metastoreId) {
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
    SetArtifactAllowlist that = (SetArtifactAllowlist) o;
    return Objects.equals(artifactMatchers, that.artifactMatchers)
        && Objects.equals(artifactType, that.artifactType)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(metastoreId, that.metastoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactMatchers, artifactType, createdAt, createdBy, metastoreId);
  }

  @Override
  public String toString() {
    return new ToStringer(SetArtifactAllowlist.class)
        .add("artifactMatchers", artifactMatchers)
        .add("artifactType", artifactType)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("metastoreId", metastoreId)
        .toString();
  }

  SetArtifactAllowlistPb toPb() {
    SetArtifactAllowlistPb pb = new SetArtifactAllowlistPb();
    pb.setArtifactMatchers(artifactMatchers);
    pb.setArtifactType(artifactType);
    pb.setCreatedAt(createdAt);
    pb.setCreatedBy(createdBy);
    pb.setMetastoreId(metastoreId);

    return pb;
  }

  static SetArtifactAllowlist fromPb(SetArtifactAllowlistPb pb) {
    SetArtifactAllowlist model = new SetArtifactAllowlist();
    model.setArtifactMatchers(pb.getArtifactMatchers());
    model.setArtifactType(pb.getArtifactType());
    model.setCreatedAt(pb.getCreatedAt());
    model.setCreatedBy(pb.getCreatedBy());
    model.setMetastoreId(pb.getMetastoreId());

    return model;
  }

  public static class SetArtifactAllowlistSerializer extends JsonSerializer<SetArtifactAllowlist> {
    @Override
    public void serialize(
        SetArtifactAllowlist value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SetArtifactAllowlistPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SetArtifactAllowlistDeserializer
      extends JsonDeserializer<SetArtifactAllowlist> {
    @Override
    public SetArtifactAllowlist deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SetArtifactAllowlistPb pb = mapper.readValue(p, SetArtifactAllowlistPb.class);
      return SetArtifactAllowlist.fromPb(pb);
    }
  }
}
