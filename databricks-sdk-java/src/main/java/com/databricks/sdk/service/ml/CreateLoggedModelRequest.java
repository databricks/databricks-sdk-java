// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateLoggedModelRequest {
  /** The ID of the experiment that owns the model. */
  @JsonProperty("experiment_id")
  private String experimentId;

  /** The type of the model, such as ``"Agent"``, ``"Classifier"``, ``"LLM"``. */
  @JsonProperty("model_type")
  private String modelType;

  /** The name of the model (optional). If not specified one will be generated. */
  @JsonProperty("name")
  private String name;

  /** Parameters attached to the model. */
  @JsonProperty("params")
  private Collection<LoggedModelParameter> params;

  /** The ID of the run that created the model. */
  @JsonProperty("source_run_id")
  private String sourceRunId;

  /** Tags attached to the model. */
  @JsonProperty("tags")
  private Collection<LoggedModelTag> tags;

  public CreateLoggedModelRequest setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public CreateLoggedModelRequest setModelType(String modelType) {
    this.modelType = modelType;
    return this;
  }

  public String getModelType() {
    return modelType;
  }

  public CreateLoggedModelRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateLoggedModelRequest setParams(Collection<LoggedModelParameter> params) {
    this.params = params;
    return this;
  }

  public Collection<LoggedModelParameter> getParams() {
    return params;
  }

  public CreateLoggedModelRequest setSourceRunId(String sourceRunId) {
    this.sourceRunId = sourceRunId;
    return this;
  }

  public String getSourceRunId() {
    return sourceRunId;
  }

  public CreateLoggedModelRequest setTags(Collection<LoggedModelTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<LoggedModelTag> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateLoggedModelRequest that = (CreateLoggedModelRequest) o;
    return Objects.equals(experimentId, that.experimentId)
        && Objects.equals(modelType, that.modelType)
        && Objects.equals(name, that.name)
        && Objects.equals(params, that.params)
        && Objects.equals(sourceRunId, that.sourceRunId)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId, modelType, name, params, sourceRunId, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateLoggedModelRequest.class)
        .add("experimentId", experimentId)
        .add("modelType", modelType)
        .add("name", name)
        .add("params", params)
        .add("sourceRunId", sourceRunId)
        .add("tags", tags)
        .toString();
  }
}
