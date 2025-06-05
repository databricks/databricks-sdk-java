// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class RemoveInstanceProfilePb {
  @JsonProperty("instance_profile_arn")
  private String instanceProfileArn;

  public RemoveInstanceProfilePb setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RemoveInstanceProfilePb that = (RemoveInstanceProfilePb) o;
    return Objects.equals(instanceProfileArn, that.instanceProfileArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceProfileArn);
  }

  @Override
  public String toString() {
    return new ToStringer(RemoveInstanceProfilePb.class)
        .add("instanceProfileArn", instanceProfileArn)
        .toString();
  }
}
