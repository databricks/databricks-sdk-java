// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class Experiment {
  /**
   * Location where artifacts for the experiment are stored.
   */
  @JsonProperty("artifact_location")
  private String artifactLocation;
  
  /**
   * Creation time
   */
  @JsonProperty("creation_time")
  private Long creationTime;
  
  /**
   * Unique identifier for the experiment.
   */
  @JsonProperty("experiment_id")
  private String experimentId;
  
  /**
   * Last update time
   */
  @JsonProperty("last_update_time")
  private Long lastUpdateTime;
  
  /**
   * Current life cycle stage of the experiment: "active" or "deleted". Deleted
   * experiments are not returned by APIs.
   */
  @JsonProperty("lifecycle_stage")
  private String lifecycleStage;
  
  /**
   * Human readable name that identifies the experiment.
   */
  @JsonProperty("name")
  private String name;
  
  /**
   * Tags: Additional metadata key-value pairs.
   */
  @JsonProperty("tags")
  private Collection<ExperimentTag> tags;
  
  public Experiment setArtifactLocation(String artifactLocation) {
    this.artifactLocation = artifactLocation;
    return this;
  }

  public String getArtifactLocation() {
    return artifactLocation;
  }
  
  public Experiment setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }
  
  public Experiment setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }
  
  public Experiment setLastUpdateTime(Long lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  public Long getLastUpdateTime() {
    return lastUpdateTime;
  }
  
  public Experiment setLifecycleStage(String lifecycleStage) {
    this.lifecycleStage = lifecycleStage;
    return this;
  }

  public String getLifecycleStage() {
    return lifecycleStage;
  }
  
  public Experiment setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }
  
  public Experiment setTags(Collection<ExperimentTag> tags) {
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
    Experiment that = (Experiment) o;
    return Objects.equals(artifactLocation, that.artifactLocation)
    && Objects.equals(creationTime, that.creationTime)
    && Objects.equals(experimentId, that.experimentId)
    && Objects.equals(lastUpdateTime, that.lastUpdateTime)
    && Objects.equals(lifecycleStage, that.lifecycleStage)
    && Objects.equals(name, that.name)
    && Objects.equals(tags, that.tags)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactLocation, creationTime, experimentId, lastUpdateTime, lifecycleStage, name, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(Experiment.class)
      .add("artifactLocation", artifactLocation)
      .add("creationTime", creationTime)
      .add("experimentId", experimentId)
      .add("lastUpdateTime", lastUpdateTime)
      .add("lifecycleStage", lifecycleStage)
      .add("name", name)
      .add("tags", tags).toString();
  }
}
