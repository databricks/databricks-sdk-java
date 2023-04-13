// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get object permissions */
public class Get {
  /** */
  private String requestObjectId;

  /** <needs content> */
  private String requestObjectType;

  public Get setRequestObjectId(String requestObjectId) {
    this.requestObjectId = requestObjectId;
    return this;
  }

  public String getRequestObjectId() {
    return requestObjectId;
  }

  public Get setRequestObjectType(String requestObjectType) {
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
    Get that = (Get) o;
    return Objects.equals(requestObjectId, that.requestObjectId)
        && Objects.equals(requestObjectType, that.requestObjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestObjectId, requestObjectType);
  }

  @Override
  public String toString() {
    return new ToStringer(Get.class)
        .add("requestObjectId", requestObjectId)
        .add("requestObjectType", requestObjectType)
        .toString();
  }
}
