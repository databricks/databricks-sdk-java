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
public class ModelDataPlaneInfo {
  /** Information required to query DataPlane API 'query' endpoint. */
  @JsonProperty("query_info")
  private DataPlaneInfo queryInfo;

  public ModelDataPlaneInfo setQueryInfo(DataPlaneInfo queryInfo) {
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
    ModelDataPlaneInfo that = (ModelDataPlaneInfo) o;
    return Objects.equals(queryInfo, that.queryInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelDataPlaneInfo.class).add("queryInfo", queryInfo).toString();
  }
}
