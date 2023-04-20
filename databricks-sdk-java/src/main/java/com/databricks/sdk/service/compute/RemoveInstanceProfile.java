// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class RemoveInstanceProfile {
  /** The ARN of the instance profile to remove. This field is required. */
  @JsonProperty("instance_profile_arn")
  private String instanceProfileArn;

  public RemoveInstanceProfile setInstanceProfileArn(String instanceProfileArn) {
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
    RemoveInstanceProfile that = (RemoveInstanceProfile) o;
    return Objects.equals(instanceProfileArn, that.instanceProfileArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceProfileArn);
  }

  @Override
  public String toString() {
    return new ToStringer(RemoveInstanceProfile.class)
        .add("instanceProfileArn", instanceProfileArn)
        .toString();
  }
}
