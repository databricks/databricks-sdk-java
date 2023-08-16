// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ArtifactMatcher {
  /** The artifact path or maven coordinate */
  @JsonProperty("artifact")
  private String artifact;

  /** The pattern matching type of the artifact */
  @JsonProperty("match_type")
  private MatchType matchType;

  public ArtifactMatcher setArtifact(String artifact) {
    this.artifact = artifact;
    return this;
  }

  public String getArtifact() {
    return artifact;
  }

  public ArtifactMatcher setMatchType(MatchType matchType) {
    this.matchType = matchType;
    return this;
  }

  public MatchType getMatchType() {
    return matchType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ArtifactMatcher that = (ArtifactMatcher) o;
    return Objects.equals(artifact, that.artifact) && Objects.equals(matchType, that.matchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifact, matchType);
  }

  @Override
  public String toString() {
    return new ToStringer(ArtifactMatcher.class)
        .add("artifact", artifact)
        .add("matchType", matchType)
        .toString();
  }
}
