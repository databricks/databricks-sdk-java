// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
