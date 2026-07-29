// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateModelProviderServiceRequest {
  /**
   * If-match precondition: when set, the update proceeds only if the current server-side etag
   * matches. Empty means an unconditional update.
   */
  @JsonIgnore
  @QueryParam("etag")
  private String etag;

  /**
   * The model provider service with the updated field values. `name` identifies the resource
   * (`model-provider-services/{catalog}.{schema}.{model_provider_service}`); only fields listed in
   * `update_mask` are applied.
   */
  @JsonProperty("model_provider_service")
  private ModelProviderService modelProviderService;

  /**
   * Resource name of the provider service. Format:
   * `model-provider-services/{catalog}.{schema}.{model_provider_service}`. Each `{...}` component
   * is capped at 255 characters individually. Server-derived on Create from `parent` +
   * `model_provider_service_id`; required and immutable on Update/Get/Delete.
   */
  @JsonIgnore private String name;

  /**
   * The list of fields to update. The framework validates each path against the
   * `model_provider_service` field above. Wildcard paths (`paths: ["*"]`) are not supported; list
   * each field path explicitly.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateModelProviderServiceRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public UpdateModelProviderServiceRequest setModelProviderService(
      ModelProviderService modelProviderService) {
    this.modelProviderService = modelProviderService;
    return this;
  }

  public ModelProviderService getModelProviderService() {
    return modelProviderService;
  }

  public UpdateModelProviderServiceRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateModelProviderServiceRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateModelProviderServiceRequest that = (UpdateModelProviderServiceRequest) o;
    return Objects.equals(etag, that.etag)
        && Objects.equals(modelProviderService, that.modelProviderService)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, modelProviderService, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateModelProviderServiceRequest.class)
        .add("etag", etag)
        .add("modelProviderService", modelProviderService)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
