// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>CreateCustomerManagedKeyRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateCustomerManagedKeyRequest {
  /** */
  @JsonProperty("aws_key_info")
  private CreateAwsKeyInfo awsKeyInfo;

  /** The cases that the key can be used for. */
  @JsonProperty("use_cases")
  private Collection<KeyUseCase> useCases;

  /**
   * <p>Setter for the field <code>awsKeyInfo</code>.</p>
   *
   * @param awsKeyInfo a {@link com.databricks.sdk.service.provisioning.CreateAwsKeyInfo} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateCustomerManagedKeyRequest} object
   */
  public CreateCustomerManagedKeyRequest setAwsKeyInfo(CreateAwsKeyInfo awsKeyInfo) {
    this.awsKeyInfo = awsKeyInfo;
    return this;
  }

  /**
   * <p>Getter for the field <code>awsKeyInfo</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.CreateAwsKeyInfo} object
   */
  public CreateAwsKeyInfo getAwsKeyInfo() {
    return awsKeyInfo;
  }

  /**
   * <p>Setter for the field <code>useCases</code>.</p>
   *
   * @param useCases a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateCustomerManagedKeyRequest} object
   */
  public CreateCustomerManagedKeyRequest setUseCases(Collection<KeyUseCase> useCases) {
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
    CreateCustomerManagedKeyRequest that = (CreateCustomerManagedKeyRequest) o;
    return Objects.equals(awsKeyInfo, that.awsKeyInfo) && Objects.equals(useCases, that.useCases);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(awsKeyInfo, useCases);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateCustomerManagedKeyRequest.class)
        .add("awsKeyInfo", awsKeyInfo)
        .add("useCases", useCases)
        .toString();
  }
}
