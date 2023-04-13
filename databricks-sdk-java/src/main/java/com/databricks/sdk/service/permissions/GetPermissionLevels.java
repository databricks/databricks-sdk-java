// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get permission levels */
public class GetPermissionLevels {
  /** <needs content> */
  private String requestObjectId;

  /** <needs content> */
  private String requestObjectType;

  public GetPermissionLevels setRequestObjectId(String requestObjectId) {
    this.requestObjectId = requestObjectId;
    return this;
  }

  public String getRequestObjectId() {
    return requestObjectId;
  }

  public GetPermissionLevels setRequestObjectType(String requestObjectType) {
    this.requestObjectType = requestObjectType;
    return this;
  }

  public String getRequestObjectType() {
    return requestObjectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPermissionLevels that = (GetPermissionLevels) o;
    return Objects.equals(requestObjectId, that.requestObjectId)
        && Objects.equals(requestObjectType, that.requestObjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestObjectId, requestObjectType);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPermissionLevels.class)
        .add("requestObjectId", requestObjectId)
        .add("requestObjectType", requestObjectType)
        .toString();
  }
}
