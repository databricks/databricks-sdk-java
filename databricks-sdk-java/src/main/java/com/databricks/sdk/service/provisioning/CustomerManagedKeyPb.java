// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class CustomerManagedKeyPb {
  @JsonProperty("account_id")
  private String accountId;

  @JsonProperty("aws_key_info")
  private AwsKeyInfo awsKeyInfo;

  @JsonProperty("creation_time")
  private Long creationTime;

  @JsonProperty("customer_managed_key_id")
  private String customerManagedKeyId;

  @JsonProperty("gcp_key_info")
  private GcpKeyInfo gcpKeyInfo;

  @JsonProperty("use_cases")
  private Collection<KeyUseCase> useCases;

  public CustomerManagedKeyPb setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public CustomerManagedKeyPb setAwsKeyInfo(AwsKeyInfo awsKeyInfo) {
    this.awsKeyInfo = awsKeyInfo;
    return this;
  }

  public AwsKeyInfo getAwsKeyInfo() {
    return awsKeyInfo;
  }

  public CustomerManagedKeyPb setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public CustomerManagedKeyPb setCustomerManagedKeyId(String customerManagedKeyId) {
    this.customerManagedKeyId = customerManagedKeyId;
    return this;
  }

  public String getCustomerManagedKeyId() {
    return customerManagedKeyId;
  }

  public CustomerManagedKeyPb setGcpKeyInfo(GcpKeyInfo gcpKeyInfo) {
    this.gcpKeyInfo = gcpKeyInfo;
    return this;
  }

  public GcpKeyInfo getGcpKeyInfo() {
    return gcpKeyInfo;
  }

  public CustomerManagedKeyPb setUseCases(Collection<KeyUseCase> useCases) {
    this.useCases = useCases;
    return this;
  }

  public Collection<KeyUseCase> getUseCases() {
    return useCases;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerManagedKeyPb that = (CustomerManagedKeyPb) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(awsKeyInfo, that.awsKeyInfo)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(customerManagedKeyId, that.customerManagedKeyId)
        && Objects.equals(gcpKeyInfo, that.gcpKeyInfo)
        && Objects.equals(useCases, that.useCases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId, awsKeyInfo, creationTime, customerManagedKeyId, gcpKeyInfo, useCases);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerManagedKeyPb.class)
        .add("accountId", accountId)
        .add("awsKeyInfo", awsKeyInfo)
        .add("creationTime", creationTime)
        .add("customerManagedKeyId", customerManagedKeyId)
        .add("gcpKeyInfo", gcpKeyInfo)
        .add("useCases", useCases)
        .toString();
  }
}
