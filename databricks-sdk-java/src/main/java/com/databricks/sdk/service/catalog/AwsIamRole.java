// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>AwsIamRole class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>externalId</code>.</p>
   *
   * @param externalId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.AwsIamRole} object
   */
  public AwsIamRole setExternalId(String externalId) {
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
   * @return a {@link com.databricks.sdk.service.catalog.AwsIamRole} object
   */
  public AwsIamRole setRoleArn(String roleArn) {
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

  /**
   * <p>Setter for the field <code>unityCatalogIamArn</code>.</p>
   *
   * @param unityCatalogIamArn a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.AwsIamRole} object
   */
  public AwsIamRole setUnityCatalogIamArn(String unityCatalogIamArn) {
    this.unityCatalogIamArn = unityCatalogIamArn;
    return this;
  }

  /**
   * <p>Getter for the field <code>unityCatalogIamArn</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUnityCatalogIamArn() {
    return unityCatalogIamArn;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AwsIamRole that = (AwsIamRole) o;
    return Objects.equals(externalId, that.externalId)
        && Objects.equals(roleArn, that.roleArn)
        && Objects.equals(unityCatalogIamArn, that.unityCatalogIamArn);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(externalId, roleArn, unityCatalogIamArn);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(AwsIamRole.class)
        .add("externalId", externalId)
        .add("roleArn", roleArn)
        .add("unityCatalogIamArn", unityCatalogIamArn)
        .toString();
  }
}
