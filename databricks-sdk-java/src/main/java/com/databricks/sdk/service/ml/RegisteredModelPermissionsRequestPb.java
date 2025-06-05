// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class RegisteredModelPermissionsRequestPb {
  @JsonProperty("access_control_list")
  private Collection<RegisteredModelAccessControlRequest> accessControlList;

  @JsonIgnore private String registeredModelId;

  public RegisteredModelPermissionsRequestPb setAccessControlList(
      Collection<RegisteredModelAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<RegisteredModelAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public RegisteredModelPermissionsRequestPb setRegisteredModelId(String registeredModelId) {
    this.registeredModelId = registeredModelId;
    return this;
  }

  public String getRegisteredModelId() {
    return registeredModelId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RegisteredModelPermissionsRequestPb that = (RegisteredModelPermissionsRequestPb) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(registeredModelId, that.registeredModelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, registeredModelId);
  }

  @Override
  public String toString() {
    return new ToStringer(RegisteredModelPermissionsRequestPb.class)
        .add("accessControlList", accessControlList)
        .add("registeredModelId", registeredModelId)
        .toString();
  }
}
