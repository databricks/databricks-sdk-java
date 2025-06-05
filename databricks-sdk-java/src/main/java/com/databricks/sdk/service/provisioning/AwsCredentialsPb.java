// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AwsCredentialsPb {
  @JsonProperty("sts_role")
  private StsRole stsRole;

  public AwsCredentialsPb setStsRole(StsRole stsRole) {
    this.stsRole = stsRole;
    return this;
  }

  public StsRole getStsRole() {
    return stsRole;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AwsCredentialsPb that = (AwsCredentialsPb) o;
    return Objects.equals(stsRole, that.stsRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stsRole);
  }

  @Override
  public String toString() {
    return new ToStringer(AwsCredentialsPb.class).add("stsRole", stsRole).toString();
  }
}
