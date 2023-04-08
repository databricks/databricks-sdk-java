// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.fasterxml.jackson.annotation.JsonProperty;

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
  private java.util.List<KeyUseCase> useCases;

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

  public CustomerManagedKey setUseCases(java.util.List<KeyUseCase> useCases) {
    this.useCases = useCases;
    return this;
  }

  public java.util.List<KeyUseCase> getUseCases() {
    return useCases;
  }
}
