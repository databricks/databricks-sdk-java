// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class AwsCredentials {
  /** */
  @JsonProperty("sts_role")
  private StsRole stsRole;

  public AwsCredentials setStsRole(StsRole stsRole) {
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
    AwsCredentials that = (AwsCredentials) o;
    return Objects.equals(stsRole, that.stsRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stsRole);
  }

  @Override
  public String toString() {
    return new ToStringer(AwsCredentials.class).add("stsRole", stsRole).toString();
  }
}
