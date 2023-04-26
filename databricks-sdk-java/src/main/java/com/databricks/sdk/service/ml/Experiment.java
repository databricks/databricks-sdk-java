// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>Experiment class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Experiment {
  /** Location where artifacts for the experiment are stored. */
  @JsonProperty("artifact_location")
  private String artifactLocation;

  /** Creation time */
  @JsonProperty("creation_time")
  private Long creationTime;

  /** Unique identifier for the experiment. */
  @JsonProperty("experiment_id")
  private String experimentId;

  /** Last update time */
  @JsonProperty("last_update_time")
  private Long lastUpdateTime;

  /**
   * Current life cycle stage of the experiment: "active" or "deleted". Deleted experiments are not
   * returned by APIs.
   */
  @JsonProperty("lifecycle_stage")
  private String lifecycleStage;

  /** Human readable name that identifies the experiment. */
  @JsonProperty("name")
  private String name;

  /** Tags: Additional metadata key-value pairs. */
  @JsonProperty("tags")
  private Collection<ExperimentTag> tags;

  /**
   * <p>Setter for the field <code>artifactLocation</code>.</p>
   *
   * @param artifactLocation a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.Experiment} object
   */
  public Experiment setArtifactLocation(String artifactLocation) {
    this.artifactLocation = artifactLocation;
    return this;
  }

  /**
   * <p>Getter for the field <code>artifactLocation</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getArtifactLocation() {
    return artifactLocation;
  }

  /**
   * <p>Setter for the field <code>creationTime</code>.</p>
   *
   * @param creationTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.Experiment} object
   */
  public Experiment setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>creationTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreationTime() {
    return creationTime;
  }

  /**
   * <p>Setter for the field <code>experimentId</code>.</p>
   *
   * @param experimentId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.Experiment} object
   */
  public Experiment setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  /**
   * <p>Getter for the field <code>experimentId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getExperimentId() {
    return experimentId;
  }

  /**
   * <p>Setter for the field <code>lastUpdateTime</code>.</p>
   *
   * @param lastUpdateTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.Experiment} object
   */
  public Experiment setLastUpdateTime(Long lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>lastUpdateTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getLastUpdateTime() {
    return lastUpdateTime;
  }

  /**
   * <p>Setter for the field <code>lifecycleStage</code>.</p>
   *
   * @param lifecycleStage a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.Experiment} object
   */
  public Experiment setLifecycleStage(String lifecycleStage) {
    this.lifecycleStage = lifecycleStage;
    return this;
  }

  /**
   * <p>Getter for the field <code>lifecycleStage</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getLifecycleStage() {
    return lifecycleStage;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.Experiment} object
   */
  public Experiment setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>tags</code>.</p>
   *
   * @param tags a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.Experiment} object
   */
  public Experiment setTags(Collection<ExperimentTag> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * <p>Getter for the field <code>tags</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ExperimentTag> getTags() {
    return tags;
  }

  /** {@inheritDoc} */
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
        && Objects.equals(tags, that.tags);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        artifactLocation, creationTime, experimentId, lastUpdateTime, lifecycleStage, name, tags);
  }

  /** {@inheritDoc} */
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
        .toString();
  }
}
