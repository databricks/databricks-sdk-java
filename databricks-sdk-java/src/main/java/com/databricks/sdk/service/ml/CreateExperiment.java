// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateExperiment {
  /**
   * URI of the location where the artifacts of the experiment's runs are stored, such as a Unity
   * Catalog volume path of the form `dbfs:/Volumes/<catalog>/<schema>/<volume>/<path>`. The URI
   * must have a scheme other than `file` and must not point under the MLflow-managed prefix
   * `dbfs:/databricks/mlflow-tracking`. If omitted, artifacts are stored in MLflow-managed storage.
   * See https://docs.databricks.com/aws/en/mlflow/experiments for the supported locations.
   */
  @JsonProperty("artifact_location")
  private String artifactLocation;

  /**
   * Name of the experiment, as an absolute path in the workspace. Experiments cannot be created
   * under `/Repos`.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Tags to set on the new experiment, as key-value pairs. A request can include at most 100 tags.
   */
  @JsonProperty("tags")
  private Collection<ExperimentTag> tags;

  /**
   * The location where the experiment's traces are stored. When set, the underlying storage is
   * provisioned and the experiment's traces are routed to it. When unset, traces are stored in the
   * default MLflow backend. This field cannot be updated after the experiment is created.
   */
  @JsonProperty("trace_location")
  private ExperimentTraceLocation traceLocation;

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

  public CreateExperiment setTraceLocation(ExperimentTraceLocation traceLocation) {
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
    CreateExperiment that = (CreateExperiment) o;
    return Objects.equals(artifactLocation, that.artifactLocation)
        && Objects.equals(name, that.name)
        && Objects.equals(tags, that.tags)
        && Objects.equals(traceLocation, that.traceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactLocation, name, tags, traceLocation);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateExperiment.class)
        .add("artifactLocation", artifactLocation)
        .add("name", name)
        .add("tags", tags)
        .add("traceLocation", traceLocation)
        .toString();
  }
}
