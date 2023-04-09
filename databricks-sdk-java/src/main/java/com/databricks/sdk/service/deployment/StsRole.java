// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  public StsRole setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public StsRole setRoleArn(String roleArn) {
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
    StsRole that = (StsRole) o;
    return Objects.equals(externalId, that.externalId) && Objects.equals(roleArn, that.roleArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, roleArn);
  }

  @Override
  public String toString() {
    return new ToStringer(StsRole.class)
        .add("externalId", externalId)
        .add("roleArn", roleArn)
        .toString();
  }
}
