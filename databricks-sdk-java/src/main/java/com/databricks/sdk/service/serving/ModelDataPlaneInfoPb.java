// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A representation of all DataPlaneInfo for operations that can be done on a model through Data
 * Plane APIs.
 */
@Generated
class ModelDataPlaneInfoPb {
  @JsonProperty("query_info")
  private DataPlaneInfo queryInfo;

  public ModelDataPlaneInfoPb setQueryInfo(DataPlaneInfo queryInfo) {
    this.queryInfo = queryInfo;
    return this;
  }

  public DataPlaneInfo getQueryInfo() {
    return queryInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelDataPlaneInfoPb that = (ModelDataPlaneInfoPb) o;
    return Objects.equals(queryInfo, that.queryInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelDataPlaneInfoPb.class).add("queryInfo", queryInfo).toString();
  }
}
