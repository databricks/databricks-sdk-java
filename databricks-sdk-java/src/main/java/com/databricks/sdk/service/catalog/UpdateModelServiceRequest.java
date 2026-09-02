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
public class UpdateModelServiceRequest {
  /**
   * Optimistic concurrency token from the most recent read. When set, the update succeeds only if
   * the resource has not changed. Leave unset for an unconditional update. For REST requests,
   * URL-encode the base64 string returned by the API when setting the `etag` query parameter.
   */
  @JsonIgnore
  @QueryParam("etag")
  private String etag;

  /**
   * The model service with the updated field values. `name` identifies the resource
   * (`model-services/{catalog}.{schema}.{model_service}`); only fields listed in `update_mask` are
   * applied.
   */
  @JsonProperty("model_service")
  private ModelService modelService;

  /**
   * Resource name of the model service. Format:
   * `model-services/{catalog}.{schema}.{model_service}`. Each `{...}` component is capped at 255
   * characters individually. Server-derived on Create from `parent` + `model_service_id`; required
   * and immutable on Update/Get/Delete.
   */
  @JsonIgnore private String name;

  /**
   * Fields to update. Use `config` to replace the entire configuration. The replacement must
   * include every required field; any optional field you omit is cleared. To preserve sibling
   * fields, use one or more granular paths: `comment`, `config.routing.destinations`,
   * `config.routing.routing_strategy`, `config.routing.fallback.destinations`,
   * `config.routing.first_token_timeout`, `config.rate_limits`, or `config.inference_table`.
   * Intermediate paths such as `config.routing` and `config.routing.fallback`, and wildcard paths
   * such as `*`, are not supported.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateModelServiceRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public UpdateModelServiceRequest setModelService(ModelService modelService) {
    this.modelService = modelService;
    return this;
  }

  public ModelService getModelService() {
    return modelService;
  }

  public UpdateModelServiceRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateModelServiceRequest setUpdateMask(FieldMask updateMask) {
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
    UpdateModelServiceRequest that = (UpdateModelServiceRequest) o;
    return Objects.equals(etag, that.etag)
        && Objects.equals(modelService, that.modelService)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, modelService, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateModelServiceRequest.class)
        .add("etag", etag)
        .add("modelService", modelService)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
