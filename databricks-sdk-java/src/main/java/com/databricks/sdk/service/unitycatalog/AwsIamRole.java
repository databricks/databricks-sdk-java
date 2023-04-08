// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AwsIamRole {
  /** The external ID used in role assumption to prevent confused deputy problem.. */
  @JsonProperty("external_id")
  private String externalId;

  /** The Amazon Resource Name (ARN) of the AWS IAM role for S3 data access. */
  @JsonProperty("role_arn")
  private String roleArn;

  /**
   * The Amazon Resource Name (ARN) of the AWS IAM user managed by Databricks. This is the identity
   * that is going to assume the AWS IAM role.
   */
  @JsonProperty("unity_catalog_iam_arn")
  private String unityCatalogIamArn;

  public AwsIamRole setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public AwsIamRole setRoleArn(String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  public String getRoleArn() {
    return roleArn;
  }

  public AwsIamRole setUnityCatalogIamArn(String unityCatalogIamArn) {
    this.unityCatalogIamArn = unityCatalogIamArn;
    return this;
  }

  public String getUnityCatalogIamArn() {
    return unityCatalogIamArn;
  }
}
