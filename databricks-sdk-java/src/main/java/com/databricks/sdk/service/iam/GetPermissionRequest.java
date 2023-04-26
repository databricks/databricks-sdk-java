// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get object permissions
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetPermissionRequest {
  /** */
  private String requestObjectId;

  /** <needs content> */
  private String requestObjectType;

  /**
   * <p>Setter for the field <code>requestObjectId</code>.</p>
   *
   * @param requestObjectId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.GetPermissionRequest} object
   */
  public GetPermissionRequest setRequestObjectId(String requestObjectId) {
    this.requestObjectId = requestObjectId;
    return this;
  }

  /**
   * <p>Getter for the field <code>requestObjectId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRequestObjectId() {
    return requestObjectId;
  }

  /**
   * <p>Setter for the field <code>requestObjectType</code>.</p>
   *
   * @param requestObjectType a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.GetPermissionRequest} object
   */
  public GetPermissionRequest setRequestObjectType(String requestObjectType) {
    this.requestObjectType = requestObjectType;
    return this;
  }

  /**
   * <p>Getter for the field <code>requestObjectType</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRequestObjectType() {
    return requestObjectType;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPermissionRequest that = (GetPermissionRequest) o;
    return Objects.equals(requestObjectId, that.requestObjectId)
        && Objects.equals(requestObjectType, that.requestObjectType);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(requestObjectId, requestObjectType);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetPermissionRequest.class)
        .add("requestObjectId", requestObjectId)
        .add("requestObjectType", requestObjectType)
        .toString();
  }
}
