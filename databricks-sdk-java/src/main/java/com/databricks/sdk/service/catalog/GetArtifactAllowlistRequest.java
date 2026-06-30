// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetArtifactAllowlistRequest {
  /** The artifact type of the allowlist. */
  @JsonIgnore private ArtifactType artifactType;

  public GetArtifactAllowlistRequest setArtifactType(ArtifactType artifactType) {
    this.artifactType = artifactType;
    return this;
  }

  public ArtifactType getArtifactType() {
    return artifactType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetArtifactAllowlistRequest that = (GetArtifactAllowlistRequest) o;
    return Objects.equals(artifactType, that.artifactType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactType);
  }

  @Override
  public String toString() {
    return new ToStringer(GetArtifactAllowlistRequest.class)
        .add("artifactType", artifactType)
        .toString();
  }
}
