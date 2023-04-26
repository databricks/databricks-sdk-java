// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateCredentialAwsCredentials class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateCredentialAwsCredentials {
  /** */
  @JsonProperty("sts_role")
  private CreateCredentialStsRole stsRole;

  /**
   * <p>Setter for the field <code>stsRole</code>.</p>
   *
   * @param stsRole a {@link com.databricks.sdk.service.provisioning.CreateCredentialStsRole} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateCredentialAwsCredentials} object
   */
  public CreateCredentialAwsCredentials setStsRole(CreateCredentialStsRole stsRole) {
    this.stsRole = stsRole;
    return this;
  }

  /**
   * <p>Getter for the field <code>stsRole</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.CreateCredentialStsRole} object
   */
  public CreateCredentialStsRole getStsRole() {
    return stsRole;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCredentialAwsCredentials that = (CreateCredentialAwsCredentials) o;
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
    return new ToStringer(CreateCredentialAwsCredentials.class).add("stsRole", stsRole).toString();
  }
}
