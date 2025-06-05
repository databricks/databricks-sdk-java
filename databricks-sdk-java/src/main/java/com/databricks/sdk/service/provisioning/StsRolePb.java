// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class StsRolePb {
  @JsonProperty("external_id")
  private String externalId;

  @JsonProperty("role_arn")
  private String roleArn;

  public StsRolePb setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public StsRolePb setRoleArn(String roleArn) {
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
    StsRolePb that = (StsRolePb) o;
    return Objects.equals(externalId, that.externalId) && Objects.equals(roleArn, that.roleArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, roleArn);
  }

  @Override
  public String toString() {
    return new ToStringer(StsRolePb.class)
        .add("externalId", externalId)
        .add("roleArn", roleArn)
        .toString();
  }
}
