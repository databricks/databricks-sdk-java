// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateModelProviderServiceRequest {
  /**
   * The model provider service to create. The server populates `name` from `parent` +
   * `model_provider_service_id`; clients should leave it unset.
   */
  @JsonProperty("model_provider_service")
  private ModelProviderService modelProviderService;

  /**
   * Leaf identifier for the provider service (the unqualified name within the parent schema, e.g.
   * "openai_prod").
   */
  @JsonIgnore
  @QueryParam("model_provider_service_id")
  private String modelProviderServiceId;

  /**
   * Resource name of the parent schema. Format: `schemas/{catalog}.{schema}`. Each `{...}`
   * component is capped at 255 characters individually.
   */
  @JsonIgnore
  @QueryParam("parent")
  private String parent;

  public CreateModelProviderServiceRequest setModelProviderService(
      ModelProviderService modelProviderService) {
    this.modelProviderService = modelProviderService;
    return this;
  }

  public ModelProviderService getModelProviderService() {
    return modelProviderService;
  }

  public CreateModelProviderServiceRequest setModelProviderServiceId(
      String modelProviderServiceId) {
    this.modelProviderServiceId = modelProviderServiceId;
    return this;
  }

  public String getModelProviderServiceId() {
    return modelProviderServiceId;
  }

  public CreateModelProviderServiceRequest setParent(String parent) {
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
    CreateModelProviderServiceRequest that = (CreateModelProviderServiceRequest) o;
    return Objects.equals(modelProviderService, that.modelProviderService)
        && Objects.equals(modelProviderServiceId, that.modelProviderServiceId)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelProviderService, modelProviderServiceId, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateModelProviderServiceRequest.class)
        .add("modelProviderService", modelProviderService)
        .add("modelProviderServiceId", modelProviderServiceId)
        .add("parent", parent)
        .toString();
  }
}
