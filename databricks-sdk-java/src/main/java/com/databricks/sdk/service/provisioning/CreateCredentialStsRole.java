// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateCredentialStsRole {
  /** The Amazon Resource Name (ARN) of the cross account role. */
  @JsonProperty("role_arn")
  private String roleArn;

  public CreateCredentialStsRole setRoleArn(String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  public String getRoleArn() {
    return roleArn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCredentialStsRole that = (CreateCredentialStsRole) o;
    return Objects.equals(roleArn, that.roleArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleArn);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCredentialStsRole.class).add("roleArn", roleArn).toString();
  }
}
