// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SetArtifactAllowlist {
  /** A list of allowed artifact match patterns. */
  @JsonProperty("artifact_matchers")
  private Collection<ArtifactMatcher> artifactMatchers;

  /** The artifact type of the allowlist. */
  private ArtifactType artifactType;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SetArtifactAllowlist that = (SetArtifactAllowlist) o;
    return Objects.equals(artifactMatchers, that.artifactMatchers)
        && Objects.equals(artifactType, that.artifactType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactMatchers, artifactType);
  }

  @Override
  public String toString() {
    return new ToStringer(SetArtifactAllowlist.class)
        .add("artifactMatchers", artifactMatchers)
        .add("artifactType", artifactType)
        .toString();
  }
}
