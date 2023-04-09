// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class CustomerManagedKey {
  /** The Databricks account ID that holds the customer-managed key. */
  @JsonProperty("account_id")
  private String accountId;

  /** */
  @JsonProperty("aws_key_info")
  private AwsKeyInfo awsKeyInfo;

  /** Time in epoch milliseconds when the customer key was created. */
  @JsonProperty("creation_time")
  private Long creationTime;

  /** ID of the encryption key configuration object. */
  @JsonProperty("customer_managed_key_id")
  private String customerManagedKeyId;

  /** The cases that the key can be used for. */
  @JsonProperty("use_cases")
  private Collection<KeyUseCase> useCases;

  public CustomerManagedKey setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public CustomerManagedKey setAwsKeyInfo(AwsKeyInfo awsKeyInfo) {
    this.awsKeyInfo = awsKeyInfo;
    return this;
  }

  public AwsKeyInfo getAwsKeyInfo() {
    return awsKeyInfo;
  }

  public CustomerManagedKey setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public CustomerManagedKey setCustomerManagedKeyId(String customerManagedKeyId) {
    this.customerManagedKeyId = customerManagedKeyId;
    return this;
  }

  public String getCustomerManagedKeyId() {
    return customerManagedKeyId;
  }

  public CustomerManagedKey setUseCases(Collection<KeyUseCase> useCases) {
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
    CustomerManagedKey that = (CustomerManagedKey) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(awsKeyInfo, that.awsKeyInfo)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(customerManagedKeyId, that.customerManagedKeyId)
        && Objects.equals(useCases, that.useCases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, awsKeyInfo, creationTime, customerManagedKeyId, useCases);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerManagedKey.class)
        .add("accountId", accountId)
        .add("awsKeyInfo", awsKeyInfo)
        .add("creationTime", creationTime)
        .add("customerManagedKeyId", customerManagedKeyId)
        .add("useCases", useCases)
        .toString();
  }
}
