// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get permissions
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetGrantRequest {
  /** Full name of securable. */
  private String fullName;

  /** If provided, only the permissions for the specified principal (user or group) are returned. */
  @QueryParam("principal")
  private String principal;

  /** Type of securable. */
  private SecurableType securableType;

  /**
   * <p>Setter for the field <code>fullName</code>.</p>
   *
   * @param fullName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.GetGrantRequest} object
   */
  public GetGrantRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * <p>Getter for the field <code>fullName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getFullName() {
    return fullName;
  }

  /**
   * <p>Setter for the field <code>principal</code>.</p>
   *
   * @param principal a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.GetGrantRequest} object
   */
  public GetGrantRequest setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  /**
   * <p>Getter for the field <code>principal</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPrincipal() {
    return principal;
  }

  /**
   * <p>Setter for the field <code>securableType</code>.</p>
   *
   * @param securableType a {@link com.databricks.sdk.service.catalog.SecurableType} object
   * @return a {@link com.databricks.sdk.service.catalog.GetGrantRequest} object
   */
  public GetGrantRequest setSecurableType(SecurableType securableType) {
    this.securableType = securableType;
    return this;
  }

  /**
   * <p>Getter for the field <code>securableType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.SecurableType} object
   */
  public SecurableType getSecurableType() {
    return securableType;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetGrantRequest that = (GetGrantRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(principal, that.principal)
        && Objects.equals(securableType, that.securableType);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(fullName, principal, securableType);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetGrantRequest.class)
        .add("fullName", fullName)
        .add("principal", principal)
        .add("securableType", securableType)
        .toString();
  }
}
