// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateModelVersionRequest {
  /** Description of the model version. */
  @JsonProperty("description")
  private String description;

  /** Name of the existing registered model to create the version under. */
  @JsonProperty("name")
  private String name;

  /**
   * ID of the MLflow run that produced the model artifacts, if `source` comes from a run in the
   * MLflow tracking server. The ID is at most 32 characters long.
   */
  @JsonProperty("run_id")
  private String runId;

  /**
   * MLflow run link - this is the exact link of the run that generated this model version,
   * potentially hosted at another instance of MLflow.
   */
  @JsonProperty("run_link")
  private String runLink;

  /**
   * URI of the model artifacts to register, such as the artifact path of an MLflow run or a
   * `models:/<model_name>/<version>` URI of an existing `READY` model version. The registry copies
   * the artifacts asynchronously, so the new version starts in `PENDING_REGISTRATION` status.
   */
  @JsonProperty("source")
  private String source;

  /** Tags to set on the new model version. */
  @JsonProperty("tags")
  private Collection<ModelVersionTag> tags;

  public CreateModelVersionRequest setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public CreateModelVersionRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateModelVersionRequest setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public CreateModelVersionRequest setRunLink(String runLink) {
    this.runLink = runLink;
    return this;
  }

  public String getRunLink() {
    return runLink;
  }

  public CreateModelVersionRequest setSource(String source) {
    this.source = source;
    return this;
  }

  public String getSource() {
    return source;
  }

  public CreateModelVersionRequest setTags(Collection<ModelVersionTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<ModelVersionTag> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateModelVersionRequest that = (CreateModelVersionRequest) o;
    return Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runLink, that.runLink)
        && Objects.equals(source, that.source)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, runId, runLink, source, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateModelVersionRequest.class)
        .add("description", description)
        .add("name", name)
        .add("runId", runId)
        .add("runLink", runLink)
        .add("source", source)
        .add("tags", tags)
        .toString();
  }
}
