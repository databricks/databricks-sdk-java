// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get app permissions */
@Generated
class GetAppPermissionsRequestPb {
  @JsonIgnore private String appName;

  public GetAppPermissionsRequestPb setAppName(String appName) {
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
    GetAppPermissionsRequestPb that = (GetAppPermissionsRequestPb) o;
    return Objects.equals(appName, that.appName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAppPermissionsRequestPb.class).add("appName", appName).toString();
  }
}
