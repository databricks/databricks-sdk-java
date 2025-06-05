// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get registered model permissions */
@Generated
class GetRegisteredModelPermissionsRequestPb {
  @JsonIgnore private String registeredModelId;

  public GetRegisteredModelPermissionsRequestPb setRegisteredModelId(String registeredModelId) {
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
    GetRegisteredModelPermissionsRequestPb that = (GetRegisteredModelPermissionsRequestPb) o;
    return Objects.equals(registeredModelId, that.registeredModelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registeredModelId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRegisteredModelPermissionsRequestPb.class)
        .add("registeredModelId", registeredModelId)
        .toString();
  }
}
