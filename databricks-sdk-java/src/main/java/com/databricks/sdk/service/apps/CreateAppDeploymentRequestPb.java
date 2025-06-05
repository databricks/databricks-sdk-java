// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Create an app deployment */
@Generated
class CreateAppDeploymentRequestPb {
  @JsonProperty("app_deployment")
  private AppDeployment appDeployment;

  @JsonIgnore private String appName;

  public CreateAppDeploymentRequestPb setAppDeployment(AppDeployment appDeployment) {
    this.appDeployment = appDeployment;
    return this;
  }

  public AppDeployment getAppDeployment() {
    return appDeployment;
  }

  public CreateAppDeploymentRequestPb setAppName(String appName) {
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
    CreateAppDeploymentRequestPb that = (CreateAppDeploymentRequestPb) o;
    return Objects.equals(appDeployment, that.appDeployment)
        && Objects.equals(appName, that.appName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDeployment, appName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAppDeploymentRequestPb.class)
        .add("appDeployment", appDeployment)
        .add("appName", appName)
        .toString();
  }
}
