// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class CreateExperimentPb {
  @JsonProperty("artifact_location")
  private String artifactLocation;

  @JsonProperty("name")
  private String name;

  @JsonProperty("tags")
  private Collection<ExperimentTag> tags;

  public CreateExperimentPb setArtifactLocation(String artifactLocation) {
    this.artifactLocation = artifactLocation;
    return this;
  }

  public String getArtifactLocation() {
    return artifactLocation;
  }

  public CreateExperimentPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateExperimentPb setTags(Collection<ExperimentTag> tags) {
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
    CreateExperimentPb that = (CreateExperimentPb) o;
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
    return new ToStringer(CreateExperimentPb.class)
        .add("artifactLocation", artifactLocation)
        .add("name", name)
        .add("tags", tags)
        .toString();
  }
}
