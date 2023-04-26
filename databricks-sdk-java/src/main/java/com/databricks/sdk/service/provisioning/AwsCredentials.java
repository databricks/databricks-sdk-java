// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>AwsCredentials class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class AwsCredentials {
  /** */
  @JsonProperty("sts_role")
  private StsRole stsRole;

  /**
   * <p>Setter for the field <code>stsRole</code>.</p>
   *
   * @param stsRole a {@link com.databricks.sdk.service.provisioning.StsRole} object
   * @return a {@link com.databricks.sdk.service.provisioning.AwsCredentials} object
   */
  public AwsCredentials setStsRole(StsRole stsRole) {
    this.stsRole = stsRole;
    return this;
  }

  /**
   * <p>Getter for the field <code>stsRole</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.StsRole} object
   */
  public StsRole getStsRole() {
    return stsRole;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AwsCredentials that = (AwsCredentials) o;
    return Objects.equals(stsRole, that.stsRole);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(stsRole);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(AwsCredentials.class).add("stsRole", stsRole).toString();
  }
}
