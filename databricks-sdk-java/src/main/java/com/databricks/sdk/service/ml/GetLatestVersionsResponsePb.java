// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class GetLatestVersionsResponsePb {
  @JsonProperty("model_versions")
  private Collection<ModelVersion> modelVersions;

  public GetLatestVersionsResponsePb setModelVersions(Collection<ModelVersion> modelVersions) {
    this.modelVersions = modelVersions;
    return this;
  }

  public Collection<ModelVersion> getModelVersions() {
    return modelVersions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetLatestVersionsResponsePb that = (GetLatestVersionsResponsePb) o;
    return Objects.equals(modelVersions, that.modelVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelVersions);
  }

  @Override
  public String toString() {
    return new ToStringer(GetLatestVersionsResponsePb.class)
        .add("modelVersions", modelVersions)
        .toString();
  }
}
