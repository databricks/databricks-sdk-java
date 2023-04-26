// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>RemoveInstanceProfile class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RemoveInstanceProfile {
  /** The ARN of the instance profile to remove. This field is required. */
  @JsonProperty("instance_profile_arn")
  private String instanceProfileArn;

  /**
   * <p>Setter for the field <code>instanceProfileArn</code>.</p>
   *
   * @param instanceProfileArn a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.RemoveInstanceProfile} object
   */
  public RemoveInstanceProfile setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  /**
   * <p>Getter for the field <code>instanceProfileArn</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RemoveInstanceProfile that = (RemoveInstanceProfile) o;
    return Objects.equals(instanceProfileArn, that.instanceProfileArn);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(instanceProfileArn);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RemoveInstanceProfile.class)
        .add("instanceProfileArn", instanceProfileArn)
        .toString();
  }
}
