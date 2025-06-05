// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class PasswordPermissionsRequestPb {
  @JsonProperty("access_control_list")
  private Collection<PasswordAccessControlRequest> accessControlList;

  public PasswordPermissionsRequestPb setAccessControlList(
      Collection<PasswordAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<PasswordAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PasswordPermissionsRequestPb that = (PasswordPermissionsRequestPb) o;
    return Objects.equals(accessControlList, that.accessControlList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList);
  }

  @Override
  public String toString() {
    return new ToStringer(PasswordPermissionsRequestPb.class)
        .add("accessControlList", accessControlList)
        .toString();
  }
}
