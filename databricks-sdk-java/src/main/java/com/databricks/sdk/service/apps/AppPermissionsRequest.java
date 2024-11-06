// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class AppPermissionsRequest {
  /** */
  @JsonProperty("access_control_list")
  private Collection<AppAccessControlRequest> accessControlList;

  /** The app for which to get or manage permissions. */
  @JsonIgnore private String appName;

  public AppPermissionsRequest setAccessControlList(
      Collection<AppAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<AppAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public AppPermissionsRequest setAppName(String appName) {
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
    AppPermissionsRequest that = (AppPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(appName, that.appName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, appName);
  }

  @Override
  public String toString() {
    return new ToStringer(AppPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("appName", appName)
        .toString();
  }
}
