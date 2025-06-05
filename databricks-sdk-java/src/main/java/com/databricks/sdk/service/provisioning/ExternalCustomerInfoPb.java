// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ExternalCustomerInfoPb {
  @JsonProperty("authoritative_user_email")
  private String authoritativeUserEmail;

  @JsonProperty("authoritative_user_full_name")
  private String authoritativeUserFullName;

  @JsonProperty("customer_name")
  private String customerName;

  public ExternalCustomerInfoPb setAuthoritativeUserEmail(String authoritativeUserEmail) {
    this.authoritativeUserEmail = authoritativeUserEmail;
    return this;
  }

  public String getAuthoritativeUserEmail() {
    return authoritativeUserEmail;
  }

  public ExternalCustomerInfoPb setAuthoritativeUserFullName(String authoritativeUserFullName) {
    this.authoritativeUserFullName = authoritativeUserFullName;
    return this;
  }

  public String getAuthoritativeUserFullName() {
    return authoritativeUserFullName;
  }

  public ExternalCustomerInfoPb setCustomerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

  public String getCustomerName() {
    return customerName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalCustomerInfoPb that = (ExternalCustomerInfoPb) o;
    return Objects.equals(authoritativeUserEmail, that.authoritativeUserEmail)
        && Objects.equals(authoritativeUserFullName, that.authoritativeUserFullName)
        && Objects.equals(customerName, that.customerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authoritativeUserEmail, authoritativeUserFullName, customerName);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalCustomerInfoPb.class)
        .add("authoritativeUserEmail", authoritativeUserEmail)
        .add("authoritativeUserFullName", authoritativeUserFullName)
        .add("customerName", customerName)
        .toString();
  }
}
