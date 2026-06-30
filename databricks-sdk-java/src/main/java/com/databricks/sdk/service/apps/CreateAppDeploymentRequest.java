// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateAppDeploymentRequest {
  /** The app deployment configuration. */
  @JsonProperty("app_deployment")
  private AppDeployment appDeployment;

  /** The name of the app. */
  @JsonIgnore private String appName;

  public CreateAppDeploymentRequest setAppDeployment(AppDeployment appDeployment) {
    this.appDeployment = appDeployment;
    return this;
  }

  public AppDeployment getAppDeployment() {
    return appDeployment;
  }

  public CreateAppDeploymentRequest setAppName(String appName) {
    this.appName = appName;
    return this;
  }

  public String getAppName() {
    return appName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateAppDeploymentRequest that = (CreateAppDeploymentRequest) o;
    return Objects.equals(appDeployment, that.appDeployment)
        && Objects.equals(appName, that.appName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDeployment, appName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAppDeploymentRequest.class)
        .add("appDeployment", appDeployment)
        .add("appName", appName)
        .toString();
  }
}
