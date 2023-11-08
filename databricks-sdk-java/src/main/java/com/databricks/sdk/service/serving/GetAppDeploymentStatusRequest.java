// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get deployment status for an application */
@Generated
public class GetAppDeploymentStatusRequest {
  /** The deployment id for an application. This field is required. */
  private String deploymentId;

  /** Boolean flag to include application logs */
  @QueryParam("include_app_log")
  private String includeAppLog;

  public GetAppDeploymentStatusRequest setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  public String getDeploymentId() {
    return deploymentId;
  }

  public GetAppDeploymentStatusRequest setIncludeAppLog(String includeAppLog) {
    this.includeAppLog = includeAppLog;
    return this;
  }

  public String getIncludeAppLog() {
    return includeAppLog;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAppDeploymentStatusRequest that = (GetAppDeploymentStatusRequest) o;
    return Objects.equals(deploymentId, that.deploymentId)
        && Objects.equals(includeAppLog, that.includeAppLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentId, includeAppLog);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAppDeploymentStatusRequest.class)
        .add("deploymentId", deploymentId)
        .add("includeAppLog", includeAppLog)
        .toString();
  }
}
