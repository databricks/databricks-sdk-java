// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get an app deployment */
@Generated
public class GetAppDeploymentRequest {
  /** The name of the app. */
  private String appName;

  /** The unique id of the deployment. */
  private String deploymentId;

  public GetAppDeploymentRequest setAppName(String appName) {
    this.appName = appName;
    return this;
  }

  public String getAppName() {
    return appName;
  }

  public GetAppDeploymentRequest setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  public String getDeploymentId() {
    return deploymentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAppDeploymentRequest that = (GetAppDeploymentRequest) o;
    return Objects.equals(appName, that.appName) && Objects.equals(deploymentId, that.deploymentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, deploymentId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAppDeploymentRequest.class)
        .add("appName", appName)
        .add("deploymentId", deploymentId)
        .toString();
  }
}
