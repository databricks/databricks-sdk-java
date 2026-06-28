// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The AWS IAM role configuration */
@Generated
public class AwsIamRoleRequest {
  /** The Amazon Resource Name (ARN) of the AWS IAM role used to vend temporary credentials. */
  @JsonProperty("role_arn")
  private String roleArn;

  public AwsIamRoleRequest setRoleArn(String roleArn) {
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
    AwsIamRoleRequest that = (AwsIamRoleRequest) o;
    return Objects.equals(roleArn, that.roleArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleArn);
  }

  @Override
  public String toString() {
    return new ToStringer(AwsIamRoleRequest.class).add("roleArn", roleArn).toString();
  }
}
