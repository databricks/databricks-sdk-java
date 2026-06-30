// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GcpServiceAccount {
  /** */
  @JsonProperty("service_account_email")
  private String serviceAccountEmail;

  public GcpServiceAccount setServiceAccountEmail(String serviceAccountEmail) {
    this.serviceAccountEmail = serviceAccountEmail;
    return this;
  }

  public String getServiceAccountEmail() {
    return serviceAccountEmail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GcpServiceAccount that = (GcpServiceAccount) o;
    return Objects.equals(serviceAccountEmail, that.serviceAccountEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceAccountEmail);
  }

  @Override
  public String toString() {
    return new ToStringer(GcpServiceAccount.class)
        .add("serviceAccountEmail", serviceAccountEmail)
        .toString();
  }
}
