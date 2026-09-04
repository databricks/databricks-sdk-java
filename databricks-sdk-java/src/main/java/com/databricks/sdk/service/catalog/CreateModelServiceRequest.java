// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateModelServiceRequest {
  /**
   * The model service to create. Do not set `name`; the server derives it from `parent` and
   * `model_service_id`.
   */
  @JsonProperty("model_service")
  private ModelService modelService;

  /** Name for the model service, e.g. "my_model_service". */
  @JsonIgnore
  @QueryParam("model_service_id")
  private String modelServiceId;

  /**
   * Name of the parent schema. Format: `schemas/{catalog}.{schema}`. Each `{...}` component is
   * capped at 255 characters individually.
   */
  @JsonIgnore
  @QueryParam("parent")
  private String parent;

  public CreateModelServiceRequest setModelService(ModelService modelService) {
    this.modelService = modelService;
    return this;
  }

  public ModelService getModelService() {
    return modelService;
  }

  public CreateModelServiceRequest setModelServiceId(String modelServiceId) {
    this.modelServiceId = modelServiceId;
    return this;
  }

  public String getModelServiceId() {
    return modelServiceId;
  }

  public CreateModelServiceRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateModelServiceRequest that = (CreateModelServiceRequest) o;
    return Objects.equals(modelService, that.modelService)
        && Objects.equals(modelServiceId, that.modelServiceId)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelService, modelServiceId, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateModelServiceRequest.class)
        .add("modelService", modelService)
        .add("modelServiceId", modelServiceId)
        .add("parent", parent)
        .toString();
  }
}
