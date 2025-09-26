// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GetLoggedModelsRequest {
  /** The IDs of the logged models to retrieve. Max threshold is 100. */
  @JsonIgnore
  @QueryParam("model_ids")
  private Collection<String> modelIds;

  public GetLoggedModelsRequest setModelIds(Collection<String> modelIds) {
    this.modelIds = modelIds;
    return this;
  }

  public Collection<String> getModelIds() {
    return modelIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetLoggedModelsRequest that = (GetLoggedModelsRequest) o;
    return Objects.equals(modelIds, that.modelIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelIds);
  }

  @Override
  public String toString() {
    return new ToStringer(GetLoggedModelsRequest.class).add("modelIds", modelIds).toString();
  }
}
