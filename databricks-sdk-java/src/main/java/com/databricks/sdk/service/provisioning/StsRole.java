// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>StsRole class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class StsRole {
  /**
   * The external ID that needs to be trusted by the cross-account role. This is always your
   * Databricks account ID.
   */
  @JsonProperty("external_id")
  private String externalId;

  /** The Amazon Resource Name (ARN) of the cross account role. */
  @JsonProperty("role_arn")
  private String roleArn;

  /**
   * <p>Setter for the field <code>externalId</code>.</p>
   *
   * @param externalId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.StsRole} object
   */
  public StsRole setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * <p>Getter for the field <code>externalId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getExternalId() {
    return externalId;
  }

  /**
   * <p>Setter for the field <code>roleArn</code>.</p>
   *
   * @param roleArn a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.StsRole} object
   */
  public StsRole setRoleArn(String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  /**
   * <p>Getter for the field <code>roleArn</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRoleArn() {
    return roleArn;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StsRole that = (StsRole) o;
    return Objects.equals(externalId, that.externalId) && Objects.equals(roleArn, that.roleArn);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(externalId, roleArn);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(StsRole.class)
        .add("externalId", externalId)
        .add("roleArn", roleArn)
        .toString();
  }
}
