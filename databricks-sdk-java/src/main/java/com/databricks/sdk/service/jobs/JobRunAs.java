// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Write-only setting, available only in Create/Update/Reset and Submit calls.
 * Specifies the user or service principal that the job runs as. If not
 * specified, the job runs as the user who created the job.
 * 
 * Only `user_name` or `service_principal_name` can be specified. If both are
 * specified, an error is thrown.
 */
@Generated
public class JobRunAs {
  /**
   * Application ID of an active service principal. Setting this field requires
   * the `servicePrincipal/user` role.
   */
  @JsonProperty("service_principal_name")
  private String servicePrincipalName;
  
  /**
   * The email of an active workspace user. Non-admin users can only set this
   * field to their own email.
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
    && Objects.equals(userName, that.userName)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicePrincipalName, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(JobRunAs.class)
      .add("servicePrincipalName", servicePrincipalName)
      .add("userName", userName).toString();
  }
}
