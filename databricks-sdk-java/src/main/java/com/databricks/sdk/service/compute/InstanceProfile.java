// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class InstanceProfile {
  /**
   * The AWS IAM role ARN of the role associated with the instance profile. This field is required
   * if your role name and instance profile name do not match and you want to use the instance
   * profile with [Databricks SQL Serverless].
   *
   * <p>Otherwise, this field is optional.
   *
   * <p>[Databricks SQL Serverless]: https://docs.databricks.com/sql/admin/serverless.html
   */
  @JsonProperty("iam_role_arn")
  private String iamRoleArn;

  /** The AWS ARN of the instance profile to register with Databricks. This field is required. */
  @JsonProperty("instance_profile_arn")
  private String instanceProfileArn;

  /**
   * Boolean flag indicating whether the instance profile should only be used in credential
   * passthrough scenarios. If true, it means the instance profile contains an meta IAM role which
   * could assume a wide range of roles. Therefore it should always be used with authorization. This
   * field is optional, the default value is `false`.
   */
  @JsonProperty("is_meta_instance_profile")
  private Boolean isMetaInstanceProfile;

  public InstanceProfile setIamRoleArn(String iamRoleArn) {
    this.iamRoleArn = iamRoleArn;
    return this;
  }

  public String getIamRoleArn() {
    return iamRoleArn;
  }

  public InstanceProfile setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  public InstanceProfile setIsMetaInstanceProfile(Boolean isMetaInstanceProfile) {
    this.isMetaInstanceProfile = isMetaInstanceProfile;
    return this;
  }

  public Boolean getIsMetaInstanceProfile() {
    return isMetaInstanceProfile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstanceProfile that = (InstanceProfile) o;
    return Objects.equals(iamRoleArn, that.iamRoleArn)
        && Objects.equals(instanceProfileArn, that.instanceProfileArn)
        && Objects.equals(isMetaInstanceProfile, that.isMetaInstanceProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iamRoleArn, instanceProfileArn, isMetaInstanceProfile);
  }

  @Override
  public String toString() {
    return new ToStringer(InstanceProfile.class)
        .add("iamRoleArn", iamRoleArn)
        .add("instanceProfileArn", instanceProfileArn)
        .add("isMetaInstanceProfile", isMetaInstanceProfile)
        .toString();
  }
}
