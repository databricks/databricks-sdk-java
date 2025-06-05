// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class LogLoggedModelParamsRequestPb {
  @JsonIgnore private String modelId;

  @JsonProperty("params")
  private Collection<LoggedModelParameter> params;

  public LogLoggedModelParamsRequestPb setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  public LogLoggedModelParamsRequestPb setParams(Collection<LoggedModelParameter> params) {
    this.params = params;
    return this;
  }

  public Collection<LoggedModelParameter> getParams() {
    return params;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogLoggedModelParamsRequestPb that = (LogLoggedModelParamsRequestPb) o;
    return Objects.equals(modelId, that.modelId) && Objects.equals(params, that.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId, params);
  }

  @Override
  public String toString() {
    return new ToStringer(LogLoggedModelParamsRequestPb.class)
        .add("modelId", modelId)
        .add("params", params)
        .toString();
  }
}
