// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteModelProviderServiceRequest {
  /**
   * If-match precondition: when set, the delete proceeds only if the current server-side etag
   * matches. Empty means unconditional delete.
   */
  @JsonIgnore
  @QueryParam("etag")
  private String etag;

  /**
   * Resource name of the model provider service. Format:
   * `model-provider-services/{catalog}.{schema}.{model_provider_service}`. Each `{...}` component
   * is capped at 255 characters individually.
   */
  @JsonIgnore private String name;

  public DeleteModelProviderServiceRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public DeleteModelProviderServiceRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteModelProviderServiceRequest that = (DeleteModelProviderServiceRequest) o;
    return Objects.equals(etag, that.etag) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteModelProviderServiceRequest.class)
        .add("etag", etag)
        .add("name", name)
        .toString();
  }
}
