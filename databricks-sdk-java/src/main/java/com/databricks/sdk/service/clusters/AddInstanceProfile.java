// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class AddInstanceProfile {
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
   * By default, Databricks validates that it has sufficient permissions to launch instances with
   * the instance profile. This validation uses AWS dry-run mode for the RunInstances API. If
   * validation fails with an error message that does not indicate an IAM related permission issue,
   * (e.g. `Your requested instance type is not supported in your requested availability zone`), you
   * can pass this flag to skip the validation and forcibly add the instance profile.
   */
  @JsonProperty("is_meta_instance_profile")
  private Boolean isMetaInstanceProfile;

  /**
   * By default, Databricks validates that it has sufficient permissions to launch instances with
   * the instance profile. This validation uses AWS dry-run mode for the RunInstances API. If
   * validation fails with an error message that does not indicate an IAM related permission issue,
   * (e.g. “Your requested instance type is not supported in your requested availability zone”), you
   * can pass this flag to skip the validation and forcibly add the instance profile.
   */
  @JsonProperty("skip_validation")
  private Boolean skipValidation;

  public AddInstanceProfile setIamRoleArn(String iamRoleArn) {
    this.iamRoleArn = iamRoleArn;
    return this;
  }

  public String getIamRoleArn() {
    return iamRoleArn;
  }

  public AddInstanceProfile setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  public AddInstanceProfile setIsMetaInstanceProfile(Boolean isMetaInstanceProfile) {
    this.isMetaInstanceProfile = isMetaInstanceProfile;
    return this;
  }

  public Boolean getIsMetaInstanceProfile() {
    return isMetaInstanceProfile;
  }

  public AddInstanceProfile setSkipValidation(Boolean skipValidation) {
    this.skipValidation = skipValidation;
    return this;
  }

  public Boolean getSkipValidation() {
    return skipValidation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AddInstanceProfile that = (AddInstanceProfile) o;
    return Objects.equals(iamRoleArn, that.iamRoleArn)
        && Objects.equals(instanceProfileArn, that.instanceProfileArn)
        && Objects.equals(isMetaInstanceProfile, that.isMetaInstanceProfile)
        && Objects.equals(skipValidation, that.skipValidation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iamRoleArn, instanceProfileArn, isMetaInstanceProfile, skipValidation);
  }

  @Override
  public String toString() {
    return new ToStringer(AddInstanceProfile.class)
        .add("iamRoleArn", iamRoleArn)
        .add("instanceProfileArn", instanceProfileArn)
        .add("isMetaInstanceProfile", isMetaInstanceProfile)
        .add("skipValidation", skipValidation)
        .toString();
  }
}
