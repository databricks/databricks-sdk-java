// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class GetLatestVersionsResponse {
  /**
   * Latest version models for each requests stage. Only return models with current `READY` status.
   * If no `stages` provided, returns the latest version for each stage, including `"None"`.
   */
  @JsonProperty("model_versions")
  private Collection<ModelVersion> modelVersions;

  public GetLatestVersionsResponse setModelVersions(Collection<ModelVersion> modelVersions) {
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
    GetLatestVersionsResponse that = (GetLatestVersionsResponse) o;
    return Objects.equals(modelVersions, that.modelVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelVersions);
  }

  @Override
  public String toString() {
    return new ToStringer(GetLatestVersionsResponse.class)
        .add("modelVersions", modelVersions)
        .toString();
  }
}
