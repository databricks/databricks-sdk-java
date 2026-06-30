// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetRegisteredModelPermissionsRequest {
  /** The registered model for which to get or manage permissions. */
  @JsonIgnore private String registeredModelId;

  public GetRegisteredModelPermissionsRequest setRegisteredModelId(String registeredModelId) {
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
    GetRegisteredModelPermissionsRequest that = (GetRegisteredModelPermissionsRequest) o;
    return Objects.equals(registeredModelId, that.registeredModelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registeredModelId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRegisteredModelPermissionsRequest.class)
        .add("registeredModelId", registeredModelId)
        .toString();
  }
}
