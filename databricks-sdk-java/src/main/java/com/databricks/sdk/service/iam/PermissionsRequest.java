// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>PermissionsRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PermissionsRequest {
  /** */
  @JsonProperty("access_control_list")
  private Collection<AccessControlRequest> accessControlList;

  /** */
  private String requestObjectId;

  /** <needs content> */
  private String requestObjectType;

  /**
   * <p>Setter for the field <code>accessControlList</code>.</p>
   *
   * @param accessControlList a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.iam.PermissionsRequest} object
   */
  public PermissionsRequest setAccessControlList(
      Collection<AccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  /**
   * <p>Getter for the field <code>accessControlList</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<AccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  /**
   * <p>Setter for the field <code>requestObjectId</code>.</p>
   *
   * @param requestObjectId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.PermissionsRequest} object
   */
  public PermissionsRequest setRequestObjectId(String requestObjectId) {
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
   * @return a {@link com.databricks.sdk.service.iam.PermissionsRequest} object
   */
  public PermissionsRequest setRequestObjectType(String requestObjectType) {
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
    PermissionsRequest that = (PermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(requestObjectId, that.requestObjectId)
        && Objects.equals(requestObjectType, that.requestObjectType);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, requestObjectId, requestObjectType);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("requestObjectId", requestObjectId)
        .add("requestObjectType", requestObjectType)
        .toString();
  }
}
