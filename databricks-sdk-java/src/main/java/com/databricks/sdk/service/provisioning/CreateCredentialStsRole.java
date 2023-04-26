// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateCredentialStsRole class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateCredentialStsRole {
  /** The Amazon Resource Name (ARN) of the cross account role. */
  @JsonProperty("role_arn")
  private String roleArn;

  /**
   * <p>Setter for the field <code>roleArn</code>.</p>
   *
   * @param roleArn a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateCredentialStsRole} object
   */
  public CreateCredentialStsRole setRoleArn(String roleArn) {
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
    CreateCredentialStsRole that = (CreateCredentialStsRole) o;
    return Objects.equals(roleArn, that.roleArn);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(roleArn);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateCredentialStsRole.class).add("roleArn", roleArn).toString();
  }
}
