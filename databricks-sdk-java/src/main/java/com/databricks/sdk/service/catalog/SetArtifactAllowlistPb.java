// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class SetArtifactAllowlistPb {
  @JsonProperty("artifact_matchers")
  private Collection<ArtifactMatcher> artifactMatchers;

  @JsonIgnore private ArtifactType artifactType;

  @JsonProperty("created_at")
  private Long createdAt;

  @JsonProperty("created_by")
  private String createdBy;

  @JsonProperty("metastore_id")
  private String metastoreId;

  public SetArtifactAllowlistPb setArtifactMatchers(Collection<ArtifactMatcher> artifactMatchers) {
    this.artifactMatchers = artifactMatchers;
    return this;
  }

  public Collection<ArtifactMatcher> getArtifactMatchers() {
    return artifactMatchers;
  }

  public SetArtifactAllowlistPb setArtifactType(ArtifactType artifactType) {
    this.artifactType = artifactType;
    return this;
  }

  public ArtifactType getArtifactType() {
    return artifactType;
  }

  public SetArtifactAllowlistPb setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public SetArtifactAllowlistPb setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public SetArtifactAllowlistPb setMetastoreId(String metastoreId) {
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
    SetArtifactAllowlistPb that = (SetArtifactAllowlistPb) o;
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
    return new ToStringer(SetArtifactAllowlistPb.class)
        .add("artifactMatchers", artifactMatchers)
        .add("artifactType", artifactType)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("metastoreId", metastoreId)
        .toString();
  }
}
