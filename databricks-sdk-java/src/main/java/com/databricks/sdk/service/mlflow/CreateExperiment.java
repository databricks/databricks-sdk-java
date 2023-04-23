// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class CreateExperiment {
  /**
   * Location where all artifacts for the experiment are stored. If not provided, the remote server
   * will select an appropriate default.
   */
  @JsonProperty("artifact_location")
  private String artifactLocation;

  /** Experiment name. */
  @JsonProperty("name")
  private String name;

  /**
   * A collection of tags to set on the experiment. Maximum tag size and number of tags per request
   * depends on the storage backend. All storage backends are guaranteed to support tag keys up to
   * 250 bytes in size and tag values up to 5000 bytes in size. All storage backends are also
   * guaranteed to support up to 20 tags per request.
   */
  @JsonProperty("tags")
  private Collection<ExperimentTag> tags;

  public CreateExperiment setArtifactLocation(String artifactLocation) {
    this.artifactLocation = artifactLocation;
    return this;
  }

  public String getArtifactLocation() {
    return artifactLocation;
  }

  public CreateExperiment setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateExperiment setTags(Collection<ExperimentTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<ExperimentTag> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateExperiment that = (CreateExperiment) o;
    return Objects.equals(artifactLocation, that.artifactLocation)
        && Objects.equals(name, that.name)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactLocation, name, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateExperiment.class)
        .add("artifactLocation", artifactLocation)
        .add("name", name)
        .add("tags", tags)
        .toString();
  }
}
