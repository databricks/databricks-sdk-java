// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class CreateCustomerManagedKeyRequest {
  /** */
  @JsonProperty("aws_key_info")
  private CreateAwsKeyInfo awsKeyInfo;

  /** The cases that the key can be used for. */
  @JsonProperty("use_cases")
  private Collection<KeyUseCase> useCases;

  public CreateCustomerManagedKeyRequest setAwsKeyInfo(CreateAwsKeyInfo awsKeyInfo) {
    this.awsKeyInfo = awsKeyInfo;
    return this;
  }

  public CreateAwsKeyInfo getAwsKeyInfo() {
    return awsKeyInfo;
  }

  public CreateCustomerManagedKeyRequest setUseCases(Collection<KeyUseCase> useCases) {
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
    CreateCustomerManagedKeyRequest that = (CreateCustomerManagedKeyRequest) o;
    return Objects.equals(awsKeyInfo, that.awsKeyInfo) && Objects.equals(useCases, that.useCases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsKeyInfo, useCases);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCustomerManagedKeyRequest.class)
        .add("awsKeyInfo", awsKeyInfo)
        .add("useCases", useCases)
        .toString();
  }
}
