// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** An experiment and its metadata. */
@Generated
public class Experiment {
  /**
   * URI of the location where the artifacts of the experiment's runs are stored. Experiments
   * created without an explicit location use MLflow-managed storage under
   * `dbfs:/databricks/mlflow-tracking/<experiment_id>`.
   */
  @JsonProperty("artifact_location")
  private String artifactLocation;

  /** Time when the experiment was created, as a Unix timestamp in milliseconds. */
  @JsonProperty("creation_time")
  private Long creationTime;

  /** Unique identifier for the experiment. */
  @JsonProperty("experiment_id")
  private String experimentId;

  /** Time when the experiment metadata was last updated, as a Unix timestamp in milliseconds. */
  @JsonProperty("last_update_time")
  private Long lastUpdateTime;

  /**
   * Current life cycle stage of the experiment: `active` or `deleted`. Deleted experiments are
   * excluded from list and search results unless `view_type` requests them, and can be restored
   * until they are permanently deleted.
   */
  @JsonProperty("lifecycle_stage")
  private String lifecycleStage;

  /**
   * Name of the experiment. A workspace experiment is named by its absolute path in the workspace;
   * a notebook experiment has the path of its notebook.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Tags set on the experiment, as key-value pairs, including system tags such as `mlflow.ownerId`
   * that MLflow maintains.
   */
  @JsonProperty("tags")
  private Collection<ExperimentTag> tags;

  /**
   * The location where the experiment's traces are stored. Unset when traces are stored in the
   * default MLflow backend. This field cannot be updated after the experiment is created.
   */
  @JsonProperty("trace_location")
  private ExperimentTraceLocation traceLocation;

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

  public Experiment setTraceLocation(ExperimentTraceLocation traceLocation) {
    this.traceLocation = traceLocation;
    return this;
  }

  public ExperimentTraceLocation getTraceLocation() {
    return traceLocation;
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
        && Objects.equals(traceLocation, that.traceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        artifactLocation,
        creationTime,
        experimentId,
        lastUpdateTime,
        lifecycleStage,
        name,
        tags,
        traceLocation);
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
        .add("tags", tags)
        .add("traceLocation", traceLocation)
        .toString();
  }
}
