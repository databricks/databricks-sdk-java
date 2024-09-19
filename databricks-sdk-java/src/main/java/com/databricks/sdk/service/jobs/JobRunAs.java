// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Write-only setting. Specifies the user, service principal or group that the job/pipeline runs as.
 * If not specified, the job/pipeline runs as the user who created the job/pipeline.
 *
 * <p>Exactly one of `user_name`, `service_principal_name`, `group_name` should be specified. If
 * not, an error is thrown.
 */
@Generated
public class JobRunAs {
  /**
   * Application ID of an active service principal. Setting this field requires the
   * `servicePrincipal/user` role.
   */
  @JsonProperty("service_principal_name")
  private String servicePrincipalName;

  /**
   * The email of an active workspace user. Non-admin users can only set this field to their own
   * email.
   */
  @JsonProperty("user_name")
  private String userName;

  public JobRunAs setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public JobRunAs setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public String getUserName() {
    return userName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobRunAs that = (JobRunAs) o;
    return Objects.equals(servicePrincipalName, that.servicePrincipalName)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicePrincipalName, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(JobRunAs.class)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }
}
