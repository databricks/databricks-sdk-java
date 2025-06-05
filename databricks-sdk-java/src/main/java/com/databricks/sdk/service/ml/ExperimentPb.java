// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** An experiment and its metadata. */
@Generated
class ExperimentPb {
  @JsonProperty("artifact_location")
  private String artifactLocation;

  @JsonProperty("creation_time")
  private Long creationTime;

  @JsonProperty("experiment_id")
  private String experimentId;

  @JsonProperty("last_update_time")
  private Long lastUpdateTime;

  @JsonProperty("lifecycle_stage")
  private String lifecycleStage;

  @JsonProperty("name")
  private String name;

  @JsonProperty("tags")
  private Collection<ExperimentTag> tags;

  public ExperimentPb setArtifactLocation(String artifactLocation) {
    this.artifactLocation = artifactLocation;
    return this;
  }

  public String getArtifactLocation() {
    return artifactLocation;
  }

  public ExperimentPb setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public ExperimentPb setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public ExperimentPb setLastUpdateTime(Long lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  public Long getLastUpdateTime() {
    return lastUpdateTime;
  }

  public ExperimentPb setLifecycleStage(String lifecycleStage) {
    this.lifecycleStage = lifecycleStage;
    return this;
  }

  public String getLifecycleStage() {
    return lifecycleStage;
  }

  public ExperimentPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ExperimentPb setTags(Collection<ExperimentTag> tags) {
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
    ExperimentPb that = (ExperimentPb) o;
    return Objects.equals(artifactLocation, that.artifactLocation)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(experimentId, that.experimentId)
        && Objects.equals(lastUpdateTime, that.lastUpdateTime)
        && Objects.equals(lifecycleStage, that.lifecycleStage)
        && Objects.equals(name, that.name)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        artifactLocation, creationTime, experimentId, lastUpdateTime, lifecycleStage, name, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(ExperimentPb.class)
        .add("artifactLocation", artifactLocation)
        .add("creationTime", creationTime)
        .add("experimentId", experimentId)
        .add("lastUpdateTime", lastUpdateTime)
        .add("lifecycleStage", lifecycleStage)
        .add("name", name)
        .add("tags", tags)
        .toString();
  }
}
