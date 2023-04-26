// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>CustomerManagedKey class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>accountId</code>.</p>
   *
   * @param accountId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.CustomerManagedKey} object
   */
  public CustomerManagedKey setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <p>Getter for the field <code>accountId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAccountId() {
    return accountId;
  }

  /**
   * <p>Setter for the field <code>awsKeyInfo</code>.</p>
   *
   * @param awsKeyInfo a {@link com.databricks.sdk.service.provisioning.AwsKeyInfo} object
   * @return a {@link com.databricks.sdk.service.provisioning.CustomerManagedKey} object
   */
  public CustomerManagedKey setAwsKeyInfo(AwsKeyInfo awsKeyInfo) {
    this.awsKeyInfo = awsKeyInfo;
    return this;
  }

  /**
   * <p>Getter for the field <code>awsKeyInfo</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.AwsKeyInfo} object
   */
  public AwsKeyInfo getAwsKeyInfo() {
    return awsKeyInfo;
  }

  /**
   * <p>Setter for the field <code>creationTime</code>.</p>
   *
   * @param creationTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.provisioning.CustomerManagedKey} object
   */
  public CustomerManagedKey setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>creationTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreationTime() {
    return creationTime;
  }

  /**
   * <p>Setter for the field <code>customerManagedKeyId</code>.</p>
   *
   * @param customerManagedKeyId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.CustomerManagedKey} object
   */
  public CustomerManagedKey setCustomerManagedKeyId(String customerManagedKeyId) {
    this.customerManagedKeyId = customerManagedKeyId;
    return this;
  }

  /**
   * <p>Getter for the field <code>customerManagedKeyId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCustomerManagedKeyId() {
    return customerManagedKeyId;
  }

  /**
   * <p>Setter for the field <code>useCases</code>.</p>
   *
   * @param useCases a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.provisioning.CustomerManagedKey} object
   */
  public CustomerManagedKey setUseCases(Collection<KeyUseCase> useCases) {
    this.useCases = useCases;
    return this;
  }

  /**
   * <p>Getter for the field <code>useCases</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<KeyUseCase> getUseCases() {
    return useCases;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(accountId, awsKeyInfo, creationTime, customerManagedKeyId, useCases);
  }

  /** {@inheritDoc} */
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
