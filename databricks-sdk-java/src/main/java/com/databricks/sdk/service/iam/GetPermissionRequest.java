// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get object permissions */
@Generated
public class GetPermissionRequest {
  /** The id of the request object. */
  private String requestObjectId;

  /**
   * The type of the request object. Can be one of the following: alerts, authorization, clusters,
   * cluster-policies, dbsql-dashboards, directories, experiments, files, instance-pools, jobs,
   * notebooks, pipelines, queries, registered-models, repos, serving-endpoints, or warehouses.
   */
  private String requestObjectType;

  public GetPermissionRequest setRequestObjectId(String requestObjectId) {
    this.requestObjectId = requestObjectId;
    return this;
  }

  public String getRequestObjectId() {
    return requestObjectId;
  }

  public GetPermissionRequest setRequestObjectType(String requestObjectType) {
    this.requestObjectType = requestObjectType;
    return this;
  }

  public String getRequestObjectType() {
    return requestObjectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPermissionRequest that = (GetPermissionRequest) o;
    return Objects.equals(requestObjectId, that.requestObjectId)
        && Objects.equals(requestObjectType, that.requestObjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestObjectId, requestObjectType);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPermissionRequest.class)
        .add("requestObjectId", requestObjectId)
        .add("requestObjectType", requestObjectType)
        .toString();
  }
}
